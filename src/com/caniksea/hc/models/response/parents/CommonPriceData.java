package com.caniksea.hc.models.response.parents;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public class CommonPriceData {
    private String type, name, lowerLimit, limit, basedOn, percentageOf, percentageAmount, identifier, currency,
            minDays, maxDays, minAge, maxAge, minReservation, maxReservation, minSegment, maxSegment, connectedInsuredType;

    @XmlAttribute(name = "ConnectedInsuredType")
    public String getConnectedInsuredType() {
        return connectedInsuredType;
    }

    public void setConnectedInsuredType(String connectedInsuredType) {
        this.connectedInsuredType = connectedInsuredType;
    }

    @XmlAttribute(name = "Currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @XmlAttribute(name = "MinDays")
    public String getMinDays() {
        return minDays;
    }

    public void setMinDays(String minDays) {
        this.minDays = minDays;
    }

    @XmlAttribute(name = "MaxDays")
    public String getMaxDays() {
        return maxDays;
    }

    public void setMaxDays(String maxDays) {
        this.maxDays = maxDays;
    }

    @XmlAttribute(name = "MinAge")
    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    @XmlAttribute(name = "MaxAge")
    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }

    @XmlAttribute(name = "MinReservation")
    public String getMinReservation() {
        return minReservation;
    }

    public void setMinReservation(String minReservation) {
        this.minReservation = minReservation;
    }

    @XmlAttribute(name = "MaxReservation")
    public String getMaxReservation() {
        return maxReservation;
    }

    public void setMaxReservation(String maxReservation) {
        this.maxReservation = maxReservation;
    }

    @XmlAttribute(name = "MinSegment")
    public String getMinSegment() {
        return minSegment;
    }

    public void setMinSegment(String minSegment) {
        this.minSegment = minSegment;
    }

    @XmlAttribute(name = "MaxSegment")
    public String getMaxSegment() {
        return maxSegment;
    }

    public void setMaxSegment(String maxSegment) {
        this.maxSegment = maxSegment;
    }

    @XmlAttribute(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute(name = "Lowerlimit")
    public String getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(String lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    @XmlAttribute(name = "Limit")
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @XmlAttribute(name = "BasedOn")
    public String getBasedOn() {
        return basedOn;
    }

    public void setBasedOn(String basedOn) {
        this.basedOn = basedOn;
    }

    @XmlAttribute(name = "PercentageOf")
    public String getPercentageOf() {
        return percentageOf;
    }

    public void setPercentageOf(String percentageOf) {
        this.percentageOf = percentageOf;
    }

    @XmlAttribute(name = "PercentageAmount")
    public String getPercentageAmount() {
        return percentageAmount;
    }

    public void setPercentageAmount(String percentageAmount) {
        this.percentageAmount = percentageAmount;
    }

    @XmlAttribute(name = "Identifier")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
