package com.caniksea.hc.models.globals;

import com.caniksea.hc.models.globals.parents.Attributes;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "DateOfBirth")
public class DateOfBirth extends Attributes {
    private String dateOfBirth;

    @XmlValue
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "DateOfBirth{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", note='" + super.getNote() + '\'' +
                '}';
    }
}
