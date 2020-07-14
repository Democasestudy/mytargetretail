/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.vendor.controller;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import com.casestudy.myretail.aggregator.exception.ProductNotFound;
import com.casestudy.myretail.vendor.service.VendorService;
import com.casestudy.myretail.vendor.model.Vendor;
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
public class VendorController  {
    @Autowired
    VendorService vendorService;

    @PostMapping(consumes = "application/json" , path ="/vendor")
    public ResponseEntity<Object> saveVendor (@Valid @RequestBody Vendor vendor ) {
        Vendor vendor1 = vendorService.createmyVendor(vendor);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{productId}")
                .buildAndExpand(vendor1.getProductId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(produces = "application/json" , path ="/getAllVendors")
    public List<Vendor> getAllVendors (){
        return vendorService.findAllVendors();
    }


    @GetMapping(produces = "application/json" , path = "/vendor/{productId}")
    public EntityModel<Vendor> getPoductbyProductId(@PathVariable String productId){
        Vendor vendor = vendorService.findProductbyproductId(productId);
        if(vendor == null){
            throw new ProductNotFound("Vendor details for  -- "+productId +" not found.");
        }
        EntityModel<Vendor> resource = EntityModel.of(vendor);
        WebMvcLinkBuilder linkTo =
                linkTo(methodOn(this.getClass()).getAllVendors());
        resource.add(linkTo.withRel("all-vendor-information"));
        return resource;
    }


}
