package com.LearnFramework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.GenericHelper;
import com.utility.LoggerHelper;
import com.utility.WaitMethods;

public class Signout {
	
	WebDriver driver;
	WaitMethods waitHelper;
	public Logger log = LoggerHelper.getLogger(Signout.class);
	
	@FindBy(xpath=".//*[contains(text(),'Sign out')]")
	WebElement signout;
	
	@FindBy(xpath=".//*[@id='SubmitCreate']")
	WebElement verify_button;
	
	public Signout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitMethods(driver);
		//waitHelper.waitForElement(driver, signout, 3000);
	}
	
	public void clicksignout() {
				log.info("Click on Signout button");
				signout.click();
	}
	
	public boolean verifysuccessfullsignout() {
		log.info("Signout is verifying");
		 return new GenericHelper().isDisplayed(verify_button);
	}
	
}
