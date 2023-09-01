@Datadriven
Feature: Login using DataTable Examples
Scenario Outline: Login scenario
Given user Open  Login Page
When user Enter the details "<Username>" and "<Password>"
And user Click Login button
Then Open Home page

Examples:
|Username    | Password |
|9159900265  | 638401   |
|9159366989  | 234566   |