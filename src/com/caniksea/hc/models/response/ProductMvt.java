package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ProductMvt")
@XmlType(propOrder = {"mvtCode", "mvtName", "mvtType"})
public class ProductMvt {

    private String mvtCode, mvtName, mvtType;

    public ProductMvt() {
    }

    public ProductMvt(String mvtCode, String mvtName, String mvtType) {
        this.mvtCode = mvtCode;
        this.mvtName = mvtName;
        this.mvtType = mvtType;
    }

    @XmlElement(name = "MvtCode")
    public String getMvtCode() {
        return mvtCode;
    }

    public void setMvtCode(String mvtCode) {
        this.mvtCode = mvtCode;
    }

    @XmlElement(name = "MvtName")
    public String getMvtName() {
        return mvtName;
    }

    public void setMvtName(String mvtName) {
        this.mvtName = mvtName;
    }

    @XmlElement(name = "MvtType")
    public String getMvtType() {
        return mvtType;
    }

    public void setMvtType(String mvtType) {
        this.mvtType = mvtType;
    }

    @Override
    public String toString() {
        return "ProductMvt{" +
                "mvtCode='" + mvtCode + '\'' +
                ", mvtName='" + mvtName + '\'' +
                ", mvtType='" + mvtType + '\'' +
                '}';
    }
}
