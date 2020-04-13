Feature: Excel reader

Scenario: User Login Scenario
Given user is at the login page
And User Login with different user ids from Excel at "D:\Projects\TestData.xlsx"

Scenario Outline: Analyzing second scenario
And UserId has data of "<user>"
And SiteURL has data of "<url>"
And Region has data of "<region>"
Examples:
|user|url|region|
|u|google|p1|
|u2|yahoo|p2|
|u3|bing|p3|
