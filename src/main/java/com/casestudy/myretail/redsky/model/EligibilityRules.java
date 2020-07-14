
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
    "hold",
    "ship_to_guest",
    "scheduled_delivery"
})
public class EligibilityRules implements Serializable
{

    @JsonProperty("hold")
    private Hold hold;
    @JsonProperty("ship_to_guest")
    private ShipToGuest shipToGuest;
    @JsonProperty("scheduled_delivery")
    private ScheduledDelivery scheduledDelivery;
    private final static long serialVersionUID = 149701962312835073L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EligibilityRules() {
    }

    /**
     * 
     * @param scheduledDelivery
     * @param shipToGuest
     * @param hold
     */
    public EligibilityRules(Hold hold, ShipToGuest shipToGuest, ScheduledDelivery scheduledDelivery) {
        super();
        this.hold = hold;
        this.shipToGuest = shipToGuest;
        this.scheduledDelivery = scheduledDelivery;
    }

    @JsonProperty("hold")
    public Hold getHold() {
        return hold;
    }

    @JsonProperty("hold")
    public void setHold(Hold hold) {
        this.hold = hold;
    }

    @JsonProperty("ship_to_guest")
    public ShipToGuest getShipToGuest() {
        return shipToGuest;
    }

    @JsonProperty("ship_to_guest")
    public void setShipToGuest(ShipToGuest shipToGuest) {
        this.shipToGuest = shipToGuest;
    }

    @JsonProperty("scheduled_delivery")
    public ScheduledDelivery getScheduledDelivery() {
        return scheduledDelivery;
    }

    @JsonProperty("scheduled_delivery")
    public void setScheduledDelivery(ScheduledDelivery scheduledDelivery) {
        this.scheduledDelivery = scheduledDelivery;
    }

}
