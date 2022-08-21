package com.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Swiggy.pages.CheckoutPage;
import com.Swiggy.pages.FoodItemPage;
import com.Swiggy.pages.LandingPage;
import com.Swiggy.pages.RestaurantPage;



public class Driver extends Tools {
	protected static LandingPage landingpage;

	protected static RestaurantPage restaurantpage;
	protected static FoodItemPage fooditempage;
	protected static CheckoutPage checkoutpage;
	
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "Resources//chromedriver.exe");
		driver = new ChromeDriver();
		landingpage = new LandingPage(driver);
		restaurantpage = new  RestaurantPage(driver);
		fooditempage = new FoodItemPage(driver);
		 checkoutpage = new CheckoutPage(driver);
		 
	}

	
	
	
}
