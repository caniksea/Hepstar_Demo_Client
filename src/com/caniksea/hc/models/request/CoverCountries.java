package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "CoverCountries")
public class CoverCountries {

    private Set<CoverCountry> coverCountries;

    public CoverCountries() {
    }

    public CoverCountries(Set<CoverCountry> coverCountries) {
        this.coverCountries = coverCountries;
    }

    public void setCoverCountries(Set<CoverCountry> coverCountries) {
        this.coverCountries = coverCountries;
    }

    @XmlElement(name = "CoverCountry", type = CoverCountry.class)
    public Set<CoverCountry> getCoverCountries() {
        return coverCountries;
    }

    @Override
    public String toString() {
        return "CoverCountries{" +
                "coverCountries=" + coverCountries +
                '}';
    }
}
