/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.product;

import java.math.BigDecimal;

public class RedskyProduct {

    private String producttype;
    private String subscriptionShippingMessage;
    private boolean giftWrapable;
    private BigDecimal weight;
    private BigDecimal depth;
    private BigDecimal height;
    private String productId;
    private String productName;
    private String productCountryofOrigin;


    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public String getSubscriptionShippingMessage() {
        return subscriptionShippingMessage;
    }

    public void setSubscriptionShippingMessage(String subscriptionShippingMessage) {
        this.subscriptionShippingMessage = subscriptionShippingMessage;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
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


    public RedskyProduct(String producttype, String subscriptionShippingMessage, boolean giftWrapable,
            BigDecimal weight, BigDecimal depth, BigDecimal height, String productId, String productName,
            String productCountryofOrigin) {
        this.producttype = producttype;
        this.subscriptionShippingMessage = subscriptionShippingMessage;
        this.giftWrapable = giftWrapable;
        this.weight = weight;
        this.depth = depth;
        this.height = height;
        this.productId = productId;
        this.productName = productName;
        this.productCountryofOrigin = productCountryofOrigin;
    }
}
