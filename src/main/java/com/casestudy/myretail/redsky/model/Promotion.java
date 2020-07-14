
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
    "subscriptionShippingMessage",
    "callout",
    "promotionList"
})
public class Promotion implements Serializable
{

    @JsonProperty("subscriptionShippingMessage")
    private String subscriptionShippingMessage;
    @JsonProperty("callout")
    private Callout callout;
    @JsonProperty("promotionList")
    private List<Object> promotionList = null;
    private final static long serialVersionUID = 4387496707914679024L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Promotion() {
    }

    /**
     * 
     * @param callout
     * @param subscriptionShippingMessage
     * @param promotionList
     */
    public Promotion(String subscriptionShippingMessage, Callout callout, List<Object> promotionList) {
        super();
        this.subscriptionShippingMessage = subscriptionShippingMessage;
        this.callout = callout;
        this.promotionList = promotionList;
    }

    @JsonProperty("subscriptionShippingMessage")
    public String getSubscriptionShippingMessage() {
        return subscriptionShippingMessage;
    }

    @JsonProperty("subscriptionShippingMessage")
    public void setSubscriptionShippingMessage(String subscriptionShippingMessage) {
        this.subscriptionShippingMessage = subscriptionShippingMessage;
    }

    @JsonProperty("callout")
    public Callout getCallout() {
        return callout;
    }

    @JsonProperty("callout")
    public void setCallout(Callout callout) {
        this.callout = callout;
    }

    @JsonProperty("promotionList")
    public List<Object> getPromotionList() {
        return promotionList;
    }

    @JsonProperty("promotionList")
    public void setPromotionList(List<Object> promotionList) {
        this.promotionList = promotionList;
    }

}
