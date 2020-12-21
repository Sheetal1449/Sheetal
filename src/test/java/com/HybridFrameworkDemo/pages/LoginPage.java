package com.HybridFrameworkDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	this.driver=driver;	
	//PageFactory.initElements(driver, LoginPage.class);
	}
	By username=By.name("txtUsername");
	By password=By.name("txtPassword");
	By loginbutton=By.name("Submit");
		
	public void loginApplication(String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
	}

