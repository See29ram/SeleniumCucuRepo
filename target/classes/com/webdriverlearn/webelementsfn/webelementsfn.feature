Feature: WEBELEMENT funtion feature 

Background: 
	Given Launching Chrome Browser and navigating to "https://www.facebook.com" to test 
	
Scenario: Verifying facebook webelements 
	And I provide unique locator for webelement 
	Then I should get desired webelement 
	And I close Browser 
	
Scenario: Verifying multiple elements in FB 
	When I give non unique locator 
	Then I should get list of elements 
	And I close Browser
	
Scenario: Verifying Textbox function
    When I enter value "Best" in text box using sendkeys
    And I get value from textbox using gettext
    Then I clear textbox
    And I close Browser
    
 Scenario: Verifying RadioButton,Button and Link
 And I select value from radio button
 And I click on button
 Then I click on New Page Link
 And I close Browser
 
 Scenario: Working with dropdownlist
 And I select value based on Index
 And I select value based on Visible text
 And I select value based on Option
 And I close Browser
	
  