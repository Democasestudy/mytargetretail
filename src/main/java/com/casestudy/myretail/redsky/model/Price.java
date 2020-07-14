
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
    "partNumber",
    "listPrice",
    "offerPrice",
    "ppu",
    "mapPriceFlag",
    "channelAvailability"
})
public class Price implements Serializable
{

    @JsonProperty("partNumber")
    private String partNumber;
    @JsonProperty("listPrice")
    private ListPrice listPrice;
    @JsonProperty("offerPrice")
    private OfferPrice offerPrice;
    @JsonProperty("ppu")
    private String ppu;
    @JsonProperty("mapPriceFlag")
    private String mapPriceFlag;
    @JsonProperty("channelAvailability")
    private String channelAvailability;
    private final static long serialVersionUID = -7584171584481711748L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Price() {
    }

    /**
     * 
     * @param channelAvailability
     * @param offerPrice
     * @param ppu
     * @param partNumber
     * @param mapPriceFlag
     * @param listPrice
     */
    public Price(String partNumber, ListPrice listPrice, OfferPrice offerPrice, String ppu, String mapPriceFlag, String channelAvailability) {
        super();
        this.partNumber = partNumber;
        this.listPrice = listPrice;
        this.offerPrice = offerPrice;
        this.ppu = ppu;
        this.mapPriceFlag = mapPriceFlag;
        this.channelAvailability = channelAvailability;
    }

    @JsonProperty("partNumber")
    public String getPartNumber() {
        return partNumber;
    }

    @JsonProperty("partNumber")
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @JsonProperty("listPrice")
    public ListPrice getListPrice() {
        return listPrice;
    }

    @JsonProperty("listPrice")
    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("offerPrice")
    public OfferPrice getOfferPrice() {
        return offerPrice;
    }

    @JsonProperty("offerPrice")
    public void setOfferPrice(OfferPrice offerPrice) {
        this.offerPrice = offerPrice;
    }

    @JsonProperty("ppu")
    public String getPpu() {
        return ppu;
    }

    @JsonProperty("ppu")
    public void setPpu(String ppu) {
        this.ppu = ppu;
    }

    @JsonProperty("mapPriceFlag")
    public String getMapPriceFlag() {
        return mapPriceFlag;
    }

    @JsonProperty("mapPriceFlag")
    public void setMapPriceFlag(String mapPriceFlag) {
        this.mapPriceFlag = mapPriceFlag;
    }

    @JsonProperty("channelAvailability")
    public String getChannelAvailability() {
        return channelAvailability;
    }

    @JsonProperty("channelAvailability")
    public void setChannelAvailability(String channelAvailability) {
        this.channelAvailability = channelAvailability;
    }

}
