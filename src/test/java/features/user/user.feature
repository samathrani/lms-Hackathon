Feature: Manage user page

#2
 
  Scenario: Verify landing in Manage user page
    Given User is on any page after Login
    When User clicks the Tab "User"
    Then User should see the Manage user page
    
#4
  Scenario: Verify the presence of pagination
	Given User is on any page after Login
	When User is on the Manage user page after clicking User Tab
	Then User should see the pagination controls below data table
#5
	Scenario: Verify the Pagination control with less rows	
	Given: User is on Manage user page	
	When Manage user table has less less than or equal to 5 rows	
	Then Pagination control should be disabled
	
	#6
	Scenario: Verify the Pagination control with more than 5 rows
	Given: 	User is on Manage user page	
	When Manage user table has more than 5 rows	
	Then Pagination control should be enabled
	
	#7
	Scenario: Verify pagination next link	
	Given: User table is displayed in manage user page	
	When User cliks next link of pagination	
	Then Next page should be displayed
	
	#8
	Scenario: Verify pagination next link after 
	Given: last record of user table	last page of User records are displayed	
	When User cliks next link of pagination	
	Then Next link of pagination should be disabled
	
	#14
	Scenario: Verify table footer	
Given: User is logged on to the LMS website	
When User lands on Manage User page	
Then User should see the table footer as "In total there are 4 users"
	