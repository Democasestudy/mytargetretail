
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
    "hasErrors",
    "result"
})
public class RatingAndReviewStatistics implements Serializable
{

    @JsonProperty("hasErrors")
    private Boolean hasErrors;
    @JsonProperty("result")
    private Result result;
    private final static long serialVersionUID = -1888043545503084103L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RatingAndReviewStatistics() {
    }

    /**
     * 
     * @param result
     * @param hasErrors
     */
    public RatingAndReviewStatistics(Boolean hasErrors, Result result) {
        super();
        this.hasErrors = hasErrors;
        this.result = result;
    }

    @JsonProperty("hasErrors")
    public Boolean getHasErrors() {
        return hasErrors;
    }

    @JsonProperty("hasErrors")
    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

}
