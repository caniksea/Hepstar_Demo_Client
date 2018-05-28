package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "Insureds")
public class Insureds {
    private Set<Insured> insuredSet;

    public Insureds() {
    }

    public Insureds(Set<Insured> insuredSet) {
        this.insuredSet = insuredSet;
    }

    public void setInsuredSet(Set<Insured> insuredSet) {
        this.insuredSet = insuredSet;
    }

    @XmlElement(name = "Insured", type = Insured.class)
    public Set<Insured> getInsuredSet() {
        return insuredSet;
    }

    @Override
    public String toString() {
        return "Insureds{" +
                "insuredSet=" + insuredSet +
                '}';
    }
}
