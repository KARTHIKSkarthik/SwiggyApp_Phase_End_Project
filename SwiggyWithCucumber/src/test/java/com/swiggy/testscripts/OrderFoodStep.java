package com.swiggy.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFoodStep extends Driver {

	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
		Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
		
		
	}
	@When("he click on enter location")
	public void he_click_on_enter_location()  {
	   landingpage.clickLocation();
	  
	   
	}
	@When("he enters banglore in the search  box")
	public void he_enters_banglore_in_the_search_box() throws InterruptedException {
		 landingpage.chooseLocation();
	}
	@When("click on find food")
	public void click_on_find_food() throws InterruptedException {
		//landingpage.clickFindFood();
		Thread.sleep(4000);
	}
	@When("he click on first restaurant")
	public void he_click_on_first_restaurant() throws InterruptedException {
	   restaurantpage.firstRestaurantlick();
	   Thread.sleep(4000);
	}
	@When("he click on first item on the restaurant page")
	public void he_click_on_first_item_on_the_restaurant_page() throws InterruptedException {
		fooditempage.firstFoodItemClick();
		Thread.sleep(4000);
	}
	@When("he clicks on checkout button")
	public void he_clicks_on_checkout_button() throws InterruptedException {
	    fooditempage.checkoutClick();
	    Thread.sleep(4000);
	}
	@Then("he must be able to order food  successfully")
	public void he_must_be_able_to_order_food_successfully() {
   
   
   String expectedMsg = "SECURE CHECKOUT";
	String actualMsg = checkoutpage.getSuccessMsg();
	Assert.assertEquals(actualMsg, expectedMsg);
	}


}
