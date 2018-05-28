package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "InsuredPriceDetail")
public class InsuredPriceDetail {
    private String id;
    private CPriceDetail priceDetail;

    @XmlAttribute(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "PriceDetail", type = CPriceDetail.class)
    public CPriceDetail getPriceDetail() {
        return priceDetail;
    }

    public void setPriceDetail(CPriceDetail priceDetail) {
        this.priceDetail = priceDetail;
    }

    @Override
    public String toString() {
        return "InsuredPriceDetail{" +
                "id='" + id + '\'' +
                ", priceDetail=" + priceDetail +
                '}';
    }
}
