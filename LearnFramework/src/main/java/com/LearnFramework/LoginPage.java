package com.LearnFramework;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.StartBrowser;
import com.utility.GenericHelper;
import com.utility.LoggerHelper;
import com.utility.WaitMethods;

public class LoginPage {
	
	WebDriver driver;
	WaitMethods waitHelper;
	public Logger log = LoggerHelper.getLogger(LoginPage.class);

	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	@CacheLookup
	WebElement signin;
	
	@FindBy(xpath=".//*[@id='email']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath=".//*[@id='passwd']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath=".//*[@id='center_column']/p")
	@CacheLookup
	WebElement successfullmsg;
	
	@FindBy(xpath=".//*[@id='login_form']/h3")
	WebElement textToverifypage;
	
		public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitMethods(driver);
		//waitHelper.waitForElement(driver, textToverifypage, 30);
			}
		
	public void clickonSignIn() {
		log.info("Click on SignIn button");
		signin.click();
	}
	
		public void enterUsername(String emailaddress) {
		log.info("Enter Username"+ emailaddress);
		this.username.sendKeys(emailaddress);
		}
		
	public void enterPassword(String password) {
		log.info("Enter Username"+ password);
		this.password.sendKeys(password);
		}
	
	public LandingPage clickonLogin() {
		log.info("click on Login button");
		btnlogin.click();
		return new LandingPage(driver);
	}
	
	public boolean verifysuccessmessage() {
		log.info("Successmessage is verfiying");
		 return new GenericHelper().isDisplayed(successfullmsg);
	}
	
	public void loginToApplication(String username, String password) {
		clickonSignIn();
		enterUsername(username);
		enterPassword(password);
		clickonLogin();
	}
	
}
