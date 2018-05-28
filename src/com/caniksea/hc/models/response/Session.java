package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Session")
public class Session {

    private String id;
    private ProductMvts productMvts;

    public Session() {
    }

    public Session(String id, ProductMvts productMvts) {
        this.id = id;
        this.productMvts = productMvts;
    }

    @XmlAttribute(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "ProductMvts", type = ProductMvts.class)
    public ProductMvts getProductMvts() {
        return productMvts;
    }

    public void setProductMvts(ProductMvts productMvts) {
        this.productMvts = productMvts;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id='" + id + '\'' +
                ", productMvts=" + productMvts +
                '}';
    }
}
