
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
    "title",
    "downstream_description",
    "bullet_description"
})
public class ProductDescription implements Serializable
{

    @JsonProperty("title")
    private String title;
    @JsonProperty("downstream_description")
    private String downstreamDescription;
    @JsonProperty("bullet_description")
    private List<String> bulletDescription = null;
    private final static long serialVersionUID = 702511832716632521L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductDescription() {
    }

    /**
     * 
     * @param bulletDescription
     * @param downstreamDescription
     * @param title
     */
    public ProductDescription(String title, String downstreamDescription, List<String> bulletDescription) {
        super();
        this.title = title;
        this.downstreamDescription = downstreamDescription;
        this.bulletDescription = bulletDescription;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("downstream_description")
    public String getDownstreamDescription() {
        return downstreamDescription;
    }

    @JsonProperty("downstream_description")
    public void setDownstreamDescription(String downstreamDescription) {
        this.downstreamDescription = downstreamDescription;
    }

    @JsonProperty("bullet_description")
    public List<String> getBulletDescription() {
        return bulletDescription;
    }

    @JsonProperty("bullet_description")
    public void setBulletDescription(List<String> bulletDescription) {
        this.bulletDescription = bulletDescription;
    }

}
