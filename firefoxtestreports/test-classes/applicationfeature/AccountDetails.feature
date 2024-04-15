Feature: Open bank account
Scenario: Opening account with nominee information
Given user should be at account opening page
When user enters the following data
| firstname | lastname | email | mobile |
| Erin | smith | erin.smith@gmail.com | 9988776655 |
| Robert | Jackson | robert.jackson@gmail.com | 1234567890 |
And user click on submit button
Then user account gets created