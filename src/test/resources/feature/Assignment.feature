@Assignment
Feature: Test Assignment functionality


     @assign
  Scenario Outline: Validation of header and footer
    Given The user is logged in to program page using valid credentials from "<testid>" and "<sheetname>"
    When The user clicks on Assignment
    Then The user should be navigated to the Assignment page
    And  The user should successfully see the header and footer in the Assignment page
    Examples:
     |testid|sheetname|
   |1   |Sheet1|
   


  #@assign
  #Scenario Outline: Test the search functionality of Assignment page
    #Given The user is logged in to the Assignment page using valid credentials from "<testid>" and "<sheetname>"
    #When The user enters the text in the Search box using data from "<testid>" and "<sheetname>"
    #Then The entries for the entered text should be displayed successfully
#
  #Examples:
   #|testid|sheetname|
   #|1   |Sheet1|
   #|1   |Sheet1|