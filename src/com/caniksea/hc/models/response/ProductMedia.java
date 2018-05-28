package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProductMedia")
public class ProductMedia {
    private String policyWording;

    @XmlElement(name = "PolicyWording")
    public String getPolicyWording() {
        return policyWording;
    }

    public void setPolicyWording(String policyWording) {
        this.policyWording = policyWording;
    }

    @Override
    public String toString() {
        return "ProductMedia{" +
                "policyWording='" + policyWording + '\'' +
                '}';
    }
}
