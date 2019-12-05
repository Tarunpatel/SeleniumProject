package com.utility;

import java.util.LinkedList;
import java.util.Set;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.LogStatus;
import com.testBase.StartBrowser;

public class BrowserHelper{

	private WebDriver driver;
	private Logger Log = LoggerHelper.getLogger(BrowserHelper.class);

	public BrowserHelper(WebDriver driver) {
		this.driver = driver;
		Log.debug("BrowserHelper : " + this.driver.hashCode());
	}

	public void goBack() {
		driver.navigate().back();
		Log.info("");
		StartBrowser.test.log(LogStatus.INFO, "Driver is Go BACK");
	}

	public void goForward() {
		driver.navigate().forward();
		Log.info("");
		StartBrowser.test.log(LogStatus.INFO, "Driver is going Forward");
	}

	public void refresh() {
		driver.navigate().refresh();
		Log.info("");
		StartBrowser.test.log(LogStatus.INFO, "Driver Refreshed");
	}

	public Set<String> getWindowHandlens() {
		Log.info("");
		StartBrowser.test.log(LogStatus.INFO, "Getting currunt driver window");
		return driver.getWindowHandles();
	}

	public void SwitchToWindow(int index) {

		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());

		if (index < 0 || index > windowsId.size()){
			throw new IllegalArgumentException("Invalid Index : " + index);
		}
		driver.switchTo().window(windowsId.get(index));
		Log.info(index);
		StartBrowser.test.log(LogStatus.INFO, "Window Switched");
	}

	public void switchToParentWindow() {
		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());
		driver.switchTo().window(windowsId.get(0));
		Log.info("");
		StartBrowser.test.log(LogStatus.INFO, "Move To Parent Window");
	}
	
	public void switchToParentWithChildClose() {
		LinkedList<String> windowsId = new LinkedList<String>(getWindowHandlens());

		for (int i = 1; i < windowsId.size(); i++) {
			Log.info(windowsId.get(i));
			driver.switchTo().window(windowsId.get(i));
			driver.close();
			
		}
		switchToParentWindow();
	}
	
	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
		Log.info(nameOrId);
		StartBrowser.test.log(LogStatus.INFO, "Switch To Frame");
	}

}
