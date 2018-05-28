package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "PriceDetails")
public class TotalPolicyPriceDetails {
    private Set<TotalPolicyPriceDetail> totalPolicyPriceDetails;

    @XmlElement(name = "PriceDetail", type = TotalPolicyPriceDetail.class)
    public Set<TotalPolicyPriceDetail> getTotalPolicyPriceDetails() {
        return totalPolicyPriceDetails;
    }

    public void setTotalPolicyPriceDetails(Set<TotalPolicyPriceDetail> totalPolicyPriceDetails) {
        this.totalPolicyPriceDetails = totalPolicyPriceDetails;
    }

    @Override
    public String toString() {
        return "TotalPolicyPriceDetails{" +
                "totalPolicyPriceDetails=" + totalPolicyPriceDetails +
                '}';
    }
}
