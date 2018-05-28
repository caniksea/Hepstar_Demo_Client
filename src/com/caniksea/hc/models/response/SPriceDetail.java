package com.caniksea.hc.models.response;

import com.caniksea.hc.models.response.parents.CommonPriceData;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "PriceDetail")
public class SPriceDetail extends CommonPriceData {

    private String value;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SPriceDetail{" +
                "value='" + value + '\'' +
                ", currency='" + super.getCurrency() + '\'' +
                ", type='" + super.getType() + '\''+
                '}';
    }
}
