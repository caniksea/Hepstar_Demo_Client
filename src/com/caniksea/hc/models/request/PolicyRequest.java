package com.caniksea.hc.models.request;

import com.caniksea.hc.models.globals.Contact;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "PolicyRequest")
@XmlType(propOrder = {"distributorReference", "productId", "insureds", "contactInformation", "gti"})
public class PolicyRequest implements Comparable<PolicyRequest> {
    private String distributorReference, productId;
    private Insureds insureds;
    private Contact contactInformation;
    private GlobalTravelInformation gti;

    @XmlElement(name = "DistributorReference")
    public String getDistributorReference() {
        return distributorReference;
    }

    public void setDistributorReference(String distributorReference) {
        this.distributorReference = distributorReference;
    }

    @XmlElement(name = "ProductID")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @XmlElement(name = "Insureds", type = Insureds.class)
    public Insureds getInsureds() {
        return insureds;
    }

    public void setInsureds(Insureds insureds) {
        this.insureds = insureds;
    }

    @XmlElement(name = "ContactInformation", type = Contact.class)
    public Contact getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(Contact contactInformation) {
        this.contactInformation = contactInformation;
    }

    @XmlElement(name = "TravelInformation", type = GlobalTravelInformation.class)
    public GlobalTravelInformation getGti() {
        return gti;
    }

    public void setGti(GlobalTravelInformation gti) {
        this.gti = gti;
    }

    @Override
    public String toString() {
        return "PolicyRequest{" +
                "distributorReference='" + distributorReference + '\'' +
                ", productId='" + productId + '\'' +
                ", insureds=" + insureds +
                ", contactInformation=" + contactInformation +
                ", gti=" + gti +
                '}';
    }

    @Override
    public int compareTo(PolicyRequest o) {
        return productId.compareTo(o.productId);
    }
}
