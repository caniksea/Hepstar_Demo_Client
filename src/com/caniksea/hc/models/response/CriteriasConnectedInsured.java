package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "CriteriasConnectedInsured")
public class CriteriasConnectedInsured {
    private Set<CriteriaConnectedInsured> criteriaConnectedInsureds;

    @XmlElement(name = "CriteriaConnectedInsured", type = CriteriaConnectedInsured.class)
    public Set<CriteriaConnectedInsured> getCriteriaConnectedInsureds() {
        return criteriaConnectedInsureds;
    }

    public void setCriteriaConnectedInsureds(Set<CriteriaConnectedInsured> criteriaConnectedInsureds) {
        this.criteriaConnectedInsureds = criteriaConnectedInsureds;
    }

    @Override
    public String toString() {
        return "CriteriasConnectedInsured{" +
                "criteriaConnectedInsureds=" + criteriaConnectedInsureds +
                '}';
    }
}
