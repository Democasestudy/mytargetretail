package com.casestudy.myretail.pricing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.casestudy.myretail.mongodb.repository.PricingRepository;
import com.casestudy.myretail.pricingdetails.model.Pricing;
import com.casestudy.myretail.pricingdetails.service.PricingService;

@RunWith(MockitoJUnitRunner.class)
public class PricingServiceTest {
	 @InjectMocks
	    private PricingService pricingService = new PricingService();

	    @Mock
	    private PricingRepository pricingRepository;

	    @Test
	    public void findPricingByProductId() {
	        Pricing pricing = new Pricing();
	        pricing.setOfferPricePrice("100");
	        Mockito.when(pricingRepository.findPricingByProductId(Mockito.anyString())).thenReturn(pricing);
	        Pricing pricingNew = pricingService.findPricingbyproductId("");
	        Assert.assertEquals("100", pricingNew.getOfferPricePrice());
	    }

}
