package com.LearnFramework;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.StartBrowser;
import com.utility.LoggerHelper;
import com.utility.WaitMethods;

public class LandingPage { 
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LandingPage.class);
	WaitMethods waitHelper;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	@CacheLookup
	public WebElement womenMenu;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	public WebElement dressesMenu;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	public WebElement tshirtsMenu;
	
		public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*waitHelper = new WaitMethods(driver);
		waitHelper.waitForElement(driver, womenMenu, 3000);*/
	}
	
	public void mouseOver(){
		log.info("doing mouse over on :"+ "Women's Tab");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"))).build().perform();
	}
		
	public ProductCategoryPage clickOnIntem(){
		log.info("clickin on :"+ "T-Shirt");
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a")).click();
		return new ProductCategoryPage(driver);
	}
	
	}
