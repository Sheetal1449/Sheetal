package com.HybridFrameworkDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignOut {

	public WebDriver driver;
	
	public SignOut(WebDriver driver) {
	this.driver=driver;	
	//PageFactory.initElements(driver, LoginPage.class);
	}
	By WelcomwLink=By.id("welcome");
	By logoutbutton=By.xpath("//a[contains(text(),'Logout')]");
		
	public void logOutApplication() {
		driver.findElement(WelcomwLink).click();
		driver.findElement(logoutbutton).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}
	}

