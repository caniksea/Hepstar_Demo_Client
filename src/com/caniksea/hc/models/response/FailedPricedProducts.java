package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "FailedPricedProducts")
public class FailedPricedProducts {
    private Set<FailedPricedProduct> failedPricedProducts;

    @XmlElement(name = "FailedPricedProduct", type = FailedPricedProduct.class)
    public Set<FailedPricedProduct> getFailedPricedProducts() {
        return failedPricedProducts;
    }

    public void setFailedPricedProducts(Set<FailedPricedProduct> failedPricedProducts) {
        this.failedPricedProducts = failedPricedProducts;
    }

    @Override
    public String toString() {
        return "FailedPricedProducts{" +
                "failedPricedProducts=" + failedPricedProducts +
                '}';
    }
}
