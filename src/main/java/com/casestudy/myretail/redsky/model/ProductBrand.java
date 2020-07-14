
/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.redsky.model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brand",
    "manufacturer_brand",
    "facet_id"
})
public class ProductBrand implements Serializable
{

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("manufacturer_brand")
    private String manufacturerBrand;
    @JsonProperty("facet_id")
    private String facetId;
    private final static long serialVersionUID = -5148296936667254156L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductBrand() {
    }

    /**
     * 
     * @param facetId
     * @param brand
     * @param manufacturerBrand
     */
    public ProductBrand(String brand, String manufacturerBrand, String facetId) {
        super();
        this.brand = brand;
        this.manufacturerBrand = manufacturerBrand;
        this.facetId = facetId;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("manufacturer_brand")
    public String getManufacturerBrand() {
        return manufacturerBrand;
    }

    @JsonProperty("manufacturer_brand")
    public void setManufacturerBrand(String manufacturerBrand) {
        this.manufacturerBrand = manufacturerBrand;
    }

    @JsonProperty("facet_id")
    public String getFacetId() {
        return facetId;
    }

    @JsonProperty("facet_id")
    public void setFacetId(String facetId) {
        this.facetId = facetId;
    }

}
