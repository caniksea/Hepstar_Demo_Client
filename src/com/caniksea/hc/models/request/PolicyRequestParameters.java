package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "RequestParameters")
@XmlType(propOrder = {"policyRequests", "payment"})
public class PolicyRequestParameters {
    private PolicyRequests policyRequests;
    private Payment payment;

    @XmlElement(name = "PolicyRequests", type = PolicyRequests.class)
    public PolicyRequests getPolicyRequests() {
        return policyRequests;
    }

    public void setPolicyRequests(PolicyRequests policyRequests) {
        this.policyRequests = policyRequests;
    }

    @XmlElement(name = "Payment", type = Payment.class)
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "PolicyRequestParameters{" +
                "policyRequests=" + policyRequests +
                ", payment=" + payment +
                '}';
    }
}
