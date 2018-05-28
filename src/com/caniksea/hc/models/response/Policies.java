package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Policies")
public class Policies {
    private Policy policy;

    @XmlElement(name = "Policy", type = Policy.class)
    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    @Override
    public String toString() {
        return "Policies{" +
                "policy=" + policy +
                '}';
    }
}
