package com.caniksea.hc.models.globals;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "overall")
public class OverAll {
    private String weighting, value;

    @XmlAttribute(name = "weighting")
    public String getWeighting() {
        return weighting;
    }

    public void setWeighting(String weighting) {
        this.weighting = weighting;
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "OverAll{" +
                "weighting='" + weighting + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
