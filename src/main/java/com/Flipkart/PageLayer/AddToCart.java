package com.Flipkart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	WebDriver driver;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
		WebElement addToCartBtn;
	
	
	public void AddToCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void addToCartClick() {
		addToCartBtn.click();
	}
	
	
}
