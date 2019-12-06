package com.LearnFramework;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.LoggerHelper;
import com.utility.WaitMethods;

public class ProductCategoryPage {
	
	static WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(ProductCategoryPage.class);
	WaitMethods waitHelper;
	
	@FindBy(xpath="//*[@id='layered_block_left']/p")
	WebElement catalogTextObj;
	
	@FindBy(xpath=".//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addtoCart;
	
	@FindBy(xpath=".//*[@id='layer_cart']/div[1]/div[1]/h2")
	WebElement productaddedsuccessfully;
	
	@FindBy(xpath=".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	WebElement processTocheckout;
	
	@FindBy(xpath=".//*[@id='center_column']/ul/li")
	List<WebElement>totalproducts;
	
	@FindBy(xpath=".//*[@id='selectProductSort']")
	WebElement sortBy;
	
	@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[1]/div/div[2]/span[1]")
	WebElement allpriceElements; 
	
	public ProductCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitMethods(driver);
		waitHelper.waitForElement(driver, catalogTextObj,3000);
	}
	
	public void mouseOverOnProduct(int number) {
		String fxpath = ".//*[@id='center_column']/ul/li[";
		String sxpath = "]/div/div[2]/div[2]/a[1]/span";
		log.info("Mouse Hover"+number+"..On Product");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(fxpath+number+sxpath))).build().perform();
	}
	
	public void clickonAddToCart() {
		log.info("Click on AddToCart button");
		addtoCart.click();
	}
	
	public void clickonProceedToCheckout() {
		log.info("Click on Proceed To CheckOut" + processTocheckout.getText());
		processTocheckout.click();
	}
	
	public void colorSelection() {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollby(0,1000)");
		
		
	}
	
	
	
	

}
