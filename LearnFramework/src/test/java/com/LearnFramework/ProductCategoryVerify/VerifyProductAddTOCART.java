package com.LearnFramework.ProductCategoryVerify;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.LearnFramework.LandingPage;
import com.LearnFramework.ProductCategoryPage;
import com.testBase.StartBrowser;
import com.utility.LoggerHelper;

public class VerifyProductAddTOCART extends StartBrowser {

	public Logger log = LoggerHelper.getLogger(VerifyProductAddTOCART.class);
	ProductCategoryPage pcp = new ProductCategoryPage(driver);
	LandingPage LP = new LandingPage(driver);
	
	@Test
	public void test_AddProductToCart() {
		log.info("Click on women menu");
		LP.clickOnIntem();
		pcp.mouseOverOnProduct(3);
		pcp.clickonAddToCart();
		pcp.clickonProceedToCheckout();
	}
	
}
