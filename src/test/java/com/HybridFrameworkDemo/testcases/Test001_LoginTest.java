package com.HybridFrameworkDemo.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HybridFrameworkDemo.Base.BaseClass;
import com.HybridFrameworkDemo.helper.DataGenerator;
import com.HybridFrameworkDemo.pages.LoginPage;
import com.HybridFrameworkDemo.pages.SignOut;

public class Test001_LoginTest extends BaseClass{

	LoginPage login;
	SignOut logout;
	@BeforeMethod
	public void setup() {
	 login=new LoginPage(driver);	
	 logout=new SignOut(driver);
	}
	
	@Test(dataProvider="LoginData",dataProviderClass=DataGenerator.class)
	public void loginWithAdmin(String u, String p) {
		login.loginApplication(u,p);
		logout.logOutApplication();
		
	}
	
	
}
