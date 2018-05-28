package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "PolicyRequests")
public class PolicyRequests {
    private Set<PolicyRequest> policyRequests;

    @XmlElement(name = "PolicyRequest", type = PolicyRequest.class)
    public Set<PolicyRequest> getPolicyRequests() {
        return policyRequests;
    }

    public void setPolicyRequests(Set<PolicyRequest> policyRequests) {
        this.policyRequests = policyRequests;
    }

    @Override
    public String toString() {
        return "PolicyRequests{" +
                "policyRequests=" + policyRequests +
                '}';
    }
}
