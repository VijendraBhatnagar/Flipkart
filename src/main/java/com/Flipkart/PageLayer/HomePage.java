package com.Flipkart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath="//*[@class='LM6RPg' and @type='text']//parent::div[1]")
		WebElement search;
	
	@FindBy(xpath="//*[@class='vh79eN' and @type='submit']")
		WebElement searchBtn;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void search(String product) {
		search.sendKeys(product);
	}
	
	public void searchBtn() {
	searchBtn.click();
	}
	
}
