package com.utility;

	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class WaitMethods {

		WebDriver driver;

		public WaitMethods(WebDriver driver) {
			this.driver = driver;
		}

		public void waitForVisibilityOfElement(WebElement element, int time) {
			new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
			
		}

		public void waitForVisibilityOfElement(By element, int time) {
			new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfElementLocated(element));
		}

		public void waitForVisibilityOfElements(List<WebElement> element, int time) {
			new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfAllElements(element));
		}

		public void waitForVisibilityOfElements(By element, int time) {
			new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
		}

		public void waitForElementToBeClickable(WebElement element, int time) {
			new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(element));
		}

		public void waitForElementToBeClickable(By element, int time) {
			new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(element));
		}

		public void waitForAlertToBePresent(int time) {
			new WebDriverWait(driver, time).until(ExpectedConditions.alertIsPresent());
		}

		public void implicitWaitForSeconds(long seconds) {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		}
		public void waitForVisibilityOfElementText(int time, String text,WebElement element) {
			new WebDriverWait(driver, time).until(ExpectedConditions.textToBePresentInElement(element, text));
		}
		
		public void waitForElement(WebDriver driver, WebElement element, long timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOf(element));
			//Log.info("element found..."+element.getText());
		}
}

