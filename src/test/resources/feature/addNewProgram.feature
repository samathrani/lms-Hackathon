 # @Add new program
 Feature: add new program
  @tag1
  Scenario: Validate Add New Program
    Given User is on Program Details form to add new program after valid login with "<testId>" and "<sheetName>"
    When User clicks "<A New Program>" button
    Then User lands on Program Details form to add new program.

  @tag2
  Scenario: Empty form submission to add new program
    Given User is on Program Details form for adding new program
    When User clicks "<Save>" button without entering data
    Then User gets message "Name is required."

  @tag3
  Scenario: Enter Program Name Description and Status and click "<Save>" to add new program
    Given User is on Program Details form for adding new program 
    When User enters "<Name>" "<Description>" and "<Status>" and clicks "<Save>" button
    Then User can see "Successful Program created" message on screen
       
