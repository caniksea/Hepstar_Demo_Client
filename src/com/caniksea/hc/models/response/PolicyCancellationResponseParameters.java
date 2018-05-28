package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ResponseParameters")
public class PolicyCancellationResponseParameters {
    private String transRef, policyNo, transactionAmount, cancellationAmount;
    private boolean cancelled;

    @XmlElement(name = "transactionreference")
    public String getTransRef() {
        return transRef;
    }

    public void setTransRef(String transRef) {
        this.transRef = transRef;
    }

    @XmlElement(name = "PolicyNumber")
    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    @XmlElement(name = "TransactionAmount")
    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getCancellationAmount() {
        return cancellationAmount;
    }

    @XmlElement(name = "CancellationAmount")
    public void setCancellationAmount(String cancellationAmount) {
        this.cancellationAmount = cancellationAmount;
    }

    @XmlElement(name = "Cancelled")
    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public String toString() {
        return "PolicyCancellationResponseParameters{" +
                "transRef='" + transRef + '\'' +
                ", policyNo='" + policyNo + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                ", cancellationAmount='" + cancellationAmount + '\'' +
                ", cancelled=" + cancelled +
                '}';
    }
}
