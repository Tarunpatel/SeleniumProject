package com.LearnFramework.Login;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.LearnFramework.LoginPage;
import com.testBase.Config;
import com.testBase.StartBrowser;
import com.utility.LoggerHelper;

public class LoginPageTest extends StartBrowser{
	
	public Logger log = LoggerHelper.getLogger(LoginPageTest.class);
	
	@Test()
	public void testLogin() 
		{
			log.info(LoginPageTest.class.getName()+" started");
			Config config = new Config(OR);
			driver.get(config.getWebsite());
			LoginPage loginpage = new LoginPage(driver);
			loginpage.loginToApplication("tarunpatel71@gmail.com", "tarun@123");
			boolean status = loginpage.verifysuccessmessage();
			if(status == true) {
				log.info("Login successfull");	
			}else {
				log.info("Login is not successfull, please check again");
		}
		}	
}
