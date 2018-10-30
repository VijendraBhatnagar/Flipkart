package com.TestLayer.FlipKart;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Flipkart.BaseLayer.TestBase;
import com.Flipkart.PageLayer.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		
	}
	
	@Test(priority=1)
	public void loginPageTitle() {
		loginPage.loginPageTitle();
		//Assert.assertEquals()
		
	}
	
	@Test(priority=2)
	public void loginPageUserName() {
		loginPage.loginToGuru99(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
}
