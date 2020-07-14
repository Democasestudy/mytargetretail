
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
    "itemBulky"
})
public class HandlingItemCharge implements Serializable
{

    @JsonProperty("itemBulky")
    private Boolean itemBulky;
    private final static long serialVersionUID = -7214220429372761001L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HandlingItemCharge() {
    }

    /**
     * 
     * @param itemBulky
     */
    public HandlingItemCharge(Boolean itemBulky) {
        super();
        this.itemBulky = itemBulky;
    }

    @JsonProperty("itemBulky")
    public Boolean getItemBulky() {
        return itemBulky;
    }

    @JsonProperty("itemBulky")
    public void setItemBulky(Boolean itemBulky) {
        this.itemBulky = itemBulky;
    }

}
