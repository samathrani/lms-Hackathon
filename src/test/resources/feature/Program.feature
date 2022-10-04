@tag
Feature: ManagePgm

  @tag1
  Scenario: Validate the heading
    Given User is in loginpage
    When The user gets the valid data from excel with "<testId>" and "<sheetName>"
    Then User should see a heading with text "Manage Program" on the page

  @tag2
  Scenario: Validate the text below the table
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see text as "Showing 1 to 5 of z entries" below the table

  @tag3
  Scenario: Validate the footer
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see the footer as "In total there are z Programs."

  @tag4
  Scenario: Validate the default state of Delete button
    When User is on Program page
    Then User should see the Delete button on the top left hand side as Disabled

  @tag5
  Scenario: Validate that number of records (rows of data in the table) displayed
    When User is on Program page
    Then Verify that number of records "<rows displayed on the page are 5>"

  @tag6
  Scenario: Validate Search Feature
    When User is on Program page
    Then Text box used for search has text as "Search..."
 

  @tag7
  Scenario: Search Program By Name
    Given User is on Program page
    When User enters name "<name phrase>" into search box.
    Then Entries for name string are shown.

  @tag8
  Scenario: Search Program By Description
    Given User is on Program page
    When User enters description "<description phrase>" into search box.
    Then Entries for description string are shown.

  @tag9
  Scenario: Search Program By Status
    Given User is on Program page
    When User enters Status "<status phrase>" into search box.
    Then Entries for Status string are shown.

 #Edit Program details
  @tag10
  Scenario: Select Program
    Given User is on Program page
    When User selects Program using checkbox
    Then Program gets selected

  @tag11
  Scenario: Edit Feature
    Given User clicks on <Edit> button
    When Edit check box is selected
    Then User lands on Program Details form.

  @tag12
  Scenario: Edit Program Name
    Given User is on Program Details form
    When User edits Name and selects the Save button
    Then User can see updated Name

  @tag13
  Scenario: Edit Program Description
    Given User is on Program Details form
    When User edits Description and selects the Save button
    Then User can see updated Description

  @tag14
  Scenario: Change Program Status
    Given User is on Program Details form
    When User changes status and selects the Save button
    Then User can see updated Status

  @tag15
  Scenario: Click Cancel
    Given User is on Program Details form
    When User clicks <Cancel> button
    Then User can see Program Details form disappears

  @tag16
  Scenario: Click Save
    Given User is on Program Details form
    When User clicks <Save> button
    Then User can see 'Successful Program Updated' message

 # Delete Program
  @tag17
  Scenario: Select Program
    Given User is on Program page
    When Check box is selected to delete
    Then Program gets selected

  @tag18
  Scenario: Delete Feature
    Given User is on Program page
    When User clicks on <Delete> button
    Then User lands on Confirm Deletion form.
    
   @tag19
  Scenario: Click No
    Given User is on Confirm Deletion form
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears

  @tag20
  Scenario: Click Yes
    Given User is on Confirm Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Program Deleted' message

 # Add new program
  @tag21
  Scenario: Validate Add New Program
    Given User is on Program Details form to add new program after valid login with "<testId>" and "<sheetName>"
    When User clicks "<A New Program>" button
    Then User lands on Program Details form to add new program.

  @tag22
  Scenario: Empty form submission to add new program
    Given User is on Program Details form for adding new program
    When User clicks "<Save>" button without entering data
    Then User gets message "Name is required."

  @tag23
  Scenario: Enter Program Name Description and Status and click "<Save>" to add new program
    Given User is on Program Details form for adding new program 
    When User enters "<Name>" "<Description>" and "<Status>" and clicks "<Save>" button
    Then User can see "Successful Program created" message on screen
    
  @tag24
  Scenario: Select multiple Program
    Given User is on Program page
    When User selects more than one Program using checkbox
    Then Programs get selected

  @tag25
  Scenario: Delete Feature
    Given User is on Program page
    When User clicks on <Delete> button on top left corner
    Then User lands on Confirm Deletion form.

  @tag26
   Scenario: Click No for Program del
    Given User is on Confirm Del form for No
    When User clicks delete all <No> button
    Then User can see no programs gets deleted

  @tag27
   Scenario: Click Yes for Program del
    Given User is on Confirm Del form for Yes
    When User clicks delete all <Yes> button
    Then User can see  All Programs Deleted message
    
 #Pagination
  @tag28
  Scenario: Verify previous link on the first page
    Given User is logged on to LMS website
    When User is on first page of Manage Program
    Then Verify that previous link is disabled

  @tag29
  Scenario: Verify next link
    Given User is on the page number '1'
    When User clicks navigateRight > button
    Then User navigated to page number '2'

  @tag30
  Scenario: Verify previous link
    Given User is on the page number '2'
    When User clicks navigateLeft < button
    Then User navigated to page number '1'

  @tag31
  Scenario: Verify next link on the last page
    Given User is logged on to LMS website
    When User is on last page of Manage Program
    Then Verify that next link is disabled

  #Results in ascending  descending order
  
  @tag32
  Scenario: Verify that the results are displayed in Ascending order of Program name
    Given User is on the Program page
    When User clicks on the Ascending arrow (down) near to the Program name
    Then User can see the results in Ascending order of Program name

  @tag33
  Scenario: Verify that the results are displayed in Ascending order of Program description
    Given User is on the Program page
    When User clicks on the Ascending arrow (down) near to the Program Description
    Then User can see the results in Ascending order of Program description

  @tag34
  Scenario: Verify that the results are displayed in Ascending order of Program status
    Given User is on the Program page
    When User clicks on the Ascending arrow (down)near to the Program status
    Then User can see the results in Ascending order of Program status

  @tag35
  Scenario: Verify that the results are displayed in descending order of Program name
    Given User is on the Program page
    When User clicks on the descending arrow (down) near to the Program name
    Then User can see the results in descending order of Program name

  @tag36
  Scenario: Verify that the results are displayed in descending order of Program description
    Given User is on the Program page
    When User clicks on the descending arrow (down) near to the Program Description
    Then User can see the results in descending order of Program description

  @tag37
  Scenario: Verify that the results are displayed in descending order of Program status
    Given User is on the Program page
    When User clicks on the descending arrow (down)near to the Program status
    Then User can see the results in descending order of Program status
 
