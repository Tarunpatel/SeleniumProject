package com.LearnFramework.Homepage;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.LearnFramework.LandingPage;
import com.testBase.Config;
import com.testBase.StartBrowser;
import com.utility.LoggerHelper;

	public class HomepageTest extends StartBrowser{

		private final Logger log = LoggerHelper.getLogger(HomepageTest.class);
		
		@Test
		public void LandingTest() {
			Config config = new Config(OR);
			driver.get(config.getWebsite());
			LandingPage landingpage = new LandingPage(driver);
			landingpage.mouseOver();
			//landingpage.clickOnIntem();
			//landingpage.clickOnMenu(T-Shirt);
			}
		
		/*@Test(priority=1)
		public void testLogin() 
			{
				LoginPage loginpage = new LoginPage(driver);
				loginpage.loginToApplication("tarunpatel71@gmail.com", "tarun@123");
				boolean status = loginpage.verifysuccessmessage();
				if(status == true) {
					log.info("Login successfull");
				}else {
					log.info("Login is not successfull, please check again");
			}
			}	*/

}
