package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "PriceDetails")
public class PriceDetails {
    private Set<CPriceDetail> priceDetails;

    @XmlElement(name = "PriceDetail", type = CPriceDetail.class)
    public Set<CPriceDetail> getcPriceDetails() {
        return priceDetails;
    }

    public void setcPriceDetails(Set<CPriceDetail> priceDetails) {
        this.priceDetails = priceDetails;
    }

    @Override
    public String toString() {
        return "PriceDetails{" +
                "priceDetails=" + priceDetails +
                '}';
    }
}
