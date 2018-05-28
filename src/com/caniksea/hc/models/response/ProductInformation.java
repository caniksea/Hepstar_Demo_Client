package com.caniksea.hc.models.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProductInformation")
public class ProductInformation {

    private String id, type, scope, country, name, internalName, details, parentProductCode;
    private Criterias criterias;
    private CriteriasConnectedInsured criteriasConnectedInsured;
    private ProductCovers productCovers;
    private ProductMedia productMedia;
    private Insurer insurer;
    private PriceDetails priceDetails;
    private PriceDetailsBanded priceDetailsBanded;
    private PriceDetailsConnectedInsured priceDetailsConnectedInsured;

    @XmlElement(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "Scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @XmlElement(name = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "InternalName")
    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    @XmlElement(name = "Details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @XmlElement(name = "ParentProductCode")
    public String getParentProductCode() {
        return parentProductCode;
    }

    public void setParentProductCode(String parentProductCode) {
        this.parentProductCode = parentProductCode;
    }

    @XmlElement(name = "Criterias", type = Criterias.class)
    public Criterias getCriterias() {
        return criterias;
    }

    public void setCriterias(Criterias criterias) {
        this.criterias = criterias;
    }

    @XmlElement(name = "CriteriasConnectedInsured", type = CriteriasConnectedInsured.class)
    public CriteriasConnectedInsured getCriteriasConnectedInsured() {
        return criteriasConnectedInsured;
    }

    public void setCriteriasConnectedInsured(CriteriasConnectedInsured criteriasConnectedInsured) {
        this.criteriasConnectedInsured = criteriasConnectedInsured;
    }

    @XmlElement(name = "productcovers", type = ProductCovers.class)
    public ProductCovers getProductCovers() {
        return productCovers;
    }

    public void setProductCovers(ProductCovers productCovers) {
        this.productCovers = productCovers;
    }

    @XmlElement(name = "ProductMedia", type = ProductMedia.class)
    public ProductMedia getProductMedia() {
        return productMedia;
    }

    public void setProductMedia(ProductMedia productMedia) {
        this.productMedia = productMedia;
    }

    @XmlElement(name = "Insurer", type = Insurer.class)
    public Insurer getInsurer() {
        return insurer;
    }

    public void setInsurer(Insurer insurer) {
        this.insurer = insurer;
    }

    @XmlElement(name = "PriceDetails", type = PriceDetails.class)
    public PriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(PriceDetails priceDetails) {
        this.priceDetails = priceDetails;
    }

    @XmlElement(name = "PriceDetailsBanded", type = PriceDetailsBanded.class)
    public PriceDetailsBanded getPriceDetailsBanded() {
        return priceDetailsBanded;
    }

    public void setPriceDetailsBanded(PriceDetailsBanded priceDetailsBanded) {
        this.priceDetailsBanded = priceDetailsBanded;
    }

    @XmlElement(name = "PriceDetailsConnectedInsured", type = PriceDetailsConnectedInsured.class)
    public PriceDetailsConnectedInsured getPriceDetailsConnectedInsured() {
        return priceDetailsConnectedInsured;
    }

    public void setPriceDetailsConnectedInsured(PriceDetailsConnectedInsured priceDetailsConnectedInsured) {
        this.priceDetailsConnectedInsured = priceDetailsConnectedInsured;
    }

    @Override
    public String toString() {
        return "ProductInformation{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", scope='" + scope + '\'' +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", internalName='" + internalName + '\'' +
                ", details='" + details + '\'' +
                ", parentProductCode='" + parentProductCode + '\'' +
                ", criterias=" + criterias +
                ", criteriasConnectedInsured=" + criteriasConnectedInsured +
                ", productCovers=" + productCovers +
                ", productMedia=" + productMedia +
                ", insurer=" + insurer +
                ", priceDetails=" + priceDetails +
                ", priceDetailsBanded=" + priceDetailsBanded +
                ", priceDetailsConnectedInsured=" + priceDetailsConnectedInsured +
                '}';
    }
}
