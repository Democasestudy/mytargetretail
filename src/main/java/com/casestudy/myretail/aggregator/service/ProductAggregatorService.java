/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.aggregator.service;

import com.casestudy.myretail.aggregator.model.ProductAggregator;
import com.casestudy.myretail.pricingdetails.model.Pricing;
import com.casestudy.myretail.pricingdetails.service.PricingService;
import com.casestudy.myretail.productclassification.model.ProductClassification;
import com.casestudy.myretail.productclassification.service.ProductClassificationService;
import com.casestudy.myretail.vendor.model.Vendor;
import com.casestudy.myretail.vendor.service.VendorService;
import java.util.Arrays;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductAggregatorService {
    @Autowired
    VendorService vendorService;

    @Autowired
    ProductClassificationService productClassificationService;

    @Autowired
    PricingService pricingService;

    @Autowired
    RestTemplate restTemplate;

    private String getProductNamefromRedskyTarget (String productId){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        Map<String,String> productName = restTemplate
                .exchange("http://localhost:8080/myretail/redsky/details/"+productId, HttpMethod.GET, entity, Map.class).getBody();
        return productName.get("content");
    }


    public ProductAggregator buildProductAggregator(String productId){
        String productName =  getProductNamefromRedskyTarget(productId);
        Pricing pricing = pricingService.findPricingbyproductId(productId);
        Vendor vendor = vendorService.findProductbyproductId(productId);
        ProductClassification productClassification = productClassificationService.findProductbyproductId(productId);
        ProductAggregator productAggregator = new ProductAggregator.Builder(productId)
                .withProductName(productName)
                .withPricing(pricing)
                .withVendor(vendor)
                .withProductClassification(productClassification).build();
        return productAggregator;
    }

}
