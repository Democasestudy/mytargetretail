/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.price;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.stereotype.Component;

@Component
public class PriceDAOService {
    private static List<Price> priceList = new ArrayList<>();

    private static int pricecount = 4;

    static {
        priceList.add(new Price( new BigDecimal(156.333),new Locale("","IN"),"11111111"));
        priceList.add(new Price( new BigDecimal(22.3232),new Locale("","IN"),"11121111"));
        priceList.add(new Price( new BigDecimal(22.3232),Locale.CANADA,"111311111"));
        priceList.add(new Price( new BigDecimal(22.3232),Locale.US,"11141111"));
    }
    public List<Price> findAll(){
        return priceList;
    }
    
    public Price save (Price price){
        priceList.add(price);
        return price;
    }

    public Price findPriceforProduct(String productId) {
        for (Price price : priceList) {
            if (price.getProductId().equalsIgnoreCase(productId)) {
                return price;
            }
        }
            return null;
    }
}
