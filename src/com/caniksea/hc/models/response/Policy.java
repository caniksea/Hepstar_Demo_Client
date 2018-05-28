package com.caniksea.hc.models.response;

import com.caniksea.hc.models.globals.Contact;
import com.caniksea.hc.models.request.GlobalTravelInformation;
import com.caniksea.hc.models.request.Insureds;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Policy")
public class Policy {
    private Insureds insureds;
    private Contact contact;
    private GlobalTravelInformation travelInformation;
    private PolicyInformation policyInformation;

    @XmlElement(name = "Insureds", type = Insureds.class)
    public Insureds getInsureds() {
        return insureds;
    }

    public void setInsureds(Insureds insureds) {
        this.insureds = insureds;
    }

    @XmlElement(name = "Contact", type = Contact.class)
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @XmlElement(name = "TravelInformation", type = GlobalTravelInformation.class)
    public GlobalTravelInformation getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(GlobalTravelInformation travelInformation) {
        this.travelInformation = travelInformation;
    }

    @XmlElement(name = "PolicyInformation", type = PolicyInformation.class)
    public PolicyInformation getPolicyInformation() {
        return policyInformation;
    }

    public void setPolicyInformation(PolicyInformation policyInformation) {
        this.policyInformation = policyInformation;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "insureds=" + insureds +
                ", contact=" + contact +
                ", travelInformation=" + travelInformation +
                ", policyInformation=" + policyInformation +
                '}';
    }
}
