/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.price;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class PriceResource {

    @Autowired
    private PriceDAOService priceDAOService;

    //GET all prices
    @GetMapping(produces = "application/json" ,path="/myRetail/v1/price")
    public List<Price> getAllProductPrices(){
        return priceDAOService.findAll();
    }

    //Get price by ProductId
    @GetMapping(produces = "application/json" , path = "/myRetail/v1/price/{productId}")
    public EntityModel<Price> getPricebyProductId(@PathVariable String productId){
        Price price = priceDAOService.findPriceforProduct(productId);
        if(price == null){
            throw new ProductNotFound("Product Id -- "+productId +" not found.");
        }
        EntityModel<Price> resource = EntityModel.of(price);
        WebMvcLinkBuilder linkTo =
                linkTo(methodOn(this.getClass()).getAllProductPrices());

        resource.add(linkTo.withRel("all-product-price"));
        return resource;
    }

    @PostMapping(consumes = "application/json" , path ="/myRetail/v1/price")
    public ResponseEntity<Object> savePrice (@Valid @RequestBody  Price price ) {
        Price currentprice = priceDAOService.save(price);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{productId}")
                .buildAndExpand(currentprice.getProductId()).toUri();
        return ResponseEntity.created(location).build();
    }


}
