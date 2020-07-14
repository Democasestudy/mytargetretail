
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
    "coreStats",
    "photoInfoList",
    "secondaryRatingFields",
    "expertReviewContentMetadata",
    "hasVerified"
})
public class _13860428 implements Serializable
{

    @JsonProperty("coreStats")
    private CoreStats coreStats;
    @JsonProperty("photoInfoList")
    private List<Object> photoInfoList = null;
    @JsonProperty("secondaryRatingFields")
    private List<Object> secondaryRatingFields = null;
    @JsonProperty("expertReviewContentMetadata")
    private List<ExpertReviewContentMetadatum> expertReviewContentMetadata = null;
    @JsonProperty("hasVerified")
    private Boolean hasVerified;
    private final static long serialVersionUID = -3878070137047033227L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public _13860428() {
    }

    /**
     * 
     * @param coreStats
     * @param photoInfoList
     * @param hasVerified
     * @param secondaryRatingFields
     * @param expertReviewContentMetadata
     */
    public _13860428(CoreStats coreStats, List<Object> photoInfoList, List<Object> secondaryRatingFields, List<ExpertReviewContentMetadatum> expertReviewContentMetadata, Boolean hasVerified) {
        super();
        this.coreStats = coreStats;
        this.photoInfoList = photoInfoList;
        this.secondaryRatingFields = secondaryRatingFields;
        this.expertReviewContentMetadata = expertReviewContentMetadata;
        this.hasVerified = hasVerified;
    }

    @JsonProperty("coreStats")
    public CoreStats getCoreStats() {
        return coreStats;
    }

    @JsonProperty("coreStats")
    public void setCoreStats(CoreStats coreStats) {
        this.coreStats = coreStats;
    }

    @JsonProperty("photoInfoList")
    public List<Object> getPhotoInfoList() {
        return photoInfoList;
    }

    @JsonProperty("photoInfoList")
    public void setPhotoInfoList(List<Object> photoInfoList) {
        this.photoInfoList = photoInfoList;
    }

    @JsonProperty("secondaryRatingFields")
    public List<Object> getSecondaryRatingFields() {
        return secondaryRatingFields;
    }

    @JsonProperty("secondaryRatingFields")
    public void setSecondaryRatingFields(List<Object> secondaryRatingFields) {
        this.secondaryRatingFields = secondaryRatingFields;
    }

    @JsonProperty("expertReviewContentMetadata")
    public List<ExpertReviewContentMetadatum> getExpertReviewContentMetadata() {
        return expertReviewContentMetadata;
    }

    @JsonProperty("expertReviewContentMetadata")
    public void setExpertReviewContentMetadata(List<ExpertReviewContentMetadatum> expertReviewContentMetadata) {
        this.expertReviewContentMetadata = expertReviewContentMetadata;
    }

    @JsonProperty("hasVerified")
    public Boolean getHasVerified() {
        return hasVerified;
    }

    @JsonProperty("hasVerified")
    public void setHasVerified(Boolean hasVerified) {
        this.hasVerified = hasVerified;
    }

}
