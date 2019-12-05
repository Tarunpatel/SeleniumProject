package com.LearnFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.WaitMethods;

public class MyAccountPage {
	WaitMethods waitHelper;
	
	@FindBy(xpath="//*[contains(text(),'Order history and details')]")
	WebElement btn_orderhistory;
	
	@FindBy(xpath="//*[contains(text(),'My wishlists')]")
	WebElement btn_mywhistlist;
	
	public MyAccountPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitMethods(driver);
		//waitHelper.waitForElement(driver, signin, 3000);
	}
	
	
}
