package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Package")
public class Package implements Comparable<Package> {
    private String id, weighting;
    private SPriceDetails priceDetails;
    private PricedProduct pricedProduct;

    @XmlAttribute(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute(name = "weighting")
    public String getWeighting() {
        return weighting;
    }

    public void setWeighting(String weighting) {
        this.weighting = weighting;
    }

    @XmlElement(name = "PriceDetails", type = SPriceDetails.class)
    public SPriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(SPriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }

    @XmlElement(name = "PricedProduct", type = PricedProduct.class)
    public PricedProduct getPricedProduct() {
        return pricedProduct;
    }

    public void setPricedProduct(PricedProduct pricedProduct) {
        this.pricedProduct = pricedProduct;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id='" + id + '\'' +
                ", weighting='" + weighting + '\'' +
                ", priceDetails=" + priceDetails +
                ", pricedProduct=" + pricedProduct +
                '}';
    }

    @Override
    public int compareTo(Package o) {
        return o.id.compareTo(id);
    }
}
