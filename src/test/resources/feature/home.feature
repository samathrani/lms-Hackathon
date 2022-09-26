@test002
Feature: HomePage Functionality 
 
  
 # @test
 #Background: The User logs in to the home page
  #Scenario Outline:
# Given User is in login page
 #When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"


  @test002
 Scenario Outline: Verify the heading of the Home page 
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
 Then User should see a heading with text "LMS - Learning Management System" on the Home page
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
    
  @test002
  Scenario Outline: Verify the program button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a program button with text "Program" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test002
  Scenario Outline: Verify the Batch button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a batch button with text "Batch" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test002
 Scenario Outline: Verify the User button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a user button with text "User" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test002
  Scenario Outline: Verify the Assignment button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a assignment button with text "Assignment" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test002
  Scenario Outline: Verify the Attendance button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see aattendace  button with text "Attendance" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test002
 Scenario Outline: Verify the Logout button
  Given User is in login page
 When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a logout button with text "Logout" on the menu bar

 Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
     
   
      @test002
 Scenario Outline: Verify the function of Program button
  Given The User is in home page after enters valid data from the datasheet with "<testId>" and "<sheetName>"
 When The user clicks a Program  button
  Then The User should redirected to Program  page

 Examples:
  |testId|sheetName|
   |    a |Sheet1   |
   
    @test002
 Scenario Outline: Verify the function of Batch button
  Given The User is in home page after enters valid data from the datasheet with "<testId>" and "<sheetName>"
 When The user clicks a Batch button
  Then The User should redirected to Batch page

 Examples:
  |testId|sheetName|
   |    a |Sheet1   |
   
      @test002
 Scenario Outline: Verify the function of User button
  Given The User is in home page after enters valid data from the datasheet with "<testId>" and "<sheetName>"
 When The user clicks a User button
  Then The User should redirected to User page

 Examples:
  |testId|sheetName|
   |    a |Sheet1   |
   
      @test002
 Scenario Outline: Verify the function of Assignment button
  Given The User is in home page after enters valid data from the datasheet with "<testId>" and "<sheetName>"
 When The user clicks a Assignment button
  Then The User should redirected to Assignment page

 Examples:
  |testId|sheetName|
   |    a |Sheet1   |
   
      @test002
 Scenario Outline: Verify the function of Attendance button
  Given The User is in home page after enters valid data from the datasheet with "<testId>" and "<sheetName>"
 When The user clicks a Attendance button
  Then The User should redirected to Attendance page

 Examples:
  |testId|sheetName|
   |    a |Sheet1   |
   
   
   @test002
 Scenario Outline: Verify the function of Logout button
  Given The User is in home page after enters valid data from the datasheet with "<testId>" and "<sheetName>"
 When The user clicks a logout button
  Then The User should redirected to login page

 Examples:
  |testId|sheetName|
   |    a |Sheet1   |
   
   