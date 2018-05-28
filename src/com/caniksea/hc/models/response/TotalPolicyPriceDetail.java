package com.caniksea.hc.models.response;

import com.caniksea.hc.models.response.parents.CommonPolicyResponseAttr;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PriceDetail")
public class TotalPolicyPriceDetail extends CommonPolicyResponseAttr {
    private String totalMasterPolicy, totalDiscount, totalTax, totalTaxDiscount, totalAmount;

    @XmlElement(name = "TotalMasterPolicy")
    public String getTotalMasterPolicy() {
        return totalMasterPolicy;
    }

    public void setTotalMasterPolicy(String totalMasterPolicy) {
        this.totalMasterPolicy = totalMasterPolicy;
    }

    @XmlElement(name = "TotalDiscount")
    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @XmlElement(name = "TotalTax")
    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    @XmlElement(name = "TotalTaxDiscount")
    public String getTotalTaxDiscount() {
        return totalTaxDiscount;
    }

    public void setTotalTaxDiscount(String totalTaxDiscount) {
        this.totalTaxDiscount = totalTaxDiscount;
    }

    @XmlElement(name = "TotalAmount")
    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "TotalPolicyPriceDetail{" +
                "totalMasterPolicy='" + totalMasterPolicy + '\'' +
                ", totalPrice='" + super.getTotalPrice() + '\'' +
                ", totalDiscount='" + totalDiscount + '\'' +
                ", totalTax='" + totalTax + '\'' +
                ", totalTaxDiscount='" + totalTaxDiscount + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", currency='" + super.getCurrency() + '\'' +
                '}';
    }
}
