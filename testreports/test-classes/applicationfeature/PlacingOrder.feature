Feature: Place order
Scenario:  order confirmation
Given I should be at product page
When  I click on the add to cart button
Then Product should get added
When I click on place order button
Then Order should get confirmed