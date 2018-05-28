package com.caniksea.hc.models.globals;

import com.caniksea.hc.models.globals.parents.Attributes;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "DOB")
public class DOB extends Attributes {
    private String dob;

    @XmlValue
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "DOB{" +
                "dob='" + dob + '\'' +
                ", source='" + super.getSource() + '\'' +
                '}';
    }
}
