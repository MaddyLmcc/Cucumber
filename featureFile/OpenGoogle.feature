Feature: This is to test search google
Scenario: Google search scenario
 Given User is entering google.co.in
 When User is typing in search terms "Madhan"
 And Click the search button
 Then User see the search results

