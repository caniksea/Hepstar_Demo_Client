package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AccountPriceDetail")
public class AccountPriceDetail {
    private String supplierCode, currencyCode, totalAmount;
    private AccountPrices accountPrices;

    @XmlElement(name = "SupplierCode")
    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    @XmlElement(name = "CurrencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @XmlElement(name = "TotalAmount")
    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @XmlElement(name = "AccountPrices", type = AccountPrices.class)
    public AccountPrices getAccountPrices() {
        return accountPrices;
    }

    public void setAccountPrices(AccountPrices accountPrices) {
        this.accountPrices = accountPrices;
    }

    @Override
    public String toString() {
        return "AccountPriceDetail{" +
                "supplierCode='" + supplierCode + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", accountPrices=" + accountPrices +
                '}';
    }
}
