
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
    "tcin",
    "handlingItemCharge"
})
public class Tcin implements Serializable
{

    @JsonProperty("tcin")
    private String tcin;
    @JsonProperty("handlingItemCharge")
    private HandlingItemCharge handlingItemCharge;
    private final static long serialVersionUID = 3630979815486470180L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tcin() {
    }

    /**
     * 
     * @param tcin
     * @param handlingItemCharge
     */
    public Tcin(String tcin, HandlingItemCharge handlingItemCharge) {
        super();
        this.tcin = tcin;
        this.handlingItemCharge = handlingItemCharge;
    }

    @JsonProperty("tcin")
    public String getTcin() {
        return tcin;
    }

    @JsonProperty("tcin")
    public void setTcin(String tcin) {
        this.tcin = tcin;
    }

    @JsonProperty("handlingItemCharge")
    public HandlingItemCharge getHandlingItemCharge() {
        return handlingItemCharge;
    }

    @JsonProperty("handlingItemCharge")
    public void setHandlingItemCharge(HandlingItemCharge handlingItemCharge) {
        this.handlingItemCharge = handlingItemCharge;
    }

}
