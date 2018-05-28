package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CriteriaConnectedInsured")
public class CriteriaConnectedInsured {

    private String name, maxAge, maxDuration, maxLimit, minAge, minDuration, minLimit;
    private boolean separatePolicy, surnameMatch;

    @XmlAttribute(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "MaxAge")
    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }

    @XmlElement(name = "MaxDuration")
    public String getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration;
    }

    @XmlElement(name = "MaxLimit")
    public String getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(String maxLimit) {
        this.maxLimit = maxLimit;
    }

    @XmlElement(name = "MinAge")
    public String getMinAge() {
        return minAge;
    }

    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    @XmlElement(name = "MinDuration")
    public String getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(String minDuration) {
        this.minDuration = minDuration;
    }

    @XmlElement(name = "MinLimit")
    public String getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(String minLimit) {
        this.minLimit = minLimit;
    }

    @XmlElement(name = "SeparatePolicy")
    public boolean isSeparatePolicy() {
        return separatePolicy;
    }

    public void setSeparatePolicy(boolean separatePolicy) {
        this.separatePolicy = separatePolicy;
    }

    @XmlElement(name = "SurnameMatch")
    public boolean isSurnameMatch() {
        return surnameMatch;
    }

    public void setSurnameMatch(boolean surnameMatch) {
        this.surnameMatch = surnameMatch;
    }

    @Override
    public String toString() {
        return "CriteriaConnectedInsured{" +
                "name='" + name + '\'' +
                ", maxAge='" + maxAge + '\'' +
                ", maxDuration='" + maxDuration + '\'' +
                ", maxLimit='" + maxLimit + '\'' +
                ", minAge='" + minAge + '\'' +
                ", minDuration='" + minDuration + '\'' +
                ", minLimit='" + minLimit + '\'' +
                ", separatePolicy=" + separatePolicy +
                ", surnameMatch=" + surnameMatch +
                '}';
    }
}
