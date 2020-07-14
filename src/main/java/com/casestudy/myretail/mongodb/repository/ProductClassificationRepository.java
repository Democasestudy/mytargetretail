/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.mongodb.repository;

import com.casestudy.myretail.productclassification.model.ProductClassification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductClassificationRepository extends MongoRepository<ProductClassification,String> {
    ProductClassification findProductClassificationByProductId(String productId);

}
