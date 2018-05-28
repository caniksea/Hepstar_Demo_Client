package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Request")
@XmlType(propOrder = {"authentication", "policyRequestParameters"})
public class PolicyRequestObj {
    private Authentication authentication;
    private PolicyRequestParameters policyRequestParameters;

    @XmlElement(name = "Authentication", type = Authentication.class)
    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    @XmlElement(name = "RequestParameters", type = PolicyRequestParameters.class)
    public PolicyRequestParameters getPolicyRequestParameters() {
        return policyRequestParameters;
    }

    public void setPolicyRequestParameters(PolicyRequestParameters policyRequestParameters) {
        this.policyRequestParameters = policyRequestParameters;
    }

    @Override
    public String toString() {
        return "PolicyRequestObj{" +
                "authentication=" + authentication +
                ", policyRequestParameters=" + policyRequestParameters +
                '}';
    }
}
