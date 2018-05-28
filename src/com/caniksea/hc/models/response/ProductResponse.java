package com.caniksea.hc.models.response;

import com.caniksea.hc.models.request.Authentication;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Response")
@XmlType(propOrder = {"status", "authentication", "session", "productResponseParameters"})
public class ProductResponse {
    private Status status;
    private Authentication authentication;
    private Session session;
    private ProductResponseParameters productResponseParameters;

    @XmlElement(name = "Status", type = Status.class)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @XmlElement(name = "Authentication", type = Authentication.class)
    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    @XmlElement(name = "Session", type = Session.class)
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @XmlElement(name = "ResponseParameters", type = ProductResponseParameters.class)
    public ProductResponseParameters getProductResponseParameters() {
        return productResponseParameters;
    }

    public void setProductResponseParameters(ProductResponseParameters productResponseParameters) {
        this.productResponseParameters = productResponseParameters;
    }

    @Override
    public String toString() {
        return "ProductResponse{" +
                "status=" + status +
                ", authentication=" + authentication +
                ", session=" + session +
                ", productResponseParameters=" + productResponseParameters +
                '}';
    }
}
