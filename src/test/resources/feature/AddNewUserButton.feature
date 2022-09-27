Feature: Add New User Button
Scenario: Verify the presence of Add new user button	
Given User is on any page after Login	
When User is on the Manage user page after clicking User Tab	
Then User should see the button  Add New User

Scenario: Verify the functionality of Add new yser button	
Given: User is on Manage user page	
When User clicks Add New User button	
Then User should see the "User details" dialog box

