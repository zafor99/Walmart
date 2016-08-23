package com.bn.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WalmartLoginModel {

	WebDriver driver = null;

	public WalmartLoginModel() {
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
	}

/*	@Test
	public void appTest() {

		driver.get("https://www.walmart.com/account/login?returnUrl=%2Faccount%2F");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterEmailAddress("zafor99@yahoo.com");
	}*/

	@FindBy(xpath = "//input[@data-tl-id='signin-email-input']")
	public WebElement emailAddressTextBox;

	@FindBy(xpath = "//input[@data-tl-id='signin-password-input']")
	public WebElement passwordTextBox;

	@FindBy(xpath = "//button[@data-automation-id='signin-submit-btn']")
	public WebElement signInButton;

/*	public void enterEmailAddress(String email) {
		emailAddressTextBox.sendKeys(email);
	}*/

}
