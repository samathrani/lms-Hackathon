@test001
Feature: Register Functionality
  I want to use this template for my feature file
  
 #Background: The User is on the browser
 #Given User is on the register page

  @test001
  Scenario: Validating the heading of Registration form
   Given User is on LMS website
   When User clicks register button
   Then User should land on registration page and sees the heading on the form as "Registration Form"
  
  @test001
  Scenario: Validating the Login button visibility
   Given User is on LMS website
   When User clicks register button
   Then User sees a log in button with text "Log in" on the form
     
  @test001
  Scenario: Validating the Sign Up button visibility
  Given  User is on LMS website
  When User clicks register button
  Then User sees a sign up button with text "Sign Up" on the form
  
   @test001
   Scenario: Validating the Login button functionality
   Given User is on the Registeration Page
   When User clicks the Log in button
   Then User lands on the Log in page
  
  @test001
  Scenario: Validating the Sign Up form with all fields empty
  Given User is on the Registeration Page
  When User clicks sign up button with all fields empty
  Then User should get a message "Please fill out the fields above"
  
  @test001
  Scenario: Validating the Sign Up form with all mandatory fields empty
  Given User is on the Registeration Page
  When  User clicks sign up button with all mandatory fields empty
  Then User should get a message "Please fill out the fields above"
  
  @test001
  Scenario: Validating the Sign Up form with one of the mandatory fields empty
  Given User is on the Registeration Page
  When  User clicks sign up button with one of the mandatory fields empty
  Then User should get a message "Please fill out the field above"
  
  @test001
  Scenario: Validating the signup form with invalid phone
  Given User is on the Registeration Page
  When User clicks Sign Up button with invalid phone
  Then  User should get a message "Please fill valid phone"
  
  @test001
  Scenario: Validating the signup form with invalid email
  Given User is on the Registeration Page
  When User clicks Sign Up button with invalid email
  Then User should get a message "Please fill valid email"
  
  @test001
  Scenario: Validating the signup form with invalid password
  Given User is on the Registeration Page
  When User clicks Sign Up button with invalid Password
  Then User should get a message "Please fill valid Password"
  
  @test001
  Scenario: Validating the signup form with existing Username
  Given User is on the Registeration Page
  When USer clicks Sign Up button with existing User name
  Then User should see the message "Username already exist"
  
   @test001
  Scenario: Validating Sign Up form with valid data
  Given User is on the Registeration Page
  When User enters all Field value and click Sign Up button
  Then User should get successful message "Registeration successful"
     



   