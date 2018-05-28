package com.caniksea.hc.models.globals;

import com.caniksea.hc.models.response.Address;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Contact")
public class Contact {
    private Address address;
    private String phones, email;

    @XmlElement(name = "Address", type = Address.class)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @XmlElement(name = "Phones")
    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    @XmlElement(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "address=" + address +
                ", phones='" + phones + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
