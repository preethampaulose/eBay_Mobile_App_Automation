Feature: Login to eBay mobile application and search for an item and add to cart and purchase it

	Background: Login page
		Given I navigate to login page
		
	Scenario: Succcessful Login
		Given Credentials are correct
		Then log out