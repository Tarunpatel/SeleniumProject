package com.LearnFramework.ProductCategoryVerify;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.LearnFramework.LandingPage;
import com.LearnFramework.LoginPage;
import com.LearnFramework.ProductCategoryPage;
import com.LearnFramework.Login.LoginPageTest;
import com.resources.ObjectReader;
import com.testBase.StartBrowser1;
import com.utility.LoggerHelper;

public class VerifyProductAddTOCART extends StartBrowser1 {

	public Logger log = LoggerHelper.getLogger(VerifyProductAddTOCART.class);

	@Test(priority=1)
	public void testLogin() 
	{
		log.info(LoginPageTest.class.getName()+" started");
		getApplicationUrl(ObjectReader.reader.getUrl());
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginToApplication("tarunpatel71@gmail.com", "tarun@123");
		boolean status = loginpage.verifysuccessmessage();
	Assert.assertEquals(status, true);
	}	
	@Test(priority=2)
	public void test_AddProductToCart() throws Exception {
		log.info("Click on women menu");
		ProductCategoryPage pcp = new ProductCategoryPage(driver);
		LandingPage LP = new LandingPage(driver);
		LP.mouseOver();
		LP.clickOnIntem();
		pcp.mouseOverOnProduct(1);
		pcp.clickonAddToCart();
		pcp.clickonProceedToCheckout();
	}
	
}
