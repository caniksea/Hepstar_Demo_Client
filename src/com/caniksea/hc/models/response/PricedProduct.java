package com.caniksea.hc.models.response;

import com.caniksea.hc.models.request.GlobalTravelInformation;
import com.caniksea.hc.models.request.Insureds;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PricedProduct")
public class PricedProduct {

    private String weighting;
    private ProductInformation productInformation;
    private Insureds insureds;
    private GlobalTravelInformation globalTravelInformation;
    private InsuredPriceDetails insuredPriceDetails;
    private PriceDetails priceDetails;

    @XmlAttribute(name = "weighting")
    public String getWeighting() {
        return weighting;
    }

    public void setWeighting(String weighting) {
        this.weighting = weighting;
    }

    @XmlElement(name = "ProductInformation", type = ProductInformation.class)
    public ProductInformation getProductInformation() {
        return productInformation;
    }

    public void setProductInformation(ProductInformation productInformation) {
        this.productInformation = productInformation;
    }

    @XmlElement(name = "Insureds", type = Insureds.class)
    public Insureds getInsureds() {
        return insureds;
    }

    public void setInsureds(Insureds insureds) {
        this.insureds = insureds;
    }

    @XmlElement(name = "TravelInformation", type = GlobalTravelInformation.class)
    public GlobalTravelInformation getGlobalTravelInformation() {
        return globalTravelInformation;
    }

    public void setGlobalTravelInformation(GlobalTravelInformation globalTravelInformation) {
        this.globalTravelInformation = globalTravelInformation;
    }

    @XmlElement(name = "InsuredPriceDetails", type = InsuredPriceDetails.class)
    public InsuredPriceDetails getInsuredPriceDetails() {
        return insuredPriceDetails;
    }

    public void setInsuredPriceDetails(InsuredPriceDetails insuredPriceDetails) {
        this.insuredPriceDetails = insuredPriceDetails;
    }

    @XmlElement(name = "PriceDetails", type = PriceDetails.class)
    public PriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(PriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }

    @Override
    public String toString() {
        return "PricedProduct{" +
                "weighting='" + weighting + '\'' +
                ", productInformation=" + productInformation +
                ", insureds=" + insureds +
                ", globalTravelInformation=" + globalTravelInformation +
                ", insuredPriceDetails=" + insuredPriceDetails +
                ", priceDetails=" + priceDetails +
                '}';
    }
}
