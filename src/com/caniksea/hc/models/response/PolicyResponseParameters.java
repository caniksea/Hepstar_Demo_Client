package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ResponseParameters")
@XmlType(propOrder = {"policiesInformation", "policies", "paymentResult"})
public class PolicyResponseParameters {
    private PoliciesInformation policiesInformation;
    private Policies policies;
    private PaymentResult paymentResult;

    @XmlElement(name = "PoliciesInformation", type = PoliciesInformation.class)
    public PoliciesInformation getPoliciesInformation() {
        return policiesInformation;
    }

    public void setPoliciesInformation(PoliciesInformation policiesInformation) {
        this.policiesInformation = policiesInformation;
    }

    @XmlElement(name = "Policies", type = Policies.class)
    public Policies getPolicies() {
        return policies;
    }

    public void setPolicies(Policies policies) {
        this.policies = policies;
    }

    @XmlElement(name = "PaymentResult", type = PaymentResult.class)
    public PaymentResult getPaymentResult() {
        return paymentResult;
    }

    public void setPaymentResult(PaymentResult paymentResult) {
        this.paymentResult = paymentResult;
    }

    @Override
    public String toString() {
        return "PolicyResponseParameters{" +
                "policiesInformation=" + policiesInformation +
                ", policies=" + policies +
                ", paymentResult=" + paymentResult +
                '}';
    }
}
