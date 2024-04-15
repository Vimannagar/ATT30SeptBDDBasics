Feature: Login with data functionality
Scenario: Login with valid data
Given user should be at loginpage
When user enters the username as "testusername"
And user enters "Test@1234" as password
And user clicks on submit
Then user should get logged into application