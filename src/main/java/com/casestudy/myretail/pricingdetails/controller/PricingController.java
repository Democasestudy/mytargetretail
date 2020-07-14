/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.pricingdetails.controller;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import com.casestudy.myretail.aggregator.exception.ProductNotFound;
import com.casestudy.myretail.aggregator.model.ProductAggregator;
import com.casestudy.myretail.pricingdetails.model.Pricing;
import com.casestudy.myretail.pricingdetails.service.PricingService;
import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/casestudy/myRetail/v1")
public class PricingController {
    @Autowired
    PricingService pricingService;

    @PostMapping(consumes = "application/json" , path ="/pricing")
    public ResponseEntity<Object> savePricing (@Valid @RequestBody ProductAggregator productaggregator ) {
        Pricing pricing1 = pricingService.createpricingdetails(productaggregator.getPricing());
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{productId}")
                .buildAndExpand(pricing1.getProductId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(produces = "application/json" , path ="/getAllpricing")
    public List<Pricing> getAllPricingDetails (){
        return pricingService.findallpricingdetails();
    }


    @GetMapping(produces = "application/json" , path = "/pricing/{productId}")
    public EntityModel<Pricing> getPricingbyProductId(@PathVariable String productId){
        Pricing pricing = pricingService.findPricingbyproductId(productId);
        if(pricing == null){
            throw new ProductNotFound("Pricing details for  -- "+productId +" not found.");
        }
        EntityModel<Pricing> resource = EntityModel.of(pricing);
        WebMvcLinkBuilder linkTo =
                linkTo(methodOn(this.getClass()).getAllPricingDetails());
        resource.add(linkTo.withRel("all-pricing-information"));
        return resource;
    }


}
