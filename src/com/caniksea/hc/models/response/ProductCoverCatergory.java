package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productcovercatergory")
public class ProductCoverCatergory {
    private String header, orderValue;

    @XmlElement(name = "header")
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @XmlElement(name = "ordervalue")
    public String getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(String orderValue) {
        this.orderValue = orderValue;
    }

    @Override
    public String toString() {
        return "ProductCoverCatergory{" +
                "header='" + header + '\'' +
                ", orderValue='" + orderValue + '\'' +
                '}';
    }
}
