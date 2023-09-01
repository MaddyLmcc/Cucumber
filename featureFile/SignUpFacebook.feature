@Facebook
Feature: Create an account
Background: Facebook Home page
Given Go to facebook home page
Given Click on Create an Account button


@Withoutexamples
Scenario: Signp Scenario
Given Go to the Signup page
When Enter the FirstName "Madhan" and SureName "Kumar"
When Enter the Email id "madhankumar@gmail.com"
When Enter the New Password "Madhan@10"
When Select the Date of birth date "5" and Month "Feb" and Year "1999"
And Select the Gender
Then Click the SignUp button 

@WithExamples
Scenario Outline: Using Examples
Given Go to the Signup page
When Enter the "<FirstName>" and "<SureName>"
When Enter the Email id 
|madhan@gmail.com|
When Enter the New Password 
|Password1 |
|Madhan@10 |
When Select the Date of birth date "5" and Month "Feb" and Year "1999"
And Select the Gender
Then Click the SignUp button

Examples:
|FirstName  | SureName|
|Madhan     | Kumar   | 