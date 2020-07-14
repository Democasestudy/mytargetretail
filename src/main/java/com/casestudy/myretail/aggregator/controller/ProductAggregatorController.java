/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.aggregator.controller;

import com.casestudy.myretail.aggregator.service.ProductAggregatorService;
import com.casestudy.myretail.aggregator.model.ProductAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casestudy/myRetail/v1")
public class ProductAggregatorController {
    @Autowired
    ProductAggregatorService productAggregatorService;

    @GetMapping(produces = "application/json" , path ="/productDetails/{productId}")
    public ResponseEntity<ProductAggregator> getAggregatedProductDetails(@PathVariable String productId){
        ProductAggregator productAggregator = productAggregatorService.buildProductAggregator(productId);
        return new ResponseEntity<ProductAggregator>(productAggregator, HttpStatus.OK);
    }

}
