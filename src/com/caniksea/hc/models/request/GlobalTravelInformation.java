package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "TravelInformation")
@XmlType(propOrder = {"startDate", "endDate", "departureCountry", "coverCountries", "bookingValue"})
public class GlobalTravelInformation {

    private String startDate, endDate;
    private String departureCountry, bookingValue;
    private CoverCountries coverCountries;

    public GlobalTravelInformation() {
    }

    public GlobalTravelInformation(String startDate, String endDate, String departureCountry, String bookingValue, CoverCountries coverCountries) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.departureCountry = departureCountry;
        this.bookingValue = bookingValue;
        this.coverCountries = coverCountries;
    }

    @XmlElement(name = "CoverCountries", type = CoverCountries.class)
    public CoverCountries getCoverCountries() {
        return coverCountries;
    }

    public void setCoverCountries(CoverCountries coverCountries) {
        this.coverCountries = coverCountries;
    }

    @XmlElement(name = "StartDate")
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @XmlElement(name = "EndDate")
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @XmlElement(name = "DepartureCountry")
    public String getDepartureCountry() {
        return departureCountry;
    }

    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry;
    }

    @XmlElement(name = "BookingValue")
    public String getBookingValue() {
        return bookingValue;
    }

    public void setBookingValue(String bookingValue) {
        this.bookingValue = bookingValue;
    }

    @Override
    public String toString() {
        return "GlobalTravelInformation{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", departureCountry='" + departureCountry + '\'' +
                ", bookingValue='" + bookingValue + '\'' +
                ", coverCountries=" + coverCountries +
                '}';
    }
}
