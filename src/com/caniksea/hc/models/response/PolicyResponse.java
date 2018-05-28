package com.caniksea.hc.models.response;

import com.caniksea.hc.models.request.Authentication;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Response")
@XmlType(propOrder = {"status", "authentication", "responseParameters"})
public class PolicyResponse {
    private Status status;
    private Authentication authentication;
    private PolicyResponseParameters responseParameters;

    @XmlElement(name = "Status", type = Status.class)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @XmlElement(name = "Authentication", type = Authentication.class)
    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    @XmlElement(name = "ResponseParameters", type = PolicyResponseParameters.class)
    public PolicyResponseParameters getResponseParameters() {
        return responseParameters;
    }

    public void setResponseParameters(PolicyResponseParameters responseParameters) {
        this.responseParameters = responseParameters;
    }

    @Override
    public String toString() {
        return "PolicyResponse{" +
                "status=" + status +
                ", authentication=" + authentication +
                ", responseParameters=" + responseParameters +
                '}';
    }
}
