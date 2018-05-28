package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Response")
@XmlType(propOrder = {"status", "responseParameters"})
public class PolicyCancellationResponse {
    private Status status;
    private PolicyCancellationResponseParameters responseParameters;

    @XmlElement(name = "Status", type = Status.class)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @XmlElement(name = "ResponseParameters", type = PolicyCancellationResponseParameters.class)
    public PolicyCancellationResponseParameters getResponseParameters() {
        return responseParameters;
    }

    public void setResponseParameters(PolicyCancellationResponseParameters responseParameters) {
        this.responseParameters = responseParameters;
    }

    @Override
    public String toString() {
        return "PolicyCancellationResponse{" +
                "status=" + status +
                ", responseParameters=" + responseParameters +
                '}';
    }
}
