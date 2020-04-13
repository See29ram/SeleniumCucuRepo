Feature: Window handle features
Background:
Given Open web "http://www.seleniumframework.com/Practiceform/"

Scenario: windows scenarios

And I click on new window button
Then I switch to new window with title as "Ruby"
And I close all windows