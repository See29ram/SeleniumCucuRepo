Feature: Alerts features 

Background:
Given Alert Site "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html" have launched

Scenario: Veifying Alert Scenario

And I click deal Alert Box
And I click Confirm box
And I click Promt box and send message as "Hello Alert"
And I Take Screenshot