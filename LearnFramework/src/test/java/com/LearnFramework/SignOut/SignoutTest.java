package com.LearnFramework.SignOut;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.LearnFramework.Signout;
import com.testBase.Config;
import com.testBase.StartBrowser;
import com.testBase.StartBrowser1;
import com.utility.LoggerHelper;

public class SignoutTest extends StartBrowser1 {
	
	public Logger log = LoggerHelper.getLogger(SignoutTest.class);
	
	
	@Test()
	public void test_Signout() throws Exception {
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
