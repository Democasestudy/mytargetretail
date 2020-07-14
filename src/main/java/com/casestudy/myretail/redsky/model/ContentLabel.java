
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
    "image_url"
})
public class ContentLabel implements Serializable
{

    @JsonProperty("image_url")
    private String imageUrl;
    private final static long serialVersionUID = -4434360734879995572L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContentLabel() {
    }

    /**
     * 
     * @param imageUrl
     */
    public ContentLabel(String imageUrl) {
        super();
        this.imageUrl = imageUrl;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
