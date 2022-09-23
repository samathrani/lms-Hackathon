@test
Feature: Title 
  I want to use this template for my feature file
  
 # @test
 #Background: The User logs in to the home page
  #Scenario Outline:
# Given User is in login page
 #When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"


  @test
 Scenario Outline: Verify that the title of the Home page is LMS
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
 Then User should see a heading with text "LMS - Learning Management System" on the Home page
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
    
  @test
  Scenario Outline: Verify the program button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a program button with text "Program" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test 
  Scenario Outline: Verify the Batch button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a batch button with text "Batch" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test
 Scenario Outline: Verify the User button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a user button with text "User" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test
  Scenario Outline: Verify the Assignment button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a assignment button with text "Assignment" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test
  Scenario Outline: Verify the Attendance button
  Given User is in login page
  When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see aattendace  button with text "Attendance" on the menu bar
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @test
 Scenario Outline: Verify the Logout button
  Given User is in login page
 When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
  Then User should see a logout button with text "Logout" on the menu bar

 Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   