@UsingHooks
Feature: Signup
Scenario: Signup Hooks scenario
Given Go on the Signup page
When Enter FirstName "Madhan" and SureName "Kumar"
When Enter Email id "madhankumar@gmail.com"
When Enter New Password "Madhan@10"
When Select Date of birth date "5" and Month "Feb" and Year "1999"
And Select Gender
Then Click SignUp button  

