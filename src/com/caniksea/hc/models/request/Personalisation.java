package com.caniksea.hc.models.request;

import com.caniksea.hc.models.globals.OverAll;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "Personalisation")
public class Personalisation {

    private Set<PersonalisationItem> personalisationItems;
    private OverAll overAll;

    public Personalisation() {
    }

    public Personalisation(Set<PersonalisationItem> personalisationItems) {
        this.personalisationItems = personalisationItems;
    }

    @XmlElement(name = "PersonalisationItem", type = PersonalisationItem.class)
    public Set<PersonalisationItem> getPersonalisationItems() {
        return personalisationItems;
    }

    public void setPersonalisationItems(Set<PersonalisationItem> personalisationItems) {
        this.personalisationItems = personalisationItems;
    }

    @XmlElement(name = "overall", type = OverAll.class)
    public OverAll getOverAll() {
        return overAll;
    }

    public void setOverAll(OverAll overAll) {
        this.overAll = overAll;
    }

    @Override
    public String toString() {
        return "Personalisation{" +
                "personalisationItems=" + personalisationItems +
                ", overAll=" + overAll +
                '}';
    }
}
