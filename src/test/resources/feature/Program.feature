#Author: Tech Rockers LMSHackathon
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: ManageProgram

  @tag1
  Scenario: Validate the heading
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see a heading with text "Manage Program" on the page

  @tag2
  Scenario: Validate the text below the table
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see the text as "Showing x to y of z entries" below the table. x-starting record number on that page y-ending record number on that page z-Total number of records

  @tag3
  Scenario: Validate the footer
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see the footer as "In total there are z programs". z- Total number of records

  @tag4
  Scenario: Validate the default state of Delete button
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see the Delete button on the top left hand side as Disabled

  @tag5
  Scenario: Validate that number of records (rows of data in the table) displayed
    Given User is logged on to LMS website
    When User is on Program page
    Then Verify that number of records (rows of data in the table) displayed on the page are 5

  @tag6
  Scenario: Validate Search Feature
    Given User is logged on to LMS website
    When User is on Program page
    Then Text box used for search has text as 'Search'

  @tag7
  Scenario: Search Program By Name
    Given User is on Program page
    When User enters  <name phrase> into search box.
    Then Entries for <name phrase> are shown.

  #Example:
  # Name| Description          | Status
  # QA  |Manual and Automation | Active
  @tag8
  Scenario: Search Program By Description
    Given User is on Program page
    When User enters <description phrase> into search box.
    Then Entries for <description phrase> are shown.

  @tag9
  Scenario: Search Program By Status
    Given User is on Program page
    When User enters <status phrase> into search box.
    Then Entries for <status phrase> are shown.

  #Edit Program details
  @tag10
  Scenario: Select Program
    Given User is on Program page
    When User selects Program using checkbox
    Then Program gets selected

  @tag11
  Scenario: Edit Feature
    Given User clicks on <Edit> button
    When User selects Program using checkbox
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

  #Delete Program
  @tag17
  Scenario: Select Program
    Given User is on Program page
    When User selects Program using checkbox
    Then Program gets selected

  @tag18
  Scenario: Delete Feature
    Given User is on Program page
    When User clicks on <Delete> button
    Then User lands on Confirm Deletion form.

  @tag19
  Scenario: Click Yes
    Given User is on Confirm Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Program Deleted' message

  @tag20
  Scenario: Click No
    Given User is on Confirm Deletion form
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears

  #Add new program
  @tag21
  Scenario: Validate Add New Program
    Given User is on Program Details form
    When User clicks <A New Program> button
    Then User lands on Program Details form.

  @tag22
  Scenario: Empty form submission
    Given User is on Program Details form
    When User clicks <Save> button without entering data
    Then User gets message 'Name is required'

  @tag23
  Scenario: Enter Program Name
    Given User is on Program Details form
    When User enters <Name> in text box
    Then User can see 'Name' entered

  @tag24
  Scenario: Enter Program Description
    Given User is on Program Details form
    When User enters <Description> in text box
    Then User can see 'Description' entered

  @tag25
  Scenario: Select Status
    Given User is on Program Details form
    When User selects <Status> using radiobutton
    Then User can see 'Active/Inactive' status selected

  @tag26
  Scenario: Click Save
    Given User is on Program Details form
    When User clicks <Save> button
    Then User can see 'Successful Program created' message

  @tag27
  Scenario: Click Cancel
    Given User is on Program Details form
    When User clicks <Cancel> button
    Then User can see Program Details form disappears

  @tag28
  Scenario: Select multiple Program
    Given User is on Program page
    When User selects more than one Program using checkbox
    Then Programs get selected

  @tag29
  Scenario: Delete Feature
    Given User is on Program page
    When User clicks on <Delete> button on top left corner
    Then User lands on Confirm Deletion form.

  @tag30
  Scenario: Click Yes
    Given User is on Confirm Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Programs Deleted' message

  @tag31
  Scenario: Click No
    Given User is on Confirm Deletion form
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears

  #Pagination
  @tag32
  Scenario: Verify previous link on the first page
    Given User is logged on to LMS website
    When User is on first page of Manage Program
    Then Verify that previous link is disabled

  @tag33
  Scenario: Verify next link
    Given User is on the page number '1'
    When User clicks navigate > button
    Then User navigated to page number '2'

  @tag34
  Scenario: Verify previous link
    Given User is on the page number '2'
    When User clicks navigate < button
    Then User navigated to page number '1'

  @tag35
  Scenario: Verify next link on the last page
    Given User is logged on to LMS website
    When User is on last page of Manage Program
    Then Verify that next link is disabled

  #Results in ascending order
  @tag36
  Scenario: Verify that the results are displayed in Ascending order of Program name
    Given User is on the Program page
    When User clicks on the Ascending arrow (down) near to the Program name
    Then User can see the results in Ascending order of Program name

  @tag37
  Scenario: Verify that the results are displayed in Ascending order of Program description
    Given User is on the Program page
    When User clicks on the Ascending arrow (down) near to the Program Description
    Then User can see the results in Ascending order of Program description

  @tag38
  Scenario: Verify that the results are displayed in Ascending order of Program status
    Given User is on the Program page
    When User clicks on the Ascending arrow (down)near to the Program status
    Then User can see the results in Ascending order of Program status

  #Results in descending order
  @tag39
  Scenario: Verify that the results are displayed in descending order of Program name
    Given User is on the Program page
    When User clicks on the descending arrow (down) near to the Program name
    Then User can see the results in descending order of Program name

  @tag40
  Scenario: Verify that the results are displayed in descending order of Program description
    Given User is on the Program page
    When User clicks on the descending arrow (down) near to the Program Description
    Then User can see the results in descending order of Program description

  @tag41
  Scenario: Verify that the results are displayed in descending order of Program status
    Given User is on the Program page
    When User clicks on the descending arrow (down)near to the Program status
    Then User can see the results in descending order of Program status
