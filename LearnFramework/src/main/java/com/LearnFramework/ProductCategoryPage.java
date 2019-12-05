package com.LearnFramework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.LoggerHelper;
import com.utility.WaitMethods;

public class ProductCategoryPage {
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(ProductCategoryPage.class);
	WaitMethods waitHelper;
	
	@FindBy(xpath="//*[@id='layered_block_left']/p")
	WebElement catalogTextObj;
	
	public ProductCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitMethods(driver);
		waitHelper.waitForElement(driver, catalogTextObj,3000);
	}

}
