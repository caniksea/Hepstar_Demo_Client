package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PolicyDocuments")
public class PolicyDocuments {
    private String policyScheduleDownload;

    @XmlElement(name = "PolicyScheduleDownload")
    public String getPolicyScheduleDownload() {
        return policyScheduleDownload;
    }

    public void setPolicyScheduleDownload(String policyScheduleDownload) {
        this.policyScheduleDownload = policyScheduleDownload;
    }

    @Override
    public String toString() {
        return "PolicyDocuments{" +
                "policyScheduleDownload='" + policyScheduleDownload + '\'' +
                '}';
    }
}
