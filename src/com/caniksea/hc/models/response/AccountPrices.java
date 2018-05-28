package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "AccountPrices")
public class AccountPrices {
    private Set<SPriceDetail> accountPrices;

    @XmlElement(name = "AccountPrice", type = SPriceDetail.class)
    public Set<SPriceDetail> getAccountPrices() {
        return accountPrices;
    }

    public void setAccountPrices(Set<SPriceDetail> accountPrices) {
        this.accountPrices = accountPrices;
    }

    @Override
    public String toString() {
        return "AccountPrices{" +
                "accountPrices=" + accountPrices +
                '}';
    }
}
