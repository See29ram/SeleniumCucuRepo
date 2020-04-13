Feature: Build and Perform Actions feature

Background:
Given Launch web "https://demoqa.com/droppable/"

Scenario: context and droppable
 And I perform context click
 And I Perform Drag Element
 Then Element should be dropped