
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
    "type",
    "name"
})
public class ItemType implements Serializable
{

    @JsonProperty("type")
    private Integer type;
    @JsonProperty("name")
    private String name;
    private final static long serialVersionUID = 622382565011952247L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemType() {
    }

    /**
     * 
     * @param name
     * @param type
     */
    public ItemType(Integer type, String name) {
        super();
        this.type = type;
        this.name = name;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
