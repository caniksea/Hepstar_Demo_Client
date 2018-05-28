package com.caniksea.hc.models.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Request")
@XmlType(propOrder = {"authentication", "productRequestParameters"})
public class ProductRequest {

    private Authentication authentication;
    private ProductRequestParameters productRequestParameters;

    public ProductRequest() {
    }

    public ProductRequest(Authentication authentication, ProductRequestParameters productRequestParameters) {
        this.authentication = authentication;
        this.productRequestParameters = productRequestParameters;
    }

    @XmlElement(name = "Authentication", type = Authentication.class)
    public Authentication getAuthentication() {
        return authentication;
    }

    @XmlElement(name = "RequestParameters", type = ProductRequestParameters.class)
    public ProductRequestParameters getProductRequestParameters() {
        return productRequestParameters;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    public void setProductRequestParameters(ProductRequestParameters productRequestParameters) {
        this.productRequestParameters = productRequestParameters;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "authentication=" + authentication +
                ", productRequestParameters=" + productRequestParameters +
                '}';
    }
}
