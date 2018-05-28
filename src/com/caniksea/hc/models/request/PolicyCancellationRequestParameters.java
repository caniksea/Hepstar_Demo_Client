package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RequestParameters")
public class PolicyCancellationRequestParameters {
    private PolicyCancellationRequest policyCancellationRequest;

    @XmlElement(name = "PolicyCancellationRequest", type = PolicyCancellationRequest.class)
    public PolicyCancellationRequest getPolicyCancellationRequest() {
        return policyCancellationRequest;
    }

    public void setPolicyCancellationRequest(PolicyCancellationRequest policyCancellationRequest) {
        this.policyCancellationRequest = policyCancellationRequest;
    }

    @Override
    public String toString() {
        return "PolicyCancellationRequestParameters{" +
                "policyCancellationRequest=" + policyCancellationRequest +
                '}';
    }
}
