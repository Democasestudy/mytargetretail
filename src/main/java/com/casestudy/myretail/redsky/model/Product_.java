
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
    "available_to_promise_network",
    "question_answer_statistics",
    "rating_and_review_reviews",
    "bulk_ship",
    "rating_and_review_statistics",
    "promotion",
    "price",
    "item",
    "circle_offers"
})
public class Product_ implements Serializable
{

    @JsonProperty("available_to_promise_network")
    private AvailableToPromiseNetwork availableToPromiseNetwork;
    @JsonProperty("question_answer_statistics")
    private QuestionAnswerStatistics questionAnswerStatistics;
    @JsonProperty("rating_and_review_reviews")
    private RatingAndReviewReviews ratingAndReviewReviews;
    @JsonProperty("bulk_ship")
    private BulkShip bulkShip;
    @JsonProperty("rating_and_review_statistics")
    private RatingAndReviewStatistics ratingAndReviewStatistics;
    @JsonProperty("promotion")
    private Promotion promotion;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("item")
    private Item item;
    @JsonProperty("circle_offers")
    private CircleOffers circleOffers;
    private final static long serialVersionUID = 4895761841874407610L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product_() {
    }

    /**
     * 
     * @param item
     * @param ratingAndReviewStatistics
     * @param price
     * @param questionAnswerStatistics
     * @param ratingAndReviewReviews
     * @param bulkShip
     * @param circleOffers
     * @param availableToPromiseNetwork
     * @param promotion
     */
    public Product_(AvailableToPromiseNetwork availableToPromiseNetwork, QuestionAnswerStatistics questionAnswerStatistics, RatingAndReviewReviews ratingAndReviewReviews, BulkShip bulkShip, RatingAndReviewStatistics ratingAndReviewStatistics, Promotion promotion, Price price, Item item, CircleOffers circleOffers) {
        super();
        this.availableToPromiseNetwork = availableToPromiseNetwork;
        this.questionAnswerStatistics = questionAnswerStatistics;
        this.ratingAndReviewReviews = ratingAndReviewReviews;
        this.bulkShip = bulkShip;
        this.ratingAndReviewStatistics = ratingAndReviewStatistics;
        this.promotion = promotion;
        this.price = price;
        this.item = item;
        this.circleOffers = circleOffers;
    }

    @JsonProperty("available_to_promise_network")
    public AvailableToPromiseNetwork getAvailableToPromiseNetwork() {
        return availableToPromiseNetwork;
    }

    @JsonProperty("available_to_promise_network")
    public void setAvailableToPromiseNetwork(AvailableToPromiseNetwork availableToPromiseNetwork) {
        this.availableToPromiseNetwork = availableToPromiseNetwork;
    }

    @JsonProperty("question_answer_statistics")
    public QuestionAnswerStatistics getQuestionAnswerStatistics() {
        return questionAnswerStatistics;
    }

    @JsonProperty("question_answer_statistics")
    public void setQuestionAnswerStatistics(QuestionAnswerStatistics questionAnswerStatistics) {
        this.questionAnswerStatistics = questionAnswerStatistics;
    }

    @JsonProperty("rating_and_review_reviews")
    public RatingAndReviewReviews getRatingAndReviewReviews() {
        return ratingAndReviewReviews;
    }

    @JsonProperty("rating_and_review_reviews")
    public void setRatingAndReviewReviews(RatingAndReviewReviews ratingAndReviewReviews) {
        this.ratingAndReviewReviews = ratingAndReviewReviews;
    }

    @JsonProperty("bulk_ship")
    public BulkShip getBulkShip() {
        return bulkShip;
    }

    @JsonProperty("bulk_ship")
    public void setBulkShip(BulkShip bulkShip) {
        this.bulkShip = bulkShip;
    }

    @JsonProperty("rating_and_review_statistics")
    public RatingAndReviewStatistics getRatingAndReviewStatistics() {
        return ratingAndReviewStatistics;
    }

    @JsonProperty("rating_and_review_statistics")
    public void setRatingAndReviewStatistics(RatingAndReviewStatistics ratingAndReviewStatistics) {
        this.ratingAndReviewStatistics = ratingAndReviewStatistics;
    }

    @JsonProperty("promotion")
    public Promotion getPromotion() {
        return promotion;
    }

    @JsonProperty("promotion")
    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
    }

    @JsonProperty("circle_offers")
    public CircleOffers getCircleOffers() {
        return circleOffers;
    }

    @JsonProperty("circle_offers")
    public void setCircleOffers(CircleOffers circleOffers) {
        this.circleOffers = circleOffers;
    }

}
