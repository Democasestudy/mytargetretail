/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.mongodb.repository;

import com.casestudy.myretail.vendor.model.Vendor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends MongoRepository<Vendor,String> {
    Vendor findVendorByProductId(String productId);

}
