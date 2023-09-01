@Simple 
Feature: Login Facebook
@Positive
Scenario: Positive scenario
Given Open Login Page
When Enter userName "9159900265"
When Enter Password "638401"
And Click on the Login button
Then Opening Home page 

@Negative
Scenario: Negative Scenario
Given open the login page
When enter the wrong username "9566327336"
When Enter the Wrong password "56251"
And click on the login 
Then home page 
 


