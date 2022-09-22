@test
Feature: Title 
  I want to use this template for my feature file
  
 Background: The User logs in to the home page
 Given User is on the browser
 When User landed on the Home page after logging into the LMS website
 
 
  @test
  Scenario: Verify that the title of the Home page is LMS
  Then User should see a heading with text "LMS - Learning Management System" on the Home page
    
  @test
  Scenario:
  Then User should see a button with text "Program" on the menu bar
  
  @test
  Scenario:
  Then User should see a button with text "Batch" on the menu bar
  
  @test
  Scenario:
  Then User should see a button with text "User" on the menu bar
  
  @test
  Scenario:
  Then User should see a button with text "Assignment" on the menu bar
  
  @test
  Scenario:
  Then User should see a button with text "Attendance" on the menu bar
  
  @test
  Scenario:
  Then User should see a button with text "Logout" on the menu bar

