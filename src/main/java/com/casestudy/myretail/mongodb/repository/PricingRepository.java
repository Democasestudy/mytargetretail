/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.mongodb.repository;

import com.casestudy.myretail.pricingdetails.model.Pricing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricingRepository extends MongoRepository<Pricing,String> {
    Pricing findPricingByProductId(String productId);

}
