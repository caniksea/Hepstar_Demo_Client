package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@XmlRootElement(name = "Packages")
public class Packages {
    private String size;
    private Set<Package> packages;

    @XmlAttribute(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @XmlElement(name = "Package", type = Package.class)
    public Set<Package> getPackages() {
        return packages;
    }

    public void setPackages(Set<Package> packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return "Packages{" +
                "size='" + size + '\'' +
                ", packages=" + packages +
                '}';
    }
}
