
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
    "tcins"
})
public class BulkShip implements Serializable
{

    @JsonProperty("tcins")
    private List<Tcin> tcins = null;
    private final static long serialVersionUID = 8733395249150858014L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BulkShip() {
    }

    /**
     * 
     * @param tcins
     */
    public BulkShip(List<Tcin> tcins) {
        super();
        this.tcins = tcins;
    }

    @JsonProperty("tcins")
    public List<Tcin> getTcins() {
        return tcins;
    }

    @JsonProperty("tcins")
    public void setTcins(List<Tcin> tcins) {
        this.tcins = tcins;
    }

}
