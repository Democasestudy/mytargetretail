
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
    "id",
    "manufacturer_style",
    "vendor_name"
})
public class ProductVendor implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("manufacturer_style")
    private String manufacturerStyle;
    @JsonProperty("vendor_name")
    private String vendorName;
    private final static long serialVersionUID = 6825433865706403058L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductVendor() {
    }

    /**
     * 
     * @param id
     * @param manufacturerStyle
     * @param vendorName
     */
    public ProductVendor(String id, String manufacturerStyle, String vendorName) {
        super();
        this.id = id;
        this.manufacturerStyle = manufacturerStyle;
        this.vendorName = vendorName;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("manufacturer_style")
    public String getManufacturerStyle() {
        return manufacturerStyle;
    }

    @JsonProperty("manufacturer_style")
    public void setManufacturerStyle(String manufacturerStyle) {
        this.manufacturerStyle = manufacturerStyle;
    }

    @JsonProperty("vendor_name")
    public String getVendorName() {
        return vendorName;
    }

    @JsonProperty("vendor_name")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

}
