Feature: Order Food
@SWIGGY
Scenario: A user should be able to add food  on Swiggy
Given a user is on the landing page of Swiggy
When he click on enter location
 And he enters banglore in the search  box
 And click on find food
 And  he click on first restaurant
 And he click on first item on the restaurant page
 And he clicks on checkout button 
 Then he must be able to order food  successfully