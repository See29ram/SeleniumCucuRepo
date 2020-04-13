Feature: Login checking function

Scenario: Login function with data driven
Given Datadriven_I am at Bugzilla Homepage
Then Datadriven_I click on file a bug and navigate to login page
Then Datadriven_I enter login details and navigate to Product Selection
Then Datadriven_I Test Product and navigate submit bug page
Then Datadriven_I Enter below values
|component|Version|severity|HW|OS|Priority|Summary|Description|
|Comp2|v1|minor|Other|All|Low|Short desc-added|Long desc-added|
And Datadriven_I click on Submit Bug
And Datadriven_I am summary page and i logout