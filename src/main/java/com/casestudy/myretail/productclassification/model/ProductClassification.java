
/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.productclassification.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * The product_classification schema
 * <p>
 * An explanation about the purpose of this instance.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_type",
    "product_brand",
    "product_type_name",
        "productId"
})

@Document(collection="productclassification")
public class ProductClassification implements Serializable
{
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * The product_type schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("product_type")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String productType = "";
    /**
     * The product_brand schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("product_brand")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String productBrand = "";
    /**
     * The product_type_name schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("product_type_name")
    @JsonPropertyDescription("An explanation about the purpose of this instance.")
    private String productTypeName = "";
    @JsonIgnore
    private final static long serialVersionUID = 417878151054127065L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductClassification()  {
    }

    /**
     * 
     * @param productBrand
     * @param productTypeName
     * @param productType
     */
    public ProductClassification(String productType, String productBrand, String productTypeName,String productId) {
        super();
        this.productType = productType;
        this.productBrand = productBrand;
        this.productTypeName = productTypeName;
        this.productId = productId;
    }

    /**
     * The product_type schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("product_type")
    public String getProductType() {
        return productType;
    }

    /**
     * The product_type schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("product_type")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * The product_brand schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("product_brand")
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * The product_brand schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("product_brand")
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    /**
     * The product_type_name schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("product_type_name")
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * The product_type_name schema
     * <p>
     * An explanation about the purpose of this instance.
     * (Required)
     * 
     */
    @JsonProperty("product_type_name")
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    @Override
    public String toString() {
        return "ProductClassification{" +
                "productType='" + productType + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", productId='" + productId + '\'' +
                ", productTypeName='" + productTypeName + '\'' +
                '}';
    }
}
