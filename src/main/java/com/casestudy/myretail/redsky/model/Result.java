
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
    "13860428"
})
public class Result implements Serializable
{

    @JsonProperty("13860428")
    private com.casestudy.myretail.redsky.model._13860428 _13860428;
    private final static long serialVersionUID = -9128140166843160191L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param _13860428
     */
    public Result(com.casestudy.myretail.redsky.model._13860428 _13860428) {
        super();
        this._13860428 = _13860428;
    }

    @JsonProperty("13860428")
    public com.casestudy.myretail.redsky.model._13860428 get13860428() {
        return _13860428;
    }

    @JsonProperty("13860428")
    public void set13860428(com.casestudy.myretail.redsky.model._13860428 _13860428) {
        this._13860428 = _13860428;
    }

}
