package com.caniksea.hc.models.response;

import com.caniksea.hc.models.response.parents.CommonPolicyResponseAttr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PolicyInformation")
public class PolicyInformation extends CommonPolicyResponseAttr {
    private String issueDate, transRef, policyNo, policyRulesURL, productCode, productName, productScope, productType,
            productCountry, tripType;
    private boolean policyActive;
    private PolicyDocuments policyDocuments;
    private PolicyInsuredPriceDetails insuredPriceDetails;
    private Insurer insurer;

    @XmlElement(name = "IssueDate")
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @XmlElement(name = "TransactionReference")
    public String getTransRef() {
        return transRef;
    }

    public void setTransRef(String transRef) {
        this.transRef = transRef;
    }

    @XmlElement(name = "PolicyNumber")
    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    @XmlElement(name = "PolicyActive")
    public boolean isPolicyActive() {
        return policyActive;
    }

    public void setPolicyActive(boolean policyActive) {
        this.policyActive = policyActive;
    }

    @XmlElement(name = "PolicyRulesURL")
    public String getPolicyRulesURL() {
        return policyRulesURL;
    }

    public void setPolicyRulesURL(String policyRulesURL) {
        this.policyRulesURL = policyRulesURL;
    }

    @XmlElement(name = "ProductCode")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @XmlElement(name = "ProductName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @XmlElement(name = "ProductScope")
    public String getProductScope() {
        return productScope;
    }

    public void setProductScope(String productScope) {
        this.productScope = productScope;
    }

    @XmlElement(name = "ProductType")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @XmlElement(name = "ProductCountry")
    public String getProductCountry() {
        return productCountry;
    }

    public void setProductCountry(String productCountry) {
        this.productCountry = productCountry;
    }

    @XmlElement(name = "TripType")
    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    @XmlElement(name = "PolicyDocuments", type = PolicyDocuments.class)
    public PolicyDocuments getPolicyDocuments() {
        return policyDocuments;
    }

    public void setPolicyDocuments(PolicyDocuments policyDocuments) {
        this.policyDocuments = policyDocuments;
    }

    @XmlElement(name = "InsuredPriceDetails", type = PolicyInsuredPriceDetails.class)
    public PolicyInsuredPriceDetails getInsuredPriceDetails() {
        return insuredPriceDetails;
    }

    public void setInsuredPriceDetails(PolicyInsuredPriceDetails insuredPriceDetails) {
        this.insuredPriceDetails = insuredPriceDetails;
    }

    @XmlElement(name = "Insurer", type = Insurer.class)
    public Insurer getInsurer() {
        return insurer;
    }

    public void setInsurer(Insurer insurer) {
        this.insurer = insurer;
    }

    @Override
    public String toString() {
        return "PolicyInformation{" +
                "issueDate=" + issueDate +
                ", transRef='" + transRef + '\'' +
                ", policyNo='" + policyNo + '\'' +
                ", policyActive=" + policyActive +
                ", policyRulesURL='" + policyRulesURL + '\'' +
                ", policyDocuments=" + policyDocuments +
                ", insuredPriceDetails=" + insuredPriceDetails +
                ", price=" + super.getPrice() +
                ", discount=" + super.getDiscount() +
                ", tax=" + super.getTax() +
                ", taxDiscount=" + super.getTaxDiscount() +
                ", totalPrice=" + super.getTotalPrice() +
                ", currency=" + super.getCurrency() +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productScope='" + productScope + '\'' +
                ", productType='" + productType + '\'' +
                ", productCountry='" + productCountry + '\'' +
                ", tripType='" + tripType + '\'' +
                ", insurer=" + insurer +
                '}';
    }
}
