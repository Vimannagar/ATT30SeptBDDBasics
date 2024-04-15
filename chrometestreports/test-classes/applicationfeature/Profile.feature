Feature: Profile functionality
Background:
Given user should be logged in
And User should be at home page

Scenario: Add profile
When user click on add profile button
And user enters the details
Then user should have profile id

Scenario: Edit profile
When user click on edit profile button
And user updates the details
Then user should be able to update

Scenario: delete profile
When user click on delete profile button
Then user should get deleted


