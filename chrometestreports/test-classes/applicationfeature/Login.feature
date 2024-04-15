Feature: Login functionality
Scenario: Login with correct credentials
Given user is at login page
When user enters username
And user enters password
And user click on login button
Then user should redirect to homepage

Scenario: verify title of page
Given user is at login page
Then title of page should visible