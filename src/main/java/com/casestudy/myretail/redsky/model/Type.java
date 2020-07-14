
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
    "appliedTo",
    "description"
})
public class Type implements Serializable
{

    @JsonProperty("appliedTo")
    private String appliedTo;
    @JsonProperty("description")
    private String description;
    private final static long serialVersionUID = -2975007398500994330L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Type() {
    }

    /**
     * 
     * @param appliedTo
     * @param description
     */
    public Type(String appliedTo, String description) {
        super();
        this.appliedTo = appliedTo;
        this.description = description;
    }

    @JsonProperty("appliedTo")
    public String getAppliedTo() {
        return appliedTo;
    }

    @JsonProperty("appliedTo")
    public void setAppliedTo(String appliedTo) {
        this.appliedTo = appliedTo;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

}
