package com.caniksea.hc.models.response;

import com.caniksea.hc.models.response.parents.CommonPriceData;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PriceDetail")
public class CPriceDetail extends CommonPriceData {

    private String days, totalAmount;
    private TaxAmount taxAmount;
    private BaseAmount baseAmount;
    private TaxFee taxFee;

    @XmlElement(name = "TaxFee")
    public TaxFee getTaxFee() {
        return taxFee;
    }

    public void setTaxFee(TaxFee taxFee) {
        this.taxFee = taxFee;
    }

    @XmlElement(name = "Days")
    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    @XmlElement(name = "TotalAmount")
    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @XmlElement(name = "TaxAmount", type = TaxAmount.class)
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(TaxAmount taxAmount) {
        this.taxAmount = taxAmount;
    }

    @XmlElement(name = "BaseAmount", type = BaseAmount.class)
    public BaseAmount getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(BaseAmount baseAmount) {
        this.baseAmount = baseAmount;
    }

    @Override
    public String toString() {
        return "CPriceDetail{" +
                "days='" + days + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", taxAmount=" + taxAmount +
                ", baseAmount=" + baseAmount +
                ", taxFee=" + taxFee +
                ", type='" + super.getType() + '\'' +
                ", currency='" + super.getCurrency() + '\'' +
                '}';
    }
}
