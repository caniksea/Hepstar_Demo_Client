package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "PriceDetailsConnectedInsured")
public class PriceDetailsConnectedInsured {
    private Set<CPriceDetail> priceDetailConnectedInsureds;

    @XmlElement(name = "PriceDetailConnectedInsured", type = CPriceDetail.class)
    public Set<CPriceDetail> getcPriceDetails() {
        return priceDetailConnectedInsureds;
    }

    public void setcPriceDetails(Set<CPriceDetail> priceDetailConnectedInsureds) {
        this.priceDetailConnectedInsureds = priceDetailConnectedInsureds;
    }

    @Override
    public String toString() {
        return "PriceDetailsConnectedInsured{" +
                "priceDetailConnectedInsureds=" + priceDetailConnectedInsureds +
                '}';
    }
}
