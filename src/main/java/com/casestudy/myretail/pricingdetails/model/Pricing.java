
/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.pricingdetails.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * The pricing schema
 * <p>
 * An explanation about the purpose of this instance.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "productId",
        "listPrice_price",
        "listPrice_formattedPrice",
        "offerPrice_startDate",
        "offerPrice_price",
        "offerPrice_formattedPrice",
        "offerPrice_saveDollar",
        "offerPrice_endDate",
        "offerPrice_savePercent"
})

@Document(collection="pricing")
public class Pricing implements Serializable
{
    @Id
    @JsonProperty("productId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String productId;


    /**
     * The productId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */

    /**
     * The listPrice_price schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("listPrice_price")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String listPricePrice = "";
    /**
     * The listPrice_formattedPrice schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("listPrice_formattedPrice")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String listPriceFormattedPrice = "";
    /**
     * The offerPrice_startDate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_startDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String offerPriceStartDate = "";
    /**
     * The offerPrice_price schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_price")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String offerPricePrice = "";
    /**
     * The offerPrice_formattedPrice schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_formattedPrice")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String offerPriceFormattedPrice = "";
    /**
     * The offerPrice_saveDollar schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_saveDollar")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String offerPriceSaveDollar = "";
    /**
     * The offerPrice_endDate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_endDate")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String offerPriceEndDate = "";
    /**
     * The offerPrice_savePercent schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_savePercent")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String offerPriceSavePercent = "";
    private final static long serialVersionUID = 5847788547190967661L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Pricing() {
    }

    /**
     *
     * @param offerPriceStartDate
     * @param productId
     * @param offerPriceEndDate
     * @param offerPricePrice
     * @param offerPriceSaveDollar
     * @param offerPriceFormattedPrice
     * @param listPricePrice
     * @param listPriceFormattedPrice
     * @param offerPriceSavePercent
     */
    public Pricing(String productId, String listPricePrice, String listPriceFormattedPrice, String offerPriceStartDate, String offerPricePrice, String offerPriceFormattedPrice, String offerPriceSaveDollar, String offerPriceEndDate, String offerPriceSavePercent) {
        super();
        this.productId = productId;
        this.listPricePrice = listPricePrice;
        this.listPriceFormattedPrice = listPriceFormattedPrice;
        this.offerPriceStartDate = offerPriceStartDate;
        this.offerPricePrice = offerPricePrice;
        this.offerPriceFormattedPrice = offerPriceFormattedPrice;
        this.offerPriceSaveDollar = offerPriceSaveDollar;
        this.offerPriceEndDate = offerPriceEndDate;
        this.offerPriceSavePercent = offerPriceSavePercent;
    }

    /**
     * The productId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    /**
     * The productId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * The listPrice_price schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("listPrice_price")
    public String getListPricePrice() {
        return listPricePrice;
    }

    /**
     * The listPrice_price schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("listPrice_price")
    public void setListPricePrice(String listPricePrice) {
        this.listPricePrice = listPricePrice;
    }

    /**
     * The listPrice_formattedPrice schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("listPrice_formattedPrice")
    public String getListPriceFormattedPrice() {
        return listPriceFormattedPrice;
    }

    /**
     * The listPrice_formattedPrice schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("listPrice_formattedPrice")
    public void setListPriceFormattedPrice(String listPriceFormattedPrice) {
        this.listPriceFormattedPrice = listPriceFormattedPrice;
    }

    /**
     * The offerPrice_startDate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_startDate")
    public String getOfferPriceStartDate() {
        return offerPriceStartDate;
    }

    /**
     * The offerPrice_startDate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_startDate")
    public void setOfferPriceStartDate(String offerPriceStartDate) {
        this.offerPriceStartDate = offerPriceStartDate;
    }

    /**
     * The offerPrice_price schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_price")
    public String getOfferPricePrice() {
        return offerPricePrice;
    }

    /**
     * The offerPrice_price schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_price")
    public void setOfferPricePrice(String offerPricePrice) {
        this.offerPricePrice = offerPricePrice;
    }

    /**
     * The offerPrice_formattedPrice schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_formattedPrice")
    public String getOfferPriceFormattedPrice() {
        return offerPriceFormattedPrice;
    }

    /**
     * The offerPrice_formattedPrice schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_formattedPrice")
    public void setOfferPriceFormattedPrice(String offerPriceFormattedPrice) {
        this.offerPriceFormattedPrice = offerPriceFormattedPrice;
    }

    /**
     * The offerPrice_saveDollar schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_saveDollar")
    public String getOfferPriceSaveDollar() {
        return offerPriceSaveDollar;
    }

    /**
     * The offerPrice_saveDollar schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_saveDollar")
    public void setOfferPriceSaveDollar(String offerPriceSaveDollar) {
        this.offerPriceSaveDollar = offerPriceSaveDollar;
    }

    /**
     * The offerPrice_endDate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_endDate")
    public String getOfferPriceEndDate() {
        return offerPriceEndDate;
    }

    /**
     * The offerPrice_endDate schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_endDate")
    public void setOfferPriceEndDate(String offerPriceEndDate) {
        this.offerPriceEndDate = offerPriceEndDate;
    }

    /**
     * The offerPrice_savePercent schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_savePercent")
    public String getOfferPriceSavePercent() {
        return offerPriceSavePercent;
    }

    /**
     * The offerPrice_savePercent schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     *
     */
    @JsonProperty("offerPrice_savePercent")
    public void setOfferPriceSavePercent(String offerPriceSavePercent) {
        this.offerPriceSavePercent = offerPriceSavePercent;
    }

}
