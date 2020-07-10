/*
 * Copyright (c) 2020. myRetail Case study
 */

package com.casestudy.myretail.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyretailController {

    @GetMapping(path="/casestudy")
    public String getTestMessage(){
        return "Case study super success";
    }

    @GetMapping( path = "/dummyproductID")
    public Product getProductdetails(){
         return new Product ("122","test","India");
    }
    ///casestudy/myretail/productID/2282
    @GetMapping( path = "/casestudy/myretail/productId/{productId}")
    public Product getProductdetailswithId(@PathVariable String productId){
        return new Product (productId,"test","India");
    }

}
