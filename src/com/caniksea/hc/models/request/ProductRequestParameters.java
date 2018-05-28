package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "RequestParameters")
@XmlType(propOrder = {"insureds", "globalTravelInformation"})
public class ProductRequestParameters {

    private Insureds insureds;
    private GlobalTravelInformation globalTravelInformation;

    public ProductRequestParameters() {
    }

    public ProductRequestParameters(Insureds insureds, GlobalTravelInformation globalTravelInformation) {
        this.insureds = insureds;
        this.globalTravelInformation = globalTravelInformation;
    }

    @XmlElement(name = "Insureds", type = Insureds.class)
    public Insureds getInsureds() {
        return insureds;
    }

    @XmlElement(name = "TravelInformation", type = GlobalTravelInformation.class)
    public GlobalTravelInformation getGlobalTravelInformation() {
        return globalTravelInformation;
    }

    public void setInsureds(Insureds insureds) {
        this.insureds = insureds;
    }

    public void setGlobalTravelInformation(GlobalTravelInformation globalTravelInformation) {
        this.globalTravelInformation = globalTravelInformation;
    }

    @Override
    public String toString() {
        return "ProductRequestParameters{" +
                "insureds=" + insureds +
                ", globalTravelInformation=" + globalTravelInformation +
                '}';
    }
}
