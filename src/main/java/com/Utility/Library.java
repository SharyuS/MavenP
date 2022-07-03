package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Library {
	
	public static void custom_Sendkeys(WebElement element, String value) {
		
		try{
			element.sendKeys(value);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		}
	public static void getCaptureScreenShot() {
		
	}
	
	public static void getExplicitWait(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

}
