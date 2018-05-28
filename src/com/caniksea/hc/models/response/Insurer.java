package com.caniksea.hc.models.response;

import com.caniksea.hc.models.globals.Contact;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Insurer")
public class Insurer {
    private String insurerCode, insurerName, logo;
    private Contact contact;

    @XmlElement(name = "InsurerCode")
    public String getInsurerCode() {
        return insurerCode;
    }

    public void setInsurerCode(String insurerCode) {
        this.insurerCode = insurerCode;
    }

    @XmlElement(name = "InsurerName")
    public String getInsurerName() {
        return insurerName;
    }

    public void setInsurerName(String insurerName) {
        this.insurerName = insurerName;
    }

    @XmlElement(name = "Logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @XmlElement(name = "Contact", type = Contact.class)
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Insurer{" +
                "insurerCode='" + insurerCode + '\'' +
                ", insurerName='" + insurerName + '\'' +
                ", logo='" + logo + '\'' +
                ", contact=" + contact +
                '}';
    }
}
