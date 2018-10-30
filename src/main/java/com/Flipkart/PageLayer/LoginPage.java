package com.Flipkart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.BaseLayer.TestBase;

public class LoginPage extends TestBase {
	
	
	
	@FindBy(xpath ="//*[@class='_2zrpKA' and @type='text']//following-sibling::span")
		WebElement userName;
	
	@FindBy(xpath="//*[@class='_2zrpKA _3v41xv' and @type='password']//following-sibling::span")
		WebElement password;
	
	@FindBy(xpath="//*[@class='_2AkmmA _1LctnI _7UHT_c' and @type='submit']//following-sibling::span")
		WebElement loginBtn;
	
	@FindBy(xpath="//title[text()='Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Exclusive Offers!']")
		WebElement loginPageTitle;
	

	public LoginPage(){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String strUserName) {
		userName.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void loginPageTitle() {
		loginPageTitle.getText();
	}
	
	 public void loginToGuru99(String strUserName,String strPasword){

	        //Fill user name

	        this.setUsername(strUserName);

	        //Fill password

	        this.setPassword(strPasword);

	        //Click Login button

	        this.clickLoginBtn();

	               
	    }
	
	
	
	
	
	
	
}
