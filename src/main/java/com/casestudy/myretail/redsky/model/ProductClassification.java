
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
    "product_type",
    "product_type_name",
    "item_type_name",
    "item_type"
})
public class ProductClassification implements Serializable
{

    @JsonProperty("product_type")
    private String productType;
    @JsonProperty("product_type_name")
    private String productTypeName;
    @JsonProperty("item_type_name")
    private String itemTypeName;
    @JsonProperty("item_type")
    private ItemType itemType;
    private final static long serialVersionUID = -7075572907940656258L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductClassification() {
    }

    /**
     * 
     * @param itemType
     * @param productTypeName
     * @param itemTypeName
     * @param productType
     */
    public ProductClassification(String productType, String productTypeName, String itemTypeName, ItemType itemType) {
        super();
        this.productType = productType;
        this.productTypeName = productTypeName;
        this.itemTypeName = itemTypeName;
        this.itemType = itemType;
    }

    @JsonProperty("product_type")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("product_type")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @JsonProperty("product_type_name")
    public String getProductTypeName() {
        return productTypeName;
    }

    @JsonProperty("product_type_name")
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    @JsonProperty("item_type_name")
    public String getItemTypeName() {
        return itemTypeName;
    }

    @JsonProperty("item_type_name")
    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    @JsonProperty("item_type")
    public ItemType getItemType() {
        return itemType;
    }

    @JsonProperty("item_type")
    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

}
