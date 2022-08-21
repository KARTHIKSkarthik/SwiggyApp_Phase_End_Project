package com.Swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	WebDriverWait  wait;
	@FindBy(xpath = "//span[@class='_2EQ3T']")
	private WebElement checkoutMsg;
public CheckoutPage(WebDriver driver) {
PageFactory.initElements(driver, this);
wait = new WebDriverWait(driver,Duration.ofSeconds(60));
}


public String getSuccessMsg()
{
wait.until(ExpectedConditions.visibilityOf(checkoutMsg));
String msg = checkoutMsg.getText();
return msg;
}

}
