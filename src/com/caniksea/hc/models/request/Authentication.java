package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "Authentication")
@XmlType(propOrder = {"account", "channel", "username", "password", "currency", "locale", "session"})
public class Authentication implements Serializable {

    private String account, channel, username, password, currency, locale, session;

    public Authentication() {
    }

    public Authentication(String account, String channel, String username, String password, String currency, String locale, String session) {
        this.account = account;
        this.channel = channel;
        this.username = username;
        this.password = password;
        this.currency = currency;
        this.locale = locale;
        this.session = session;
    }

    @XmlElement(name = "Account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @XmlElement(name = "Channel")
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @XmlElement(name = "Username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @XmlElement(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement(name = "Currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @XmlElement(name = "Locale")
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @XmlElement(name = "Session")
    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Authentication{" +
                "account='" + account + '\'' +
                ", channel='" + channel + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", currency='" + currency + '\'' +
                ", locale='" + locale + '\'' +
                ", session='" + session + '\'' +
                '}';
    }
}
