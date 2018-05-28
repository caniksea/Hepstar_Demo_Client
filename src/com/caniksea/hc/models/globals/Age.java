package com.caniksea.hc.models.globals;

import com.caniksea.hc.models.globals.parents.Attributes;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "Age")
public class Age extends Attributes {
    private String age;

    @XmlValue
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age{" +
                "age='" + age + '\'' +
                ", source='" + super.getSource() + '\'' +
                '}';
    }
}
