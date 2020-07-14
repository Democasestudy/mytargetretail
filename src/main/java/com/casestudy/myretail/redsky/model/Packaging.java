
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
    "is_retail_ticketed"
})
public class Packaging implements Serializable
{

    @JsonProperty("is_retail_ticketed")
    private Boolean isRetailTicketed;
    private final static long serialVersionUID = 2892605216105047692L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Packaging() {
    }

    /**
     * 
     * @param isRetailTicketed
     */
    public Packaging(Boolean isRetailTicketed) {
        super();
        this.isRetailTicketed = isRetailTicketed;
    }

    @JsonProperty("is_retail_ticketed")
    public Boolean getIsRetailTicketed() {
        return isRetailTicketed;
    }

    @JsonProperty("is_retail_ticketed")
    public void setIsRetailTicketed(Boolean isRetailTicketed) {
        this.isRetailTicketed = isRetailTicketed;
    }

}
