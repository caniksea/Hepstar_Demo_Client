package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Request")
@XmlType(propOrder = {"authentication", "requestParameters"})
public class PolicyCancellationRequestObj {
    private Authentication authentication;
    private PolicyCancellationRequestParameters requestParameters;

    @XmlElement(name = "Authentication", type = Authentication.class)
    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    @XmlElement(name = "RequestParameters", type = PolicyCancellationRequestParameters.class)
    public PolicyCancellationRequestParameters getRequestParameters() {
        return requestParameters;
    }

    public void setRequestParameters(PolicyCancellationRequestParameters requestParameters) {
        this.requestParameters = requestParameters;
    }

    @Override
    public String toString() {
        return "PolicyCancellationRequestObj{" +
                "authentication=" + authentication +
                ", requestParameters=" + requestParameters +
                '}';
    }
}
