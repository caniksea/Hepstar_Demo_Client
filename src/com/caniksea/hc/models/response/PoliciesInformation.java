package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "PoliciesInformation")
@XmlType(propOrder = {"masterPolicy", "priceDetails"})
public class PoliciesInformation {
    private String masterPolicy;
    private TotalPolicyPriceDetails priceDetails;

    @XmlElement(name = "MasterPolicy")
    public String getMasterPolicy() {
        return masterPolicy;
    }

    public void setMasterPolicy(String masterPolicy) {
        this.masterPolicy = masterPolicy;
    }

    @XmlElement(name = "PriceDetails", type = TotalPolicyPriceDetails.class)
    public TotalPolicyPriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(TotalPolicyPriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }

    @Override
    public String toString() {
        return "PoliciesInformation{" +
                "masterPolicy='" + masterPolicy + '\'' +
                ", priceDetails=" + priceDetails +
                '}';
    }
}
