package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResponseParameters")
public class ProductResponseParameters {
    private Packages packages;
    private AdditionalFees additionalFees;
    private FailedPricedProducts failedPricedProducts;

    @XmlElement(name = "Packages", type = Packages.class)
    public Packages getPackages() {
        return packages;
    }

    public void setPackages(Packages packages) {
        this.packages = packages;
    }

    @XmlElement(name = "AdditionalFees", type = AdditionalFees.class)
    public AdditionalFees getAdditionalFees() {
        return additionalFees;
    }

    public void setAdditionalFees(AdditionalFees additionalFees) {
        this.additionalFees = additionalFees;
    }

    @XmlElement(name = "FailedPricedProducts", type = FailedPricedProducts.class)
    public FailedPricedProducts getFailedPricedProducts() {
        return failedPricedProducts;
    }

    public void setFailedPricedProducts(FailedPricedProducts failedPricedProducts) {
        this.failedPricedProducts = failedPricedProducts;
    }

    @Override
    public String toString() {
        return "ProductResponseParameters{" +
                "packages=" + packages +
                ", additionalFees=" + additionalFees +
                ", failedPricedProducts=" + failedPricedProducts +
                '}';
    }
}
