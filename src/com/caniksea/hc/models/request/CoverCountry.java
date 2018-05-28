package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.Objects;

@XmlRootElement(name = "CoverCountry")
public class CoverCountry implements Comparable<CoverCountry> {
    private String country;

    public CoverCountry() {
    }

    public CoverCountry(String country) {
        this.country = country;
    }

    @XmlValue
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int compareTo(CoverCountry o) {
        return country.compareTo(o.country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoverCountry that = (CoverCountry) o;
        return Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country);
    }

    @Override
    public String toString() {
        return "CoverCountry{" +
                "country='" + country + '\'' +
                '}';
    }
}
