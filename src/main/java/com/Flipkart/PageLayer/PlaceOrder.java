package com.Flipkart.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {

	
	WebDriver driver;
	
	@FindBy(xpath="//button[@class='_2AkmmA _14O7kc _7UHT_c']/child::span[1]")
		WebElement addToCart;
	
	
	public void PlaceOder(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void placeOrder() {
		addToCart.click();
	}
}
