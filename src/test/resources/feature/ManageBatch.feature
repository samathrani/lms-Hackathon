@ManageBatch
Feature: Manage Batch

  @tag1
  Scenario Outline: Log in with valid credentials
    Given User is on Login Page
    When Enters "<username>" and "<Password>" and user clicks on Login button
    Then navigates to home page

    @tag2
    Examples: 
      | username      | password   |
      | kalaiselvi546 | sathya5632 |

  @tag2
  Scenario: click Batch on the title bar
    Given User is on home page
    When user clicks Batch on the title Bar
    Then user should be navigated to manage batch page

  @tag3
  Scenario: Validating the Heading
    Given User is logged on to LMS website
    When User is on Batch page
    Then User should see a heading with text "Manage Batch" on the page

  @tag4
  Scenario: Validating the default state of Delete button
    Given User is logged on to LMS website
    When User is on Batch page
    Then Verify that the Delete button next to the search box is Disabled

  @tag5
  Scenario: Validate that number of records (rows of data in the table) displayed
    Given User is logged on to LMS website
    When User is on Batch page
    Then Verify that number of records (rows of data in the table) displayed on the page are 5

  @tag6
  Scenario: Search by Batch Name
    Given User is on Batch page
    When user clicks on search box with Batch Name entered in it
    Then records of that  "Batch Name" are displayed

  @tag7
  Scenario: Edit Feature
    Given User is on Batch page
    When User clicks on Edit button
    Then User lands on Batch Details form.

  @tag8
  Scenario: 
    Given User is on Batch details page
    When User clicks on Edit button
    Then User lands on Batch Details form.

  @tag9
  Scenario: 
    Given User is on Batch details page
    When User edits Name
    Then User can see edited Name

  @tag10
  Scenario: 
    Given User is on Batch details page
    When user edits description
    Then User can see edited descricption

  @tag11
  Scenario: 
    Given User is on Batch details page
    When user edits program name
    Then user can see edited program name

  @tag12
  Scenario: 
    Given User is on Batch details page
    When user changes status
    Then User can see updated Status

  @tag13
  Scenario: 
    Given User is on Batch details page
    When user edits No of classes
    Then user can see updated No of classes

  @tag14
  Scenario: 
    Given User is on Batch details page
    When user clicks cancel button
    Then User can see Batch Details are not updated

  @tag15
  Scenario: 
    Given User is on Batch details page
    When user clicks save button
    Then User can see 'Successful Batch Updated' alert

  @tag16
  Scenario: Verify Edited Batch details
    Given User is on Batch page
    When User searches with newly updated "Batch Name"
    Then User verifies that the details are correctly updated

  @tag17
  Scenario: Select Batch
    Given User is on Batch page
    When User selects more than one Batch using checkbox
    Then Baches gets selected

  @tag18
  Scenario: 
    Given User is on Batch page
    When User clicks on Delete button
    Then User lands on Confirm Deletion form.

  @tag19
  Scenario: 
    Given user is on Batch Confirm Deletion page
    When User clicks Yes button
    Then User can see 'Successful BatchDeleted' message

  @tag20
  Scenario: 
    Given User is on Batch page
    When User Searches for "Deleted Batch names"
    Then There should be zero results.

  @tag21
  Scenario: 
    Given User is on Batch Confirm Deletion Page after selecting multiple batches
    When User clicks No button
    Then User can see Batches are still selected and not deleted

  @tag22
  Scenario: 
    Given user is on Batch page
    When user clicks delete  button for any batch
    Then user will get confirm deletion popup

  @tag23
  Scenario: 
    Given user is on Batch Confirm Deletion page
    When User clicks Yes button
    Then User can see 'Successful BatchDeleted' message

  @tag24
  Scenario: 
    Given user is on Batch page
    When User Searches for "Deleted Batch name"
    Then There should be zero results

  @tag25
  Scenario: 
    Given User is on Batch Confirm Deletion Page after selecting a batch to delete
    When User clicks No button
    Then User can see Batch is not deleted

  @tag26
  Scenario: validate add new batch
    Given User is on Batch page
    When User clicks A New Batch button
    Then user can see Batch details form

  @tag27
  Scenario: Empty form submission
    Given User is on Batch details page
    When User clicks Save button without entering data
    Then User gets message 'Name is required'

  @tag28
  Scenario: 
    Given User is on Batch details page
    When User clicks Cancel button
    Then User can see Batch Details form disappears

  @tag29
  Scenario: 
    Given User is on Batch details page
    When user enters name in text box
    Then User can see 'Name' entered

  @tag30
  Scenario: 
    Given User is on Batch details page
    When User enters Description in text box
    Then User can see 'Description' entered

  @tag31
  Scenario: 
    Given User is on Batch details page
    When User selects Program name
    Then User can see 'Program Name' selected

  @tag32
  Scenario: 
    Given User is on Batch details page
    When User selects Status using radiobutton
    Then User can see 'Active/Inactive' status selected

  @tag33
  Scenario: 
    Given User is on Batch details page
    When User enters No of classes in text box
    Then User can see 'No of classes' entered

  @tag34
  Scenario: 
    Given User is on Batch details page
    When User clicks Save button
    Then User gets message 'Successful batch created'

  @tag35
  Scenario: Verify Added Batch is created
    Given User is on Batch page
    When User searches with newly created "Batch Name"
    Then Records of the newly created  "Batch Name" is displayed

  @tag36
  Scenario: Verify previous link on the first page
    Given User is logged on to LMS website
    When User is on first page of Manage Batch
    Then Verify that previous link is disabled

  @tag37
  Scenario: Verify next link
    Given User is on the page number '1'
    When User clicks navigate > button
    Then User navigated to page number '2'

  @tag38
  Scenario: Verify previous link
    Given User is on page number '2'
    When User clicks navigate < button
    Then User navigated to page number '1'

  @tag39
  Scenario: Verify next link on the last page
    Given User is logged on to LMS website
    When User is on last page of Manage Batch
    Then Verify that next link is disabled

  @tag40
  Scenario: Verify that the results are displayed in Ascending order of Batch name
    Given User is on Batch page
    When User clicks on the Ascending arrow (down ) near to the Batch name
    Then User can see the results in Ascending order of Batch name

  @tag41
  Scenario: Verify that the results are displayed in Ascending order of batch Description
    Given User is on Batch page
    When User clicks on the Ascending arrow (down ) near to the Batch Description
    Then User can see the results in Ascending order of Batch Description

  @tag42
  Scenario: Verify that the results are displayed in Ascending order of Batch Status
    Given User is on Batch page
    When User clicks on the Ascending arrow (down ) near to the Batch Status
    Then User can see the results in Ascending order of Batch Status

  @tag43
  Scenario: Verify that the results are displayed in Ascending order No of Classes
    Given User is on Batch page
    When User clicks on the Ascending arrow (down ) near to the No Of Classes
    Then User can see the results in Ascending order of No of Classes

  @tag44
  Scenario: Verify that the results are displayed in Ascending order of Program Name
    Given User is on Batch page
    When User clicks on the Ascending arrow (down ) near to the Program Name
    Then User can see the results in Ascending order of Program Name

  @tag45
  Scenario: Verify that the results are displayed in Descending order of Batch name
    Given User is on Batch page
    When User clicks onthe Descending arrow (down ) near to the Batch name
    Then User can see the results in Descending order of Batch name

  @tag46
  Scenario: Verify that the results are displayed in Descending order of Batch Description
    Given User is on Batch page
    When User clicks onthe Descending arrow (down ) near to the Batch Description
    Then User can see the results in Descending order of Batch Description

  @tag47
  Scenario: Verify that the results are displayed in Descending order of Batch Status
    Given User is on Batch page
    When User clicks onthe Descending arrow (down ) near to the Batch Status
    Then User can see the results in Descending order of Batch Status

  @tag48
  Scenario: Verify that the results are displayed in Descending order No of Classes
    Given User is on Batch page
    When User clicks on the Descending arrow (down ) near to the No Of Classes
    Then User can see the results in Descending order of No of Classes

  @tag49
  Scenario: Verify that the results are displayed in Descending order of Program Name
    Given User is on Batch page
    When User clicks on the Descending arrow (down ) near to the Program Name
    Then User can see the results in Descending order of Program Name
