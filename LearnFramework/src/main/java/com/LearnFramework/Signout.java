package com.LearnFramework;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testBase.StartBrowser1;
import com.utility.GenericHelper;
import com.utility.LoggerHelper;
import com.utility.WaitMethods;

public class Signout {
	
	WebDriver driver;
	WaitMethods waitHelper;
	public Logger log = LoggerHelper.getLogger(Signout.class);
	
	/*@FindBy(xpath = "//*[contains(text(),'Sign out')]")
	WebElement signout;
	
	@FindBy(xpath=".//*[@id='SubmitCreate']")
	WebElement verify_button;*/
	
	public Signout(WebDriver driver) {
	/*	this.driver = driver;
		//PageFactory.initElements(driver, this);
		waitHelper = new WaitMethods(driver);
		//waitHelper.waitForElement(driver, signout, 3000);
*/	}
	
	public void clicksignout() throws Exception {
				log.info("Click on Signout button");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();;
				//signout.click();
					}
	
	public boolean verifysuccessfullsignout() {
		log.info("Signout is verifying");
		WebElement verify_button = driver.findElement(By.xpath(".//*[@id='SubmitCreate']"));
		 return new GenericHelper().isDisplayed(verify_button);
	}
	
}
