package com.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.commandhandler.Status;

import com.relevantcodes.extentreports.LogStatus;
import com.testBase.StartBrowser;

public class AlertHelper {

public WebDriver driver;
//private Logger oLog = LoggerHelper.getLogger(AlertHelper.class);
private Logger oLog = Logger.getLogger(AlertHelper.class);
	
	public AlertHelper(WebDriver driver) {
		this.driver = driver;
		oLog.debug("AlertHelper : " + this.driver.hashCode());
		StartBrowser.test.log(LogStatus.INFO, "Alert is here");
	}
	
	public Alert getAlert() {
		oLog.debug("");
		StartBrowser.test.log(LogStatus.INFO, "Alert is present");
		return driver.switchTo().alert();
	}
	
	public void AcceptAlert() {
		oLog.info("");
		StartBrowser.test.log(LogStatus.INFO, "Accepting Alert");
		getAlert().accept();
	}
	
	public void DismissAlert() {
		oLog.info("");
		StartBrowser.test.log(LogStatus.INFO, "Dimiss Alert");
		getAlert().dismiss();
	}

	public String getAlertText() {
		String text = getAlert().getText();
		oLog.info(text);
		StartBrowser.test.log(LogStatus.INFO, "Alert Text is");
		return text;
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			oLog.info("true");
			StartBrowser.test.log(LogStatus.INFO, "Alert is present");
			return true;
		} catch (NoAlertPresentException e) {
			// Ignore
			oLog.info("false");
			StartBrowser.test.log(LogStatus.INFO, "Alert is not present");
			return false;
		}
	}

	public void AcceptAlertIfPresent() {
		if (!isAlertPresent())
			return;
		AcceptAlert();
		oLog.info("");
	}

	public void DismissAlertIfPresent() {

		if (!isAlertPresent())
			return;
		DismissAlert();
		oLog.info("");
	}
	
	public void AcceptPrompt(String text) {
		
		if (!isAlertPresent())
			return;
		
		Alert alert = getAlert();
		alert.sendKeys(text);
		alert.accept();
		oLog.info(text);
	}

}
