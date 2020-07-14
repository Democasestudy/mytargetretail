
/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.vendor.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * The vendor schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "vendor_name",
    "vendor_code",
    "vendor_country",
    "vendor_category"
})

@Document(collection="vendor")
public class Vendor implements Serializable {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The productId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("productId")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String productId = "";
    /**
     * The vendor_name schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_name")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String vendorName ;
    /**
     * The vendor_code schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_code")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String vendorCode;
    /**
     * The vendor_country schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_country")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String vendorCountry ;
    /**
     * The vendor_category schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_category")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String vendorCategory ;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Vendor() {
    }

    /**
     * 
     * @param vendorCategory
     * @param productId
     * @param vendorName
     * @param vendorCountry
     * @param vendorCode
     */
    public Vendor(String productId, String vendorName, String vendorCode, String vendorCountry, String vendorCategory) {
        super();
        this.productId = productId;
        this.vendorName = vendorName;
        this.vendorCode = vendorCode;
        this.vendorCountry = vendorCountry;
        this.vendorCategory = vendorCategory;
    }

    /**
     * The productId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    /**
     * The productId schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * The vendor_name schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_name")
    public String getVendorName() {
        return vendorName;
    }

    /**
     * The vendor_name schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_name")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * The vendor_code schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_code")
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * The vendor_code schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_code")
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /**
     * The vendor_country schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_country")
    public String getVendorCountry() {
        return vendorCountry;
    }

    /**
     * The vendor_country schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_country")
    public void setVendorCountry(String vendorCountry) {
        this.vendorCountry = vendorCountry;
    }

    /**
     * The vendor_category schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_category")
    public String getVendorCategory() {
        return vendorCategory;
    }

    /**
     * The vendor_category schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("vendor_category")
    public void setVendorCategory(String vendorCategory) {
        this.vendorCategory = vendorCategory;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "productId='" + productId + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", vendorCode='" + vendorCode + '\'' +
                ", vendorCountry='" + vendorCountry + '\'' +
                ", vendorCategory='" + vendorCategory + '\'' +
                '}';
    }
}
