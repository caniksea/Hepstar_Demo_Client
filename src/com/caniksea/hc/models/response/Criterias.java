package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "Criterias")
public class Criterias {
    private Set<Criteria> criteriaSet;

    @XmlElement(name = "Criteria", type = Criteria.class)
    public Set<Criteria> getCriteriaSet() {
        return criteriaSet;
    }

    public void setCriteriaSet(Set<Criteria> criteriaSet) {
        this.criteriaSet = criteriaSet;
    }

    @Override
    public String toString() {
        return "Criterias{" +
                "criteriaSet=" + criteriaSet +
                '}';
    }
}
