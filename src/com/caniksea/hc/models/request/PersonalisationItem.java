package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.Objects;

@XmlRootElement(name = "PersonalisationItem")
public class PersonalisationItem implements Comparable<PersonalisationItem> {
    private String type, value;

    public PersonalisationItem() {
    }

    public PersonalisationItem(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @XmlValue()
    public String getValue() {
        return value;
    }

    @XmlAttribute(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(PersonalisationItem o) {
        return type.compareTo(o.type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalisationItem that = (PersonalisationItem) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, value);
    }

    @Override
    public String toString() {
        return "PersonalisationItem{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
