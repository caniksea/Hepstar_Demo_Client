package com.caniksea.hc.models.request;

import com.caniksea.hc.models.globals.Age;
import com.caniksea.hc.models.globals.DOB;
import com.caniksea.hc.models.globals.DateOfBirth;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Insured")
@XmlType(propOrder = {"title", "firstName", "surname", "nationalId", "passportNumber", "dob", "age", "dateOfBirth", "residency",
        "gender", "personalisation", "specificTravelInformation"})
public class Insured implements Comparable<Insured> {

    private String firstName, surname, nationalId, passportNumber, title, gatewaytoken;
    private int id;
    private DOB dob;
    private Age age;
    private DateOfBirth dateOfBirth;
    private String residency, gender;
    private Personalisation personalisation;
    private SpecificTravelInformation specificTravelInformation;

    @XmlElement(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlAttribute(name = "gatewaytoken")
    public String getGatewaytoken() {
        return gatewaytoken;
    }

    public void setGatewaytoken(String gatewaytoken) {
        this.gatewaytoken = gatewaytoken;
    }

    @XmlElement(name = "Firstname")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement(name = "Surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @XmlElement(name = "NationalID")
    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    @XmlElement(name = "PassportNumber")
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @XmlAttribute(name = "ID")
    public int getId() {
        return id;
    }

    @XmlElement(name = "DOB", type = DOB.class)
    public DOB getDob() {
        return dob;
    }

    public void setDob(DOB dob) {
        this.dob = dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "Age", type = Age.class)
    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    @XmlElement(name = "DateOfBirth")
    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @XmlElement(name = "Residency")
    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    @XmlElement(name = "Gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @XmlElement(name = "Personalisation", type = Personalisation.class)
    public Personalisation getPersonalisation() {
        return personalisation;
    }

    public void setPersonalisation(Personalisation personalisation) {
        this.personalisation = personalisation;
    }

    @XmlElement(name = "TravelInformation", type = SpecificTravelInformation.class)
    public SpecificTravelInformation getSpecificTravelInformation() {
        return specificTravelInformation;
    }

    public void setSpecificTravelInformation(SpecificTravelInformation specificTravelInformation) {
        this.specificTravelInformation = specificTravelInformation;
    }

    @Override
    public String toString() {
        return "Insured{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", title='" + title + '\'' +
                ", gatewaytoken='" + gatewaytoken + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", residency='" + residency + '\'' +
                ", gender='" + gender + '\'' +
                ", personalisation=" + personalisation +
                ", specificTravelInformation=" + specificTravelInformation +
                '}';
    }

    @Override
    public int compareTo(Insured o) {
        return id - o.id;
    }
}
