	@campaigns
	Feature: Sending campaigns
	@sanity 
	Scenario: create campaign
	Given user is at campaigns page
	When user click on create campaign
	And user enters information
	Then status of campaign should get draft
	
	@regression
	Scenario: Scheduling campaign
	Given user is at campaigns page
	When user click on edit campaign 
	And enter the date and time 
	Then status of campaign should get scheduled
	
	@functional
	Scenario: Send campaign
	Given user is at campaigns page
	When user click on active button 
	Then status of campaign should 
