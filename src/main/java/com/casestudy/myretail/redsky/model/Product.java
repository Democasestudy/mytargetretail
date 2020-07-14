
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
    "product"
})
public class Product implements Serializable
{

    @JsonProperty("product")
    private Product_ product;
    private final static long serialVersionUID = 4667912234585876409L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param product
     */
    public Product(Product_ product) {
        super();
        this.product = product;
    }

    @JsonProperty("product")
    public Product_ getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product_ product) {
        this.product = product;
    }

}
