
/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.redsky.model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_url",
    "primary",
    "content_labels"
})
public class Image implements Serializable
{

    @JsonProperty("base_url")
    private String baseUrl;
    @JsonProperty("primary")
    private String primary;
    @JsonProperty("content_labels")
    private List<ContentLabel> contentLabels = null;
    private final static long serialVersionUID = 399607903199112935L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param baseUrl
     * @param primary
     * @param contentLabels
     */
    public Image(String baseUrl, String primary, List<ContentLabel> contentLabels) {
        super();
        this.baseUrl = baseUrl;
        this.primary = primary;
        this.contentLabels = contentLabels;
    }

    @JsonProperty("base_url")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("base_url")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @JsonProperty("primary")
    public String getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(String primary) {
        this.primary = primary;
    }

    @JsonProperty("content_labels")
    public List<ContentLabel> getContentLabels() {
        return contentLabels;
    }

    @JsonProperty("content_labels")
    public void setContentLabels(List<ContentLabel> contentLabels) {
        this.contentLabels = contentLabels;
    }

}
