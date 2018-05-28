package com.caniksea.hc.models.response.parents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public class CommonPolicyResponseAttr {
    private String price, discount, tax, taxDiscount, totalPrice, currency;

    @XmlElement(name = "Price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @XmlElement(name = "Discount")
    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @XmlElement(name = "Tax")
    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    @XmlElement(name = "TaxDiscount")
    public String getTaxDiscount() {
        return taxDiscount;
    }

    public void setTaxDiscount(String taxDiscount) {
        this.taxDiscount = taxDiscount;
    }

    @XmlElement(name = "TotalPrice")
    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @XmlElement(name = "Currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
