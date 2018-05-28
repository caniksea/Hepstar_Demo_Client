package com.caniksea.hc.models.response.parents;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
@Deprecated
public class PriceDetailBase {
    private String currency, type;

    @XmlAttribute(name = "Currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @XmlAttribute(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PriceDetailBase{" +
                "currency='" + currency + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
