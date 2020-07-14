/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.vendor.service;

import com.casestudy.myretail.mongodb.repository.VendorRepository;
import com.casestudy.myretail.vendor.model.Vendor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendorService {
    @Autowired
    VendorRepository vendorRepository;

    public Vendor findProductbyproductId(String productId){
        Vendor vendor =  vendorRepository.findVendorByProductId(productId);
        return vendor;
    }

    public List<Vendor> findAllVendors(){
        return vendorRepository.findAll();
    }

    public Vendor createmyVendor(Vendor vendor){
        return vendorRepository.save(vendor);
    }
}
