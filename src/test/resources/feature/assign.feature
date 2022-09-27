@Assignment
Feature: Test Assignment functionality

  @assign
  Scenario Outline: Validation of header and footer
    Given The user is logged in to program page using valid credentials from "<testid>" and "<sheetname>"
    When The user clicks on Assignment
    Then The user should be directed to the Assignment page
    And The user should successfully see the header in the Assignment page
    And The user should successfully see a footer in the Assignment page

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Test the search functionality of Assignment page
    Given The user is logged in to program page using valid credentials from "<testid>" and "<sheetname>"
    When The user clicks on Assignment
    And The user enters the text in the Search box
    Then The entries for the entered text should be displayed successfully

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Test the check box functionality in Assignment page
    Given The user is logged in to program page using valid credentials from "<testid>" and "<sheetname>"
    When The user clicks on Assignment
    And The user clicks on the check box of all assignments
    Then The check box of the header should be clicked successfully

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Test the edit functionality in Assignment page
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user edits all the fields in the Search box after clicking on Edit button
    Then The fields should be edited successfully

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate delete functionality of one assignment by clicking Yes in confirmation page
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks Delete button after selecting check box of an assignment
    And The user clicks on Yes in confirm deletion form
    Then The selected assignments should be deleted successfully with Successful Assignment Deleted message

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate delete functionality of one assignment by clicking No in confirmation page
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks Delete button after selecting check box of an assignment
    And The user clicks on No in confirm deletion form
    Then The user should be directed to the Assignment page

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate delete functionality of multiple assignments by clicking Yes in confirmation page
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks Delete button after selecting check boxes of all assignments
    And The user clicks on Yes in confirm deletion form
    Then The selected assignments should be deleted successfully with a Successful Assignment Deleted message

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate new assignment details page with empty fields
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks A new assignment button
    And The user keeps all fields empty and clicks save
    Then An error message Name is required should be displayed under name field

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate new assignment details page by entering all fields
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks A new assignment button
    And The user enters all fields and clicks save
    Then A new assignment should be created successfully with a message Assignment created

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate cancel functionality in new assignment details page
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks A new assignment button
    And The user enters all fields and clicks cancel
    Then The assignment details page should be closed successfully

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate close button in new assignment details page
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks A new assignment button
    And The user enters all fields and clicks close button
    Then The assignment details page should be closed successfully

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate working of cancel button in Assignment page
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks cancel after clicking on Edit button
    Then The assignment details page should be closed successfully

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate sorting Assignment name in ascending and descending order
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks on Assignment name
    Then The assignment name should be sorted in ascending order
    When The user clicks on Assignment name again
    Then The assignment name should be sorted in descending order

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate sorting Assignment description in ascending and descending order
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks on Assignment description
    Then The assignments description should be sorted in ascending order
    When The user clicks on Assignment description again
    Then The assignments description should be sorted in descending order

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate sorting Assignment due date in ascending and descending order
    Given The user is in the Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks on Assignment due date
    Then The assignments should be sorted in a ascending order
    When The user clicks on Assignment due date again
    Then The assignments should be sorted in descending order

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate previous and next page buttons for pagination
    Given The user is in the first Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks on next button
    Then The user should be a navigated to the next page
    When The user clicks on previous button
    Then The user should be navigated to the first page

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |

  @assign
  Scenario Outline: Validate first and last page buttons for pagination
    Given The user is in the first Assignment page by logging with valid credentials from "<testid>" and "<sheetname>"
    When The user clicks on last page button
    Then The user should be navigated to a last page
    When The user clicks on first page button
    Then The user should be navigated to the first page

    Examples: 
      | testid | sheetname |
      |      a | Sheet1    |
