Feature: Wait Features from Webdriver 

Background: Open Browser for Scenario
	Given Website to be open for checking wait conditions 
	
Scenario: wait for an element 

	And wait for an element "20" using implicit wait in WebPage 
	
	Then Click on "Element2" in Webpage 
	
	And Close Browser 
	
Scenario: wait for an Element using explicitwait 
	And I wait for "Element3" in webpage using Explicit wait with polling 250 milliseconds and 30 seconds 
	Then Click on "Element3" in Webpage
	And Close Browser