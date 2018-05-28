package com.caniksea.hc.models.response;

import com.caniksea.hc.models.response.parents.CommonPolicyResponseAttr;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "InsuredPriceDetail")
public class PolicyInsuredPriceDetail extends CommonPolicyResponseAttr {
    private String id;

    @XmlAttribute(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PolicyInsuredPriceDetail{" +
                "id='" + id + '\'' +
                ", price='" + super.getPrice() + '\'' +
                ", discount='" + super.getDiscount() + '\'' +
                ", tax='" + super.getTax() + '\'' +
                ", taxDiscount='" + super.getTaxDiscount() + '\'' +
                ", totalPrice='" + super.getTotalPrice() + '\'' +
                ", currency='" + super.getCurrency() + '\'' +
                '}';
    }
}
