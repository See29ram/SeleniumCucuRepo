Feature: Bugzilla bug creation
Scenario: Bug creating in Bugzilla
Given Bugzilla_I am at Bugzilla Homepage
Then Bugzilla_I click on file a bug and navigate to login page
Then Bugzilla_I enter login details and navigate to Product Selection
Then Bugzilla_I Testng Product and navigate submit bug page
Then Bugzilla_I Enter Componente as "Comp2" Version as "V1" Sev as "minor" HW as "Other" Os as "Linux" Priority as "Low" Sum "Summary Done" Desc "Description done"
And Bugzilla_I click on Submit Bug