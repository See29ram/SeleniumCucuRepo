Feature: Bugzilla bug creation
Scenario: Bug creating in Bugzilla
Given Bugzilla_I am at Bugzilla Homepage
Then Bugzilla_I click on file a bug and navigate to login page
And Bugzilla_Page Title should be "Log in to Bugzilla"
Then Bugzilla_I enter login details and navigate to Product Selection
Then Bugzilla_I Testng Product and navigate submit bug page
Then Bugzilla_I Enter Componente as "Comp2" Version as "v1" Sev as "minor" HW as "Other" Os as "Linux" Priority as "Low" Sum "Summary Done" Desc "Description done"

@regression
Scenario: TestProduct Bug Creation
Given Bugzilla_I am at Bugzilla Homepage
Then Bugzilla_I click on file a bug and navigate to login page
Then Bugzilla_I enter login details and navigate to Product Selection
Then TestProduct Test Product and navigate submit bug page
Then TestProduct Enter Componente as "Comp2" Version as "v1" Sev as "minor" HW as "Other" Os as "Linux" Priority as "Low" Sum "Summary Done" Desc "Description done"
And TestProduct click on Submit Bug
And TestProduct am summary page and i logout

Scenario: TestProduct2 Bug Creation
Given Bugzilla_I am at Bugzilla Homepage
Then Bugzilla_I click on file a bug and navigate to login page
Then Bugzilla_I enter login details and navigate to Product Selection
Then Bugzilla_I click on Home button
Then Bugzilla_I click on New Button
Then TestProduct Test Product and navigate submit bug page
Then TestProduct Enter Componente as "Comp2" Version as "v1" Sev as "minor" HW as "Other" Os as "Linux" Priority as "Low" Sum "Summary Done" Desc "Description done"
And TestProduct click on Submit Bug
And TestProduct am summary page and i logout