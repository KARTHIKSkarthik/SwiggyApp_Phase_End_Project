package com.Swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoodItemPage {
	
WebDriverWait wait;
	
	@FindBy(xpath = "(//div[@class='_1RPOp'])[1]")
	private WebElement FirstFood;
	@FindBy(xpath = "//button[@class='_1gPB7']")
	private WebElement CheckOut;
	
	public FoodItemPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void firstFoodItemClick()
	{
		FirstFood.click();
	}
	public void checkoutClick()
	{
		CheckOut.click();
	}
	

}
