/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.aggregator.model;


import com.casestudy.myretail.pricingdetails.model.Pricing;
import com.casestudy.myretail.productclassification.model.ProductClassification;
import com.casestudy.myretail.vendor.model.Vendor;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "productId",
        "productName",
        "vendor",
        "productClassification",
        "pricing"
})
public class ProductAggregator implements Serializable {
    private final static long serialVersionUID = 4667912234585876409L;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("vendor")
    private Vendor vendor;
    @JsonProperty("productClassification")
    private ProductClassification productClassification;
    @JsonProperty("pricing")
    private Pricing pricing;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public ProductClassification getProductClassification() {
        return productClassification;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public ProductAggregator(){

    }

    public static class Builder {
        private String productId;

        private String productName;

        private Vendor vendor;

        private ProductClassification productClassification;

        private Pricing pricing;

        public Builder(String productId){
            this.productId = productId;
        }

        public Builder withVendor(Vendor vendor){
            this.vendor = vendor;
            return this;
        }
        public Builder withProductName(String productName){
            this.productName = productName;
            return this;
        }
        public Builder withPricing(Pricing pricing){
            this.pricing = pricing;
            return this;
        }
        public Builder withProductClassification(ProductClassification productClassification){
            this.productClassification = productClassification;
            return this;
        }



        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId =  productId;
        }

        public Vendor getVendor() {
            return vendor;
        }

        public void setVendor(Vendor vendor) {
            this.vendor = vendor;
        }

        public ProductClassification getProductClassification() {
            return productClassification;
        }

        public void setProductClassification(
                ProductClassification productClassification) {
            this.productClassification = productClassification;
        }

        public Pricing getPricing() {
            return pricing;
        }

        public void setPricing(Pricing pricing) {
            this.pricing = pricing;
        }


        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
        public ProductAggregator build(){
            ProductAggregator productAggregator = new ProductAggregator();
            productAggregator.productId= this.productId;
            productAggregator.productName = this.productName;
            productAggregator.pricing= this.pricing;
            productAggregator.productClassification = this.productClassification;
            productAggregator.vendor = this.vendor;
            return productAggregator;
        }

        @Override
        public String toString() {
            return "ProductAggregator{" +
                    "productId='" + productId + '\'' +
                    ", vendor=" + vendor +
                    ", productClassification=" + productClassification +
                    ", pricing=" + pricing +
                    '}';
        }
    }

}
