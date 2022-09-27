Feature: Search

Scenario: Verify the presence of Input field for searching	
Given: User is on any page after Login	
When User is on the Manage user page after clicking User Tab	
Then User should see the Search input field after the delete icon


Scenario: Verify the presence of search icon and text in the search input filed	
Given: User is on any page after Login	
When User is on the Manage user page after clicking User Tab
Then User should see the search input field with search icon and text as" Search…"

Scenario: Verify the functionality of search	
Given: User is on Manage user page for search
When User types Name to search	
Then Rows with the name should be displayed

Scenario: Verify the functionality of search	
Given: User is on Manage user page for search
When User types random text in search field which has no matching entry	
Then No rows is displayed