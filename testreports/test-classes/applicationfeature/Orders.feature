Feature: Order information
Scenario: Fetch currently placed order
Given user should get logged in
And user should be at orders page
When user click on current orders
Then user should see currently placed order

Scenario: Fetch previously placed order
Given user should get logged in
And user should be at orders page
When user click on past orders
Then user should see previously placed order

Scenario: Fetch cancelled order info
Given user should get logged in
And user should be at orders page
When user click on cancel orders
Then user should see cancelled information
