/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.pricingdetails.service;

import com.casestudy.myretail.mongodb.repository.PricingRepository;
import com.casestudy.myretail.pricingdetails.model.Pricing;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PricingService {
    @Autowired
    PricingRepository pricingRepository;

    public Pricing findPricingbyproductId(String productId){
        Pricing pricing =  pricingRepository.findPricingByProductId(productId);
        return pricing;
    }
    public List<Pricing> findallpricingdetails(){
        return pricingRepository.findAll();
    }
    public Pricing createpricingdetails(Pricing pricing){
        return pricingRepository.save(pricing);
    }
}
