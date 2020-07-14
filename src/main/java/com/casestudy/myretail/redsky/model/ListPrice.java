
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
    "null",
    "price",
    "formattedPrice",
    "priceType",
    "maxPrice",
    "minPrice"
})
public class ListPrice implements Serializable
{

    @JsonProperty("null")
    private Boolean _null;
    @JsonProperty("price")
    private Float price;
    @JsonProperty("formattedPrice")
    private String formattedPrice;
    @JsonProperty("priceType")
    private String priceType;
    @JsonProperty("maxPrice")
    private Integer maxPrice;
    @JsonProperty("minPrice")
    private Integer minPrice;
    private final static long serialVersionUID = -2048938774137971372L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListPrice() {
    }

    /**
     * 
     * @param formattedPrice
     * @param price
     * @param minPrice
     * @param _null
     * @param priceType
     * @param maxPrice
     */
    public ListPrice(Boolean _null, Float price, String formattedPrice, String priceType, Integer maxPrice, Integer minPrice) {
        super();
        this._null = _null;
        this.price = price;
        this.formattedPrice = formattedPrice;
        this.priceType = priceType;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }

    @JsonProperty("null")
    public Boolean getNull() {
        return _null;
    }

    @JsonProperty("null")
    public void setNull(Boolean _null) {
        this._null = _null;
    }

    @JsonProperty("price")
    public Float getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Float price) {
        this.price = price;
    }

    @JsonProperty("formattedPrice")
    public String getFormattedPrice() {
        return formattedPrice;
    }

    @JsonProperty("formattedPrice")
    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    @JsonProperty("priceType")
    public String getPriceType() {
        return priceType;
    }

    @JsonProperty("priceType")
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    @JsonProperty("maxPrice")
    public Integer getMaxPrice() {
        return maxPrice;
    }

    @JsonProperty("maxPrice")
    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    @JsonProperty("minPrice")
    public Integer getMinPrice() {
        return minPrice;
    }

    @JsonProperty("minPrice")
    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

}
