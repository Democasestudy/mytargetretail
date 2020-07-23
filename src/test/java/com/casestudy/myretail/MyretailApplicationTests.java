package com.casestudy.myretail;


import com.casestudy.myretail.mongodb.repository.PricingRepository;
import com.casestudy.myretail.pricing.PricingServiceTest;
import com.casestudy.myretail.pricingdetails.model.Pricing;
import com.casestudy.myretail.pricingdetails.service.PricingService;
import com.casestudy.myretail.productclassification.ProductClassificationTest;
import com.casestudy.myretail.vendor.VendorServiceTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Suite.class)



@Suite.SuiteClasses({
	PricingServiceTest.class,
	VendorServiceTest.class,
	ProductClassificationTest.class
	
	
	
})
	

public class MyretailApplicationTests { 


}
