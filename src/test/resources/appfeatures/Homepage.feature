Feature: Homepage functionality
Scenario: Validation of title of page
Given I am at home page
Then page title should have "Home Page"

Scenario: validation of signin link
Given I am at home page
Then I should see signin link on page

Scenario: search product
Given I am at home page
When I search for text "jacket"
Then I should navigate to results page