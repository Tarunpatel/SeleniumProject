package com.LearnFramework.Login;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.LearnFramework.LandingPage;
import com.LearnFramework.LoginPage;
import com.LearnFramework.ProductCategoryPage;
import com.resources.ObjectReader;
import com.testBase.Config;
import com.testBase.StartBrowser;
import com.testBase.StartBrowser1;
import com.utility.LoggerHelper;

public class LoginPageTest extends StartBrowser1{
	
	public Logger log = LoggerHelper.getLogger(LoginPageTest.class);
	ProductCategoryPage pcp = new ProductCategoryPage(driver);
	LandingPage LP = new LandingPage(driver);
	
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
}
