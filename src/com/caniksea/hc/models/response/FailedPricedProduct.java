package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "FailedPricedProduct")
public class FailedPricedProduct implements Comparable<FailedPricedProduct> {
    private String productCode, insuredId, description;

    @XmlAttribute(name = "ProductCode")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @XmlAttribute(name = "InsuredId")
    public String getInsuredId() {
        return insuredId;
    }

    public void setInsuredId(String insuredId) {
        this.insuredId = insuredId;
    }

    @XmlValue
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FailedPricedProduct{" +
                "productCode='" + productCode + '\'' +
                ", insuredId='" + insuredId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(FailedPricedProduct o) {
        return productCode.compareTo(o.productCode);
    }
}
