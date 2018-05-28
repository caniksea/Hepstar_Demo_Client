package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "PriceDetails")
public class SPriceDetails {
    private Set<SPriceDetail> priceDetails;

    @XmlElement(name = "PriceDetail", type = SPriceDetail.class)
    public Set<SPriceDetail> getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(Set<SPriceDetail> priceDetails) {
        this.priceDetails = priceDetails;
    }

    @Override
    public String toString() {
        return "SPriceDetails{" +
                "priceDetails=" + priceDetails +
                '}';
    }
}
