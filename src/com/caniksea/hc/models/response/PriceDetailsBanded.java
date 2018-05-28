package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "PriceDetailsBanded")
public class PriceDetailsBanded {
    private Set<CPriceDetail> priceDetailBandeds;

    @XmlElement(name = "PriceDetailBanded", type = CPriceDetail.class)
    public Set<CPriceDetail> getPriceDetailBandeds() {
        return priceDetailBandeds;
    }

    public void setPriceDetailBandeds(Set<CPriceDetail> priceDetailBandeds) {
        this.priceDetailBandeds = priceDetailBandeds;
    }

    @Override
    public String toString() {
        return "PriceDetailsBanded{" +
                "priceDetailBandeds=" + priceDetailBandeds +
                '}';
    }
}
