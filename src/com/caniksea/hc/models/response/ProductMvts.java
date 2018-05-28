package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "ProductMvts")
public class ProductMvts {
    private Set<ProductMvt> productMvts;

    @XmlElement(name = "ProductMvt", type = ProductMvt.class)
    public Set<ProductMvt> getProductMvts() {
        return productMvts;
    }

    public void setProductMvts(Set<ProductMvt> productMvts) {
        this.productMvts = productMvts;
    }

    @Override
    public String toString() {
        return "ProductMvts{" +
                "productMvts=" + productMvts +
                '}';
    }
}
