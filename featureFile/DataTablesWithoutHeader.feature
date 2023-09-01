@WithoutHeader
Feature: Login using DataTable without Header
Scenario: Login scenario
Given Open the Login Page
When Enter the userName and password
|Madhan | Madhan123|
And Click the Login button
Then Open Home page of the user
