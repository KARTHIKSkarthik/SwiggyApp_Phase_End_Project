package com.Swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	Actions actions;
	@FindBy(id = "location")
	private WebElement location;
	
	//@FindBy(xpath = "//a[@class='_3iFC5']")
	//private WebElement FindFoodBtn;
	
	@FindBy(xpath="(//span[@class='_2W-T9'])[1]")
	private WebElement Bangalore;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}
	
	public void clickLocation() {		
		location.sendKeys("Bangalore");
		
	}
	
	public void chooseLocation() throws InterruptedException
	{   Thread.sleep(2000);
		Bangalore.click();
	}
	//public void clickFindFood() throws InterruptedException {
	//	Thread.sleep(4000);
		//FindFoodBtn.click();
	//}
}

