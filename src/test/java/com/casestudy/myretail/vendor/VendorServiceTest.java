package com.casestudy.myretail.vendor;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.casestudy.myretail.mongodb.repository.PricingRepository;
import com.casestudy.myretail.mongodb.repository.VendorRepository;
import com.casestudy.myretail.pricingdetails.model.Pricing;
import com.casestudy.myretail.pricingdetails.service.PricingService;
import com.casestudy.myretail.vendor.model.Vendor;
import com.casestudy.myretail.vendor.service.VendorService;

@RunWith(MockitoJUnitRunner.class)
public class VendorServiceTest {
	
	 	@InjectMocks
	    private VendorService vendorService = new VendorService();

	    @Mock
	    private VendorRepository vendorRepository;

	    @Test
	    public void findProductbyproductId() {
	    	Vendor vendor = new Vendor();
	    	vendor.setVendorCode("123");      
	        Mockito.when(vendorRepository.findVendorByProductId(Mockito.anyString())).thenReturn(vendor);
	       Vendor vendornew  = vendorService.findProductbyproductId("");
	       Assert.assertEquals("123", vendornew.getVendorCode());

	    }

}
