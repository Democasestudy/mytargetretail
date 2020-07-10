/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.product;

public class Product {

    private String productId;
    private String productName;
    private String productCountryofOrigin;

  public Product(String productId, String productName, String productCountryofOrigin) {
        this.productId = productId;
        this.productName = productName;
        this.productCountryofOrigin = productCountryofOrigin;
    }

    public String getProductCountryofOrigin() {
        return productCountryofOrigin;
    }

    public void setProductCountryofOrigin(String productCountryofOrigin) {
        this.productCountryofOrigin = productCountryofOrigin;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productCountryofOrigin='" + productCountryofOrigin + '\'' +
                '}';
    }
}
