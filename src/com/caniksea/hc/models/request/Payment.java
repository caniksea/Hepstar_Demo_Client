package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Payment")
public class Payment {
    private String cardType, cardHolder, cardNo, cvv, expMonth, expYear;

    @XmlElement(name = "CardType")
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @XmlElement(name = "CardHolder")
    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    @XmlElement(name = "CardNumber")
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @XmlElement(name = "CardVerificationCode")
    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @XmlElement(name = "ExpireMonth")
    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    @XmlElement(name = "ExpireYear")
    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "cardType='" + cardType + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expMonth='" + expMonth + '\'' +
                ", expYear='" + expYear + '\'' +
                '}';
    }
}
