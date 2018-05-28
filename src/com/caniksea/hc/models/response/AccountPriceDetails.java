package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "AccountPriceDetails")
public class AccountPriceDetails {
    private Set<AccountPriceDetail> accountPriceDetails;

    @XmlElement(name = "AccountPriceDetail", type = AccountPriceDetail.class)
    public Set<AccountPriceDetail> getAccountPriceDetails() {
        return accountPriceDetails;
    }

    public void setAccountPriceDetails(Set<AccountPriceDetail> accountPriceDetails) {
        this.accountPriceDetails = accountPriceDetails;
    }

    @Override
    public String toString() {
        return "AccountPriceDetails{" +
                "accountPriceDetails=" + accountPriceDetails +
                '}';
    }
}
