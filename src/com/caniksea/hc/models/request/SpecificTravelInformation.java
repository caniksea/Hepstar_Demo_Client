package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TravelInformation")
public class SpecificTravelInformation {

    private String travelItemValue;

    public SpecificTravelInformation() {
    }

    public SpecificTravelInformation(String travelItemValue) {
        this.travelItemValue = travelItemValue;
    }

    @XmlElement(name = "TravelItemValue")
    public String getTravelItemValue() {
        return travelItemValue;
    }

    @Override
    public String toString() {
        return "SpecificTravelInformation{" +
                "travelItemValue='" + travelItemValue + '\'' +
                '}';
    }
}
