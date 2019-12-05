package com.LearnFramework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testBase.StartBrowser;
import com.utility.LoggerHelper;

public class SignoutTest extends LoginPageTest {
	
	public Logger log = LoggerHelper.getLogger(SignoutTest.class);
	
	@Test
	public void test_Signout() {
		Signout sout = new Signout(driver);
		sout.clicksignout();
		boolean status  = sout.verifysuccessfullsignout();
		if(status == true) {
			log.info("Signout Successfull");
		}else {
			log.info("Signout not Successfull");
		}
		}

}
