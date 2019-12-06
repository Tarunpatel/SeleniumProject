package com.LearnFramework.SignOut;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.LearnFramework.Signout;
import com.testBase.Config;
import com.testBase.StartBrowser;
import com.utility.LoggerHelper;

public class SignoutTest extends StartBrowser {
	
	public Logger log = LoggerHelper.getLogger(SignoutTest.class);
	Signout sout = new Signout(driver);
	
	@Test()
	public void test_Signout() {
		/*Config config = new Config(OR);
		driver.get(config.getWebsite());*/
		
		sout.clicksignout();
		boolean status  = sout.verifysuccessfullsignout();
		if(status == true) {
			log.info("Signout Successfull");
		}else {
			log.info("Signout not Successfull");
		}
		}

}
