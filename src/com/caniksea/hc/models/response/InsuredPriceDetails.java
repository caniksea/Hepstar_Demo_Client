package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "InsuredPriceDetails")
public class InsuredPriceDetails {
    private Set<InsuredPriceDetail> insuredPriceDetails;

    @XmlElement(name = "InsuredPriceDetail", type = InsuredPriceDetail.class)
    public Set<InsuredPriceDetail> getInsuredPriceDetails() {
        return insuredPriceDetails;
    }

    public void setInsuredPriceDetails(Set<InsuredPriceDetail> insuredPriceDetails) {
        this.insuredPriceDetails = insuredPriceDetails;
    }

    @Override
    public String toString() {
        return "InsuredPriceDetails{" +
                "insuredPriceDetails=" + insuredPriceDetails +
                '}';
    }
}
