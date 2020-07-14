
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
    "AverageOverallRating",
    "RatingReviewTotal",
    "TotalReviewCount",
    "RatingsOnlyReviewCount",
    "RatingDistribution",
    "RecommendedCount",
    "NotRecommendedCount",
    "SecondaryRatingsAveragesOrder",
    "SecondaryRatingsAverages",
    "OverallRatingRange"
})
public class CoreStats implements Serializable
{

    @JsonProperty("AverageOverallRating")
    private Float averageOverallRating;
    @JsonProperty("RatingReviewTotal")
    private Integer ratingReviewTotal;
    @JsonProperty("TotalReviewCount")
    private Integer totalReviewCount;
    @JsonProperty("RatingsOnlyReviewCount")
    private Integer ratingsOnlyReviewCount;
    @JsonProperty("RatingDistribution")
    private List<RatingDistribution> ratingDistribution = null;
    @JsonProperty("RecommendedCount")
    private Integer recommendedCount;
    @JsonProperty("NotRecommendedCount")
    private Integer notRecommendedCount;
    @JsonProperty("SecondaryRatingsAveragesOrder")
    private List<Object> secondaryRatingsAveragesOrder = null;
    @JsonProperty("SecondaryRatingsAverages")
    private SecondaryRatingsAverages secondaryRatingsAverages;
    @JsonProperty("OverallRatingRange")
    private Integer overallRatingRange;
    private final static long serialVersionUID = -4941300262777650064L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CoreStats() {
    }

    /**
     * 
     * @param ratingReviewTotal
     * @param notRecommendedCount
     * @param secondaryRatingsAverages
     * @param ratingDistribution
     * @param secondaryRatingsAveragesOrder
     * @param ratingsOnlyReviewCount
     * @param overallRatingRange
     * @param recommendedCount
     * @param averageOverallRating
     * @param totalReviewCount
     */
    public CoreStats(Float averageOverallRating, Integer ratingReviewTotal, Integer totalReviewCount, Integer ratingsOnlyReviewCount, List<RatingDistribution> ratingDistribution, Integer recommendedCount, Integer notRecommendedCount, List<Object> secondaryRatingsAveragesOrder, SecondaryRatingsAverages secondaryRatingsAverages, Integer overallRatingRange) {
        super();
        this.averageOverallRating = averageOverallRating;
        this.ratingReviewTotal = ratingReviewTotal;
        this.totalReviewCount = totalReviewCount;
        this.ratingsOnlyReviewCount = ratingsOnlyReviewCount;
        this.ratingDistribution = ratingDistribution;
        this.recommendedCount = recommendedCount;
        this.notRecommendedCount = notRecommendedCount;
        this.secondaryRatingsAveragesOrder = secondaryRatingsAveragesOrder;
        this.secondaryRatingsAverages = secondaryRatingsAverages;
        this.overallRatingRange = overallRatingRange;
    }

    @JsonProperty("AverageOverallRating")
    public Float getAverageOverallRating() {
        return averageOverallRating;
    }

    @JsonProperty("AverageOverallRating")
    public void setAverageOverallRating(Float averageOverallRating) {
        this.averageOverallRating = averageOverallRating;
    }

    @JsonProperty("RatingReviewTotal")
    public Integer getRatingReviewTotal() {
        return ratingReviewTotal;
    }

    @JsonProperty("RatingReviewTotal")
    public void setRatingReviewTotal(Integer ratingReviewTotal) {
        this.ratingReviewTotal = ratingReviewTotal;
    }

    @JsonProperty("TotalReviewCount")
    public Integer getTotalReviewCount() {
        return totalReviewCount;
    }

    @JsonProperty("TotalReviewCount")
    public void setTotalReviewCount(Integer totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }

    @JsonProperty("RatingsOnlyReviewCount")
    public Integer getRatingsOnlyReviewCount() {
        return ratingsOnlyReviewCount;
    }

    @JsonProperty("RatingsOnlyReviewCount")
    public void setRatingsOnlyReviewCount(Integer ratingsOnlyReviewCount) {
        this.ratingsOnlyReviewCount = ratingsOnlyReviewCount;
    }

    @JsonProperty("RatingDistribution")
    public List<RatingDistribution> getRatingDistribution() {
        return ratingDistribution;
    }

    @JsonProperty("RatingDistribution")
    public void setRatingDistribution(List<RatingDistribution> ratingDistribution) {
        this.ratingDistribution = ratingDistribution;
    }

    @JsonProperty("RecommendedCount")
    public Integer getRecommendedCount() {
        return recommendedCount;
    }

    @JsonProperty("RecommendedCount")
    public void setRecommendedCount(Integer recommendedCount) {
        this.recommendedCount = recommendedCount;
    }

    @JsonProperty("NotRecommendedCount")
    public Integer getNotRecommendedCount() {
        return notRecommendedCount;
    }

    @JsonProperty("NotRecommendedCount")
    public void setNotRecommendedCount(Integer notRecommendedCount) {
        this.notRecommendedCount = notRecommendedCount;
    }

    @JsonProperty("SecondaryRatingsAveragesOrder")
    public List<Object> getSecondaryRatingsAveragesOrder() {
        return secondaryRatingsAveragesOrder;
    }

    @JsonProperty("SecondaryRatingsAveragesOrder")
    public void setSecondaryRatingsAveragesOrder(List<Object> secondaryRatingsAveragesOrder) {
        this.secondaryRatingsAveragesOrder = secondaryRatingsAveragesOrder;
    }

    @JsonProperty("SecondaryRatingsAverages")
    public SecondaryRatingsAverages getSecondaryRatingsAverages() {
        return secondaryRatingsAverages;
    }

    @JsonProperty("SecondaryRatingsAverages")
    public void setSecondaryRatingsAverages(SecondaryRatingsAverages secondaryRatingsAverages) {
        this.secondaryRatingsAverages = secondaryRatingsAverages;
    }

    @JsonProperty("OverallRatingRange")
    public Integer getOverallRatingRange() {
        return overallRatingRange;
    }

    @JsonProperty("OverallRatingRange")
    public void setOverallRatingRange(Integer overallRatingRange) {
        this.overallRatingRange = overallRatingRange;
    }

}
