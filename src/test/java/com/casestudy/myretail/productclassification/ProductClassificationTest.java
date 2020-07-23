package com.casestudy.myretail.productclassification;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.casestudy.myretail.mongodb.repository.PricingRepository;
import com.casestudy.myretail.mongodb.repository.ProductClassificationRepository;
import com.casestudy.myretail.pricingdetails.model.Pricing;
import com.casestudy.myretail.pricingdetails.service.PricingService;
import com.casestudy.myretail.productclassification.model.ProductClassification;
import com.casestudy.myretail.productclassification.service.ProductClassificationService;

@RunWith(MockitoJUnitRunner.class)
public class ProductClassificationTest {
	 @InjectMocks
	    private ProductClassificationService  productclassificationService = new ProductClassificationService();

	    @Mock
	    private ProductClassificationRepository repo;

	    @Test
	    public void findPricingByProductId() {
	        ProductClassification product = new ProductClassification();
	        product.setProductBrand("Classmate");
	        Mockito.when(repo.findProductClassificationByProductId(Mockito.anyString())).thenReturn(product);
	        ProductClassification producNew = productclassificationService.findProductbyproductId("");
	        Assert.assertEquals("Classmate", producNew.getProductBrand());
	    }

}
