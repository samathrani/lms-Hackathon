Feature: Pagination

	Scenario: Verify the presence of pagination
	
	Given User is on any page after Login
	When User is on the Manage user page after clicking User Tab
	Then User should see the pagination controls below data table
	

