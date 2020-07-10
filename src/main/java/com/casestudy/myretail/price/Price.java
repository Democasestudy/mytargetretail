/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.price;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import java.util.Locale;

public class Price {



    private StringBuilder pricewithCurrency;

    private BigDecimal price;
    private Locale locale;
    private String productId;

    public Price(BigDecimal price, Locale locale, String productId) {
        this.price = price.setScale(2, RoundingMode.HALF_EVEN);
        this.locale = locale;
        this.productId = productId;
        Currency currency = Currency.getInstance(this.locale);
        this.pricewithCurrency = new StringBuilder(String.valueOf(this.price)).append(currency.getSymbol());
    }

    public StringBuilder getPricewithCurrency() {
        return pricewithCurrency;
    }

    public void setPricewithCurrency(StringBuilder pricewithCurrency) {
        this.pricewithCurrency = pricewithCurrency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Price{" +
                "pricewithCurrency='" + pricewithCurrency + '\'' +
                ", price=" + price +
                ", locale=" + locale +
                ", productId='" + productId + '\'' +
                '}';
    }
}
