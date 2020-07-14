
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
    "is_po_box_prohibited",
    "po_box_prohibited_message",
    "box_percent_filled_by_volume",
    "box_percent_filled_by_weight",
    "box_percent_filled_display"
})
public class Fulfillment implements Serializable
{

    @JsonProperty("is_po_box_prohibited")
    private Boolean isPoBoxProhibited;
    @JsonProperty("po_box_prohibited_message")
    private String poBoxProhibitedMessage;
    @JsonProperty("box_percent_filled_by_volume")
    private Float boxPercentFilledByVolume;
    @JsonProperty("box_percent_filled_by_weight")
    private Float boxPercentFilledByWeight;
    @JsonProperty("box_percent_filled_display")
    private Float boxPercentFilledDisplay;
    private final static long serialVersionUID = -8691271501839350908L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fulfillment() {
    }

    /**
     * 
     * @param boxPercentFilledByVolume
     * @param boxPercentFilledByWeight
     * @param isPoBoxProhibited
     * @param boxPercentFilledDisplay
     * @param poBoxProhibitedMessage
     */
    public Fulfillment(Boolean isPoBoxProhibited, String poBoxProhibitedMessage, Float boxPercentFilledByVolume, Float boxPercentFilledByWeight, Float boxPercentFilledDisplay) {
        super();
        this.isPoBoxProhibited = isPoBoxProhibited;
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
        this.boxPercentFilledByVolume = boxPercentFilledByVolume;
        this.boxPercentFilledByWeight = boxPercentFilledByWeight;
        this.boxPercentFilledDisplay = boxPercentFilledDisplay;
    }

    @JsonProperty("is_po_box_prohibited")
    public Boolean getIsPoBoxProhibited() {
        return isPoBoxProhibited;
    }

    @JsonProperty("is_po_box_prohibited")
    public void setIsPoBoxProhibited(Boolean isPoBoxProhibited) {
        this.isPoBoxProhibited = isPoBoxProhibited;
    }

    @JsonProperty("po_box_prohibited_message")
    public String getPoBoxProhibitedMessage() {
        return poBoxProhibitedMessage;
    }

    @JsonProperty("po_box_prohibited_message")
    public void setPoBoxProhibitedMessage(String poBoxProhibitedMessage) {
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
    }

    @JsonProperty("box_percent_filled_by_volume")
    public Float getBoxPercentFilledByVolume() {
        return boxPercentFilledByVolume;
    }

    @JsonProperty("box_percent_filled_by_volume")
    public void setBoxPercentFilledByVolume(Float boxPercentFilledByVolume) {
        this.boxPercentFilledByVolume = boxPercentFilledByVolume;
    }

    @JsonProperty("box_percent_filled_by_weight")
    public Float getBoxPercentFilledByWeight() {
        return boxPercentFilledByWeight;
    }

    @JsonProperty("box_percent_filled_by_weight")
    public void setBoxPercentFilledByWeight(Float boxPercentFilledByWeight) {
        this.boxPercentFilledByWeight = boxPercentFilledByWeight;
    }

    @JsonProperty("box_percent_filled_display")
    public Float getBoxPercentFilledDisplay() {
        return boxPercentFilledDisplay;
    }

    @JsonProperty("box_percent_filled_display")
    public void setBoxPercentFilledDisplay(Float boxPercentFilledDisplay) {
        this.boxPercentFilledDisplay = boxPercentFilledDisplay;
    }

}
