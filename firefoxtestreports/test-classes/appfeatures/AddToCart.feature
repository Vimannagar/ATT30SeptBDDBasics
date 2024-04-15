Feature: Adding product
@sanity
Scenario: Selecting product type
Given I am at home page
When I click on Men
Then I should redirect to section

@regression
Scenario: Adding product to cart
Given I am at home page
When I select the product
Then Product page should display
When I select size and color
And Click on add to cart
Then I should see message contains "shopping cart"
	