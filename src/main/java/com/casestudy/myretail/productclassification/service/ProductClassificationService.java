/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.productclassification.service;

import com.casestudy.myretail.mongodb.repository.ProductClassificationRepository;
import com.casestudy.myretail.productclassification.model.ProductClassification;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductClassificationService {
    @Autowired
    ProductClassificationRepository productClassificationRepository;

    //@Async
    public ProductClassification findProductbyproductId(String productId){
        ProductClassification productClassification =  productClassificationRepository.findProductClassificationByProductId(productId);
        return productClassification;
    }

    public List<ProductClassification> findallproductclassifications(){
        return productClassificationRepository.findAll();
    }


    public ProductClassification createproductclassification(ProductClassification productClassification){
        return productClassificationRepository.save(productClassification);
    }
}
