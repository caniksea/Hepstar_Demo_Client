package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "PolicyCancellationRequest")
@XmlType(propOrder = {"policyNumber", "cancellationReason"})
public class PolicyCancellationRequest {
    private String policyNumber, cancellationReason;

    @XmlElement(name = "Policy")
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @XmlElement(name = "CancellationReason")
    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    @Override
    public String toString() {
        return "PolicyCancellationRequest{" +
                "policyNumber='" + policyNumber + '\'' +
                ", cancellationReason='" + cancellationReason + '\'' +
                '}';
    }
}
