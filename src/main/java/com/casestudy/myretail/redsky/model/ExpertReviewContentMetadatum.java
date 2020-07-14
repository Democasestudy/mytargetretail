
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
    "url",
    "lastUpdated",
    "vendor",
    "partNumber"
})
public class ExpertReviewContentMetadatum implements Serializable
{

    @JsonProperty("url")
    private String url;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("partNumber")
    private String partNumber;
    private final static long serialVersionUID = -6709225950837248518L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExpertReviewContentMetadatum() {
    }

    /**
     * 
     * @param lastUpdated
     * @param vendor
     * @param partNumber
     * @param url
     */
    public ExpertReviewContentMetadatum(String url, String lastUpdated, String vendor, String partNumber) {
        super();
        this.url = url;
        this.lastUpdated = lastUpdated;
        this.vendor = vendor;
        this.partNumber = partNumber;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @JsonProperty("partNumber")
    public String getPartNumber() {
        return partNumber;
    }

    @JsonProperty("partNumber")
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

}
