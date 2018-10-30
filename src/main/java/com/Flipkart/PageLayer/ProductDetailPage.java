package com.Flipkart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	WebDriver driver;
	
	@FindBy(xpath="//div[text()='Redmi Note 5 Pro (Gold, 64 GB)' ]")
		WebElement productDetails;
	
	
	public void ProductDetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public ProductDetailPage() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void productSelect() {
		productDetails.click();
	}
	
	
}
