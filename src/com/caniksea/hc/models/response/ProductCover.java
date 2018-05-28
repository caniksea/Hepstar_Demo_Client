package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productcover")
public class ProductCover {
    private String header, currency, amount;
    private ProductCoverCatergory productCoverCatergory;

    @XmlElement(name = "header")
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @XmlElement(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @XmlElement(name = "amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @XmlElement(name = "productcovercatergory", type = ProductCoverCatergory.class)
    public ProductCoverCatergory getProductCoverCatergory() {
        return productCoverCatergory;
    }

    public void setProductCoverCatergory(ProductCoverCatergory productCoverCatergory) {
        this.productCoverCatergory = productCoverCatergory;
    }

    @Override
    public String toString() {
        return "ProductCover{" +
                "header='" + header + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", productCoverCatergory=" + productCoverCatergory +
                '}';
    }
}
