
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
    "text",
    "type"
})
public class Callout implements Serializable
{

    @JsonProperty("text")
    private String text;
    @JsonProperty("type")
    private Type type;
    private final static long serialVersionUID = 5638021623744670460L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Callout() {
    }

    /**
     * 
     * @param text
     * @param type
     */
    public Callout(String text, Type type) {
        super();
        this.text = text;
        this.type = type;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

}
