
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
    "offset",
    "totalResults",
    "limit",
    "duration"
})
public class RatingAndReviewReviews implements Serializable
{

    @JsonProperty("hasErrors")
    private Boolean hasErrors;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("totalResults")
    private Integer totalResults;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("duration")
    private Integer duration;
    private final static long serialVersionUID = -5699651283932790990L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RatingAndReviewReviews() {
    }

    /**
     * 
     * @param duration
     * @param totalResults
     * @param hasErrors
     * @param offset
     * @param limit
     */
    public RatingAndReviewReviews(Boolean hasErrors, Integer offset, Integer totalResults, Integer limit, Integer duration) {
        super();
        this.hasErrors = hasErrors;
        this.offset = offset;
        this.totalResults = totalResults;
        this.limit = limit;
        this.duration = duration;
    }

    @JsonProperty("hasErrors")
    public Boolean getHasErrors() {
        return hasErrors;
    }

    @JsonProperty("hasErrors")
    public void setHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("totalResults")
    public Integer getTotalResults() {
        return totalResults;
    }

    @JsonProperty("totalResults")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}
