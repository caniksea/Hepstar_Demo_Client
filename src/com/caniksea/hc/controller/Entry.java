package com.caniksea.hc.controller;

import com.caniksea.hc.models.globals.Age;
import com.caniksea.hc.models.globals.Contact;
import com.caniksea.hc.models.globals.DOB;
import com.caniksea.hc.models.globals.LocalResponse;
import com.caniksea.hc.models.request.*;
import com.caniksea.hc.models.response.PolicyCancellationResponse;
import com.caniksea.hc.models.response.PolicyResponse;
import com.caniksea.hc.models.response.ProductResponse;
import com.caniksea.hc.util.Misc;
import com.caniksea.hc.util.XMLConverter;

import java.util.Set;
import java.util.TreeSet;

public class Entry {

    public Authentication buildAuthentication(String currency, String locale) {
        String username = Misc.getPropertyValue("username");
        String password = Misc.getPropertyValue("password");
        String sessionId = Misc.getUniqueSessionID();
        String account = Misc.getPropertyValue("account");
        String channel = Misc.getPropertyValue("channel");

        account = account.isEmpty() ? null : account;
        channel = channel.isEmpty() ? null : channel;
        currency = currency.isEmpty() ? null : currency;
        locale = locale.isEmpty() ? null : locale;

        return new Authentication(account, channel, username, password, currency, locale, sessionId);
    }

    private Insured buildInsured(String firstName, String lastName, String nationalId, String passportNumber, String dob,
                                 String age, String residency, String gender, int id, String src) {
        if(residency.isEmpty() || gender.isEmpty()) return null;
        if(src.equals("product") && age.isEmpty()) return null;
        if(src.equals("policy") && (dob.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || nationalId.isEmpty() || passportNumber.isEmpty())) return null;

        Insured insured = new Insured();
        insured.setId(id == -1 ? Misc.getUniqueID() : id);
        insured.setResidency(residency);
        insured.setGender(gender);

        if(src.equals("product")) {
            Age a = new Age();
            a.setAge(age);
            insured.setAge(a);
        }else if(src.equals("policy")){
            DOB dateOfBirth = new DOB();
            dateOfBirth.setDob(dob);

            insured.setFirstName(firstName);
            insured.setSurname(lastName);
            insured.setDob(dateOfBirth);
            insured.setNationalId(nationalId);
            insured.setPassportNumber(passportNumber);
        }
        return insured;
    }

    public Personalisation buildPersonalisation(String type, String value) {
        if(type.isEmpty() || value.isEmpty()) return null;
        PersonalisationItem pi = new PersonalisationItem(type, value);
        Set<PersonalisationItem> pis = new TreeSet<>();
        pis.add(pi);
        Personalisation personalisation = new Personalisation();
        personalisation.setPersonalisationItems(pis);
        return personalisation;
    }

    public Personalisation addPersonalisation(Personalisation personalisation, String type, String value) {
        if(type.isEmpty() || value.isEmpty()) return personalisation;
        PersonalisationItem pi = new PersonalisationItem(type, value);
        Set<PersonalisationItem> pis = personalisation.getPersonalisationItems();
        pis.add(pi);
        personalisation.setPersonalisationItems(pis);
        return personalisation;
    }

    public SpecificTravelInformation buildTravelInfo(String travelInfo) {
        if(travelInfo.isEmpty()) return null;
        SpecificTravelInformation sti = new SpecificTravelInformation(travelInfo);
        return sti;
    }

    public Insureds buildInsureds(String firstName, String lastName, String nationalId, String passportNumber,
                                  String dob, String age, String residency, String gender, String src) {
        Insured insured = buildInsured(firstName, lastName, nationalId, passportNumber, dob, age, residency, gender, -1, src);
        if(insured == null) return null;
        Set<Insured> i = new TreeSet<>();
        i.add(insured);
        return new Insureds(i);
    }

    public Insured addInsured(String firstName, String lastName, String nationalId, String passportNumber, String dob, String age,
                              String residency, String gender, int id, String src) {
        return buildInsured(firstName, lastName, nationalId, passportNumber, dob, age, residency, gender, id, src);
    }

    public GlobalTravelInformation buildGTI(String departure, String startDate, String endDate, String bookingValue) {
        if(departure.isEmpty() || startDate.isEmpty()) return null;
        startDate = Misc.getDateFromInput(startDate);
//        Date eDate = null;
        endDate = endDate.isEmpty() ? null : Misc.getDateFromInput(endDate);
        bookingValue = bookingValue.isEmpty() ? null : bookingValue;
        GlobalTravelInformation gti = new GlobalTravelInformation();
        gti.setBookingValue(bookingValue);
        gti.setDepartureCountry(departure);
        gti.setEndDate(endDate);
        gti.setStartDate(startDate);
        return gti;
    }

    public CoverCountries buildCoverCountries(String coverCountry) {
        CoverCountry cc = buildCoverCountry(coverCountry);
        if(cc == null) return null;
        Set<CoverCountry> ccs = new TreeSet<>();
        ccs.add(cc);
        return new CoverCountries(ccs);
    }

