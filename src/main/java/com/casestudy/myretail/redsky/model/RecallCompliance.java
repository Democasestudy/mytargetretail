
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
    "is_product_recalled"
})
public class RecallCompliance implements Serializable
{

    @JsonProperty("is_product_recalled")
    private Boolean isProductRecalled;
    private final static long serialVersionUID = 5758170420387734162L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RecallCompliance() {
    }

    /**
     * 
     * @param isProductRecalled
     */
    public RecallCompliance(Boolean isProductRecalled) {
        super();
        this.isProductRecalled = isProductRecalled;
    }

    @JsonProperty("is_product_recalled")
    public Boolean getIsProductRecalled() {
        return isProductRecalled;
    }

    @JsonProperty("is_product_recalled")
    public void setIsProductRecalled(Boolean isProductRecalled) {
        this.isProductRecalled = isProductRecalled;
    }

}
