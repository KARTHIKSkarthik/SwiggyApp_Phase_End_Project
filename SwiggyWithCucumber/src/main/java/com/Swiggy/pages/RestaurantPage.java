package com.Swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RestaurantPage {

	WebDriverWait wait;
	
	@FindBy(xpath = "//div[@class='_3FR5S']")
	private WebElement FirstRestaurant;
	
	public RestaurantPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void firstRestaurantlick()
	{
		FirstRestaurant.click();
	}
	
}

