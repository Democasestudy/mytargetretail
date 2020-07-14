
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
    "Count",
    "RatingValue"
})
public class RatingDistribution implements Serializable
{

    @JsonProperty("Count")
    private Integer count;
    @JsonProperty("RatingValue")
    private Integer ratingValue;
    private final static long serialVersionUID = 600892784307942048L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RatingDistribution() {
    }

    /**
     * 
     * @param ratingValue
     * @param count
     */
    public RatingDistribution(Integer count, Integer ratingValue) {
        super();
        this.count = count;
        this.ratingValue = ratingValue;
    }

    @JsonProperty("Count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("Count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("RatingValue")
    public Integer getRatingValue() {
        return ratingValue;
    }

    @JsonProperty("RatingValue")
    public void setRatingValue(Integer ratingValue) {
        this.ratingValue = ratingValue;
    }

}
