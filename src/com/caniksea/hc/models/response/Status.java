package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Status")
public class Status {

    private String code, description;

    public Status() {
    }

    public Status(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @XmlElement(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Status{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
