
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
    "startDate",
    "price",
    "eyebrow",
    "formattedPrice",
    "saveDollar",
    "priceType",
    "endDate",
    "maxPrice",
    "savePercent",
    "minPrice"
})
public class OfferPrice implements Serializable
{

    @JsonProperty("null")
    private Boolean _null;
    @JsonProperty("startDate")
    private Long startDate;
    @JsonProperty("price")
    private Float price;
    @JsonProperty("eyebrow")
    private String eyebrow;
    @JsonProperty("formattedPrice")
    private String formattedPrice;
    @JsonProperty("saveDollar")
    private Float saveDollar;
    @JsonProperty("priceType")
    private String priceType;
    @JsonProperty("endDate")
    private Long endDate;
    @JsonProperty("maxPrice")
    private Integer maxPrice;
    @JsonProperty("savePercent")
    private Integer savePercent;
    @JsonProperty("minPrice")
    private Integer minPrice;
    private final static long serialVersionUID = -5962824062041546776L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OfferPrice() {
    }

    /**
     * 
     * @param formattedPrice
     * @param eyebrow
     * @param endDate
     * @param price
     * @param minPrice
     * @param _null
     * @param priceType
     * @param maxPrice
     * @param savePercent
     * @param saveDollar
     * @param startDate
     */
    public OfferPrice(Boolean _null, Long startDate, Float price, String eyebrow, String formattedPrice, Float saveDollar, String priceType, Long endDate, Integer maxPrice, Integer savePercent, Integer minPrice) {
        super();
        this._null = _null;
        this.startDate = startDate;
        this.price = price;
        this.eyebrow = eyebrow;
        this.formattedPrice = formattedPrice;
        this.saveDollar = saveDollar;
        this.priceType = priceType;
        this.endDate = endDate;
        this.maxPrice = maxPrice;
        this.savePercent = savePercent;
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

    @JsonProperty("startDate")
    public Long getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("price")
    public Float getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Float price) {
        this.price = price;
    }

    @JsonProperty("eyebrow")
    public String getEyebrow() {
        return eyebrow;
    }

    @JsonProperty("eyebrow")
    public void setEyebrow(String eyebrow) {
        this.eyebrow = eyebrow;
    }

    @JsonProperty("formattedPrice")
    public String getFormattedPrice() {
        return formattedPrice;
    }

    @JsonProperty("formattedPrice")
    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    @JsonProperty("saveDollar")
    public Float getSaveDollar() {
        return saveDollar;
    }

    @JsonProperty("saveDollar")
    public void setSaveDollar(Float saveDollar) {
        this.saveDollar = saveDollar;
    }

    @JsonProperty("priceType")
    public String getPriceType() {
        return priceType;
    }

    @JsonProperty("priceType")
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    @JsonProperty("endDate")
    public Long getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("maxPrice")
    public Integer getMaxPrice() {
        return maxPrice;
    }

    @JsonProperty("maxPrice")
    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    @JsonProperty("savePercent")
    public Integer getSavePercent() {
        return savePercent;
    }

    @JsonProperty("savePercent")
    public void setSavePercent(Integer savePercent) {
        this.savePercent = savePercent;
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
