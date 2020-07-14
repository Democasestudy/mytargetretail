/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.redsky.service;

import com.casestudy.myretail.redsky.model.Product;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

@RequestMapping("/myretail/redsky/")
public class RedskyController {

    @Autowired
    RestTemplate restTemplate;

@GetMapping(produces="application/json", path="details/{productId}")
public EntityModel<String> getProductNamefromRedsky (@PathVariable String productId) {
    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    HttpEntity<Product> entity = new HttpEntity<Product>(headers);
    Product product = restTemplate
            .exchange("https://redsky.target.com/v2/pdp/tcin/"+productId, HttpMethod.GET, entity, Product.class).getBody();
    String productName = product.getProduct().getItem().getProductDescription().getTitle();
    EntityModel<String> resource = EntityModel.of(productName);
    return resource;
    }
}

