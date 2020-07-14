/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.productclassification.controller;


import com.casestudy.myretail.productclassification.service.ProductClassificationService;
import com.casestudy.myretail.productclassification.model.ProductClassification;
import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/casestudy/myRetail/v1")
public class ProductClassificationController {
    @Autowired
    ProductClassificationService productClassificationService;

    @PostMapping(consumes = "application/json" , path ="/productclassification")
    public ResponseEntity<Object> saveVendor (@Valid @RequestBody ProductClassification productClassification ) {
        ProductClassification productClassification1 = productClassificationService.createproductclassification(productClassification);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{productId}")
                .buildAndExpand(productClassification.getProductId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping(produces = "application/json" , path ="/getAllProductclassifications")
    public List<ProductClassification> getAllProductclassifications (){
        return productClassificationService.findallproductclassifications();
    }



//    @GetMapping(produces = "application/json" , path = "/classification/{productId}")
//    public EntityModel<ProductClassification> getClassificationbyProductId(@PathVariable String productId){
//        ProductClassification productClassification =  productClassificationService.findProductbyproductId(productId);
//        if(productClassification == null){
//            throw new ProductNotFound("Vendor details for  -- "+productId +" not found.");
//        }
//        EntityModel<ProductClassification> resource = EntityModel.of(productClassification);
//        WebMvcLinkBuilder linkTo =
//                linkTo(methodOn(this.getClass()).getAllProductclassifications());
//        resource.add(linkTo.withRel("all-classification-information"));
//        return resource;
//    }


}
