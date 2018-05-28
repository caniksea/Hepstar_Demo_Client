package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AdditionalFees")
public class AdditionalFees {
    private AccountPriceDetails accountPriceDetails;

    @XmlElement(name = "AccountPriceDetails", type = AccountPriceDetails.class)
    public AccountPriceDetails getAccountPriceDetails() {
        return accountPriceDetails;
    }

    public void setAccountPriceDetails(AccountPriceDetails accountPriceDetails) {
        this.accountPriceDetails = accountPriceDetails;
    }

    @Override
    public String toString() {
        return "AdditionalFees{" +
                "accountPriceDetails=" + accountPriceDetails +
                '}';
    }
}
