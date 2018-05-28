package com.caniksea.hc.models.response;

import com.caniksea.hc.models.response.parents.CommonPriceData;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "BaseAmount")
public class BaseAmount extends CommonPriceData {

    private String amount;

    @XmlValue
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BaseAmount{" +
                "amount='" + amount + '\'' +
                ", type='" + super.getType() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", lowerLimit='" + super.getLowerLimit() + '\'' +
                ", limit='" + super.getLimit() + '\'' +
                ", basedOn='" + super.getBasedOn() + '\'' +
                ", percentageOf='" + super.getPercentageOf() + '\'' +
                ", percentageAmount='" + super.getPercentageAmount() + '\'' +
                ", identifier='" + super.getIdentifier() + '\'' +
                ", minDays='" + super.getMinDays() + '\'' +
                ", maxDays='" + super.getMaxDays() + '\'' +
                ", minAge='" + super.getMinAge() + '\'' +
                ", maxAge='" + super.getMaxAge() + '\'' +
                ", minReservation='" + super.getMinReservation() + '\'' +
                ", maxReservation='" + super.getMaxReservation() + '\'' +
                ", minSegment='" + super.getMinSegment() + '\'' +
                ", maxSegment='" + super.getMaxSegment() + '\'' +
                ", connectedInsuredType='" + super.getConnectedInsuredType() + '\'' +
                '}';
    }
}
