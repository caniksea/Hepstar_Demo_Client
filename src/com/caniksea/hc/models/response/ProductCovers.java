package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "productcovers")
public class ProductCovers {
    private Set<ProductCover> productCovers;

    @XmlElement(name = "productcover", type = ProductCover.class)
    public Set<ProductCover> getProductCovers() {
        return productCovers;
    }

    public void setProductCovers(Set<ProductCover> productCovers) {
        this.productCovers = productCovers;
    }

    @Override
    public String toString() {
        return "ProductCovers{" +
                "productCovers=" + productCovers +
                '}';
    }
}