    private CoverCountry buildCoverCountry(String coverCountry) {
        if(coverCountry.isEmpty()) return null;
        else return new CoverCountry(coverCountry);
    }

    public CoverCountries addCoverCountry(CoverCountries coverCountries, String coverCountry) {
        CoverCountry cc = buildCoverCountry(coverCountry);
        if(cc == null) return coverCountries;
        else{
            coverCountries.getCoverCountries().add(cc);
            return coverCountries;
        }
    }

    public ProductRequest buildRequest(Authentication authentication, Insureds insureds, GlobalTravelInformation gti) {
        ProductRequestParameters rp = new ProductRequestParameters(insureds, gti);
        return new ProductRequest(authentication, rp);
    }

    public LocalResponse sendPricedCall(Authentication authentication, Insureds insureds, GlobalTravelInformation gti) {
        ProductRequest r = buildRequest(authentication, insureds, gti);
        String xmlRequest = XMLConverter.jaxbObj2XML(r, ProductRequest.class);
        LocalResponse lr = new HepstarWSClient().callWS(Misc.getPropertyValue("productURL"), xmlRequest);
        if(lr.getObject() != null) {
            ProductResponse productResponse = (ProductResponse) XMLConverter.jaxbXML2Obj((String) lr.getObject(), ProductResponse.class);
            lr.setObject(productResponse);
        }
//        System.out.println(response);
        return lr;
    }

    private PolicyRequest buildPolicyRequest(String productCode) {
        if(productCode == null || productCode.isEmpty()) return null;
        PolicyRequest pr = new PolicyRequest();
        pr.setProductId(productCode);
        return pr;
    }

    public PolicyRequest initiatePolicyRequest(String productCode) {
        return buildPolicyRequest(productCode);
    }

    public LocalResponse sendPolicyCall(Authentication authentication, PolicyRequest pr, String distributorReference, String email, String cardType, String cardNumber,
                                        String cardHolder, String cvv, String month, String year) {
        if(email.isEmpty() || cardType.isEmpty() || cardNumber.isEmpty() || cardHolder.isEmpty()
                || cvv.isEmpty() || month.isEmpty() || year.isEmpty()) return null;
        Contact contact = new Contact();
        contact.setEmail(email);

        pr.setContactInformation(contact);
        pr.setDistributorReference(distributorReference.isEmpty() ? null : distributorReference);

        PolicyRequests prs = new PolicyRequests();
        Set<PolicyRequest> policyRequests = new TreeSet<>();
        policyRequests.add(pr);
        prs.setPolicyRequests(policyRequests);

        Payment payment = new Payment();
        payment.setCardHolder(cardHolder);
        payment.setCardNo(cardNumber);
        payment.setCardType(cardType);
        payment.setCvv(cvv);
        payment.setExpMonth(month);
        payment.setExpYear(year);

        PolicyRequestParameters prp = new PolicyRequestParameters();
        prp.setPayment(payment);
        prp.setPolicyRequests(prs);

        PolicyRequestObj pro = new PolicyRequestObj();
        pro.setAuthentication(authentication);
        pro.setPolicyRequestParameters(prp);

        String xmlRequest = XMLConverter.jaxbObj2XML(pro, PolicyRequestObj.class);
        LocalResponse lr = new HepstarWSClient().callWS(Misc.getPropertyValue("policeIssueURL"), xmlRequest);
        if(lr.getObject() != null) {
            PolicyResponse policyResponse = (PolicyResponse) XMLConverter.jaxbXML2Obj((String) lr.getObject(), PolicyResponse.class);
            lr.setObject(policyResponse);
        }
        return lr;
    }

    public LocalResponse cancelPolicy(Authentication authentication, String policyNo, String reason) {
        LocalResponse lr = new LocalResponse();
        if(policyNo == null || policyNo.isEmpty()){
            lr.setDesc("Please provide policy number for cancellation!");
            lr.setCode("99");
        }else{
            PolicyCancellationRequest pcr = new PolicyCancellationRequest();
            pcr.setCancellationReason((reason == null || reason.isEmpty()) ? null : reason);
            pcr.setPolicyNumber(policyNo);

            PolicyCancellationRequestParameters pcrp = new PolicyCancellationRequestParameters();
            pcrp.setPolicyCancellationRequest(pcr);

            PolicyCancellationRequestObj pcro = new PolicyCancellationRequestObj();
            pcro.setAuthentication(authentication);
            pcro.setRequestParameters(pcrp);

            String xmlRequest = XMLConverter.jaxbObj2XML(pcro, PolicyCancellationRequestObj.class);
            lr = new HepstarWSClient().callWS(Misc.getPropertyValue("policeCancelURL"), xmlRequest);
            if(lr.getObject() != null) {
                PolicyCancellationResponse cancellationResponse = (PolicyCancellationResponse) XMLConverter.jaxbXML2Obj((String) lr.getObject(), PolicyCancellationResponse.class);
                lr.setObject(cancellationResponse);
            }
        }
        return lr;
    }
}
