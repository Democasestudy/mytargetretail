
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
    "productId",
    "questionCount"
})
public class QuestionAnswerStatistics implements Serializable
{

    @JsonProperty("productId")
    private String productId;
    @JsonProperty("questionCount")
    private Integer questionCount;
    private final static long serialVersionUID = -6475189268226104747L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public QuestionAnswerStatistics() {
    }

    /**
     * 
     * @param questionCount
     * @param productId
     */
    public QuestionAnswerStatistics(String productId, Integer questionCount) {
        super();
        this.productId = productId;
        this.questionCount = questionCount;
    }

    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("questionCount")
    public Integer getQuestionCount() {
        return questionCount;
    }

    @JsonProperty("questionCount")
    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

}
