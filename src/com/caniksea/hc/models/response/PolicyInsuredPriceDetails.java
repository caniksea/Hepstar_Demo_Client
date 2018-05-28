package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "InsuredPriceDetails")
public class PolicyInsuredPriceDetails {
    private PolicyInsuredPriceDetail policyInsuredPriceDetail;

    @XmlElement(name = "InsuredPriceDetail", type = PolicyInsuredPriceDetail.class)
    public PolicyInsuredPriceDetail getPolicyInsuredPriceDetail() {
        return policyInsuredPriceDetail;
    }

    public void setPolicyInsuredPriceDetail(PolicyInsuredPriceDetail policyInsuredPriceDetail) {
        this.policyInsuredPriceDetail = policyInsuredPriceDetail;
    }

    @Override
    public String toString() {
        return "PolicyInsuredPriceDetails{" +
                "policyInsuredPriceDetail=" + policyInsuredPriceDetail +
                '}';
    }
}
