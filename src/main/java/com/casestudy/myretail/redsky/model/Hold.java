
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
    "is_active"
})
public class Hold implements Serializable
{

    @JsonProperty("is_active")
    private Boolean isActive;
    private final static long serialVersionUID = 6047770538440836915L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hold() {
    }

    /**
     * 
     * @param isActive
     */
    public Hold(Boolean isActive) {
        super();
        this.isActive = isActive;
    }

    @JsonProperty("is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
