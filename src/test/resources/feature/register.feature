Feature: Title of your feature
  I want to use this template for my feature file
  
 Background: The User is on the browser
 Given User is on the browser

  @tag1
  Scenario: Title of your scenario

    When 
    Then 
  
    @tag1
  Scenario: Title of your scenario
    Given 
    When 
    Then 
    
      @tag1
  Scenario: Title of your scenario
    Given 
    When 
    Then 
    
    

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |