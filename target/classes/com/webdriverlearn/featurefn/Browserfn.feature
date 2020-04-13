Feature: Browser function feature 


Background: 
	Given Browser Function I have chrome browser 
	
Scenario: Validate Browser function scenarion 
	Then Browser should be closed 
	
	
Scenario: Browser function to validate given URL 
	
	And I am navigating to "https://www.bing.com/" and then corresponding should be displayed 
	Then Browser should be closed
	
Scenario: Browser funtion navigate,To,Back,Forward,refresh
    And I am navigating to "https://www.google.com/" and then corresponding should be displayed
    And I am navigating to "https://www.bing.com/" and then corresponding should be displayed
    Then I call Back method then it should call old url
    Then I call navigate method then it should call New Url
    Then I call refresh and page should be refreshed
    Then Browser should be closed
Scenario: Browse function maximize
     And I am navigating to "https://www.facebook.com/" and then corresponding should be displayed
     And I maximize Browser
     Then Browser should be closed  
    