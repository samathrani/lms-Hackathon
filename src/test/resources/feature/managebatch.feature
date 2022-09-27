@ManageBatch
Feature: Manage Batch

  @tag1
  Scenario Outline: Log in with valid credentials
    Given User is on Login Page
    When Enters username and Password using "<testId>" and "<sheetName>" and user clicks on Login button
    Then navigates to home page

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag2
  Scenario Outline: click Batch on the title bar
    Given User is logged in to the Batch page using valid credentials from "<testId>" and "<sheetName>"
    When user clicks Batch on the title Bar
    Then user should be navigated to manage batch page

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag3
  Scenario Outline: Test the search functionality of Batch page
    Given User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>"
    When user clicks on Batch on the title Bar and The user enters the text in the Search box
    Then The entries for the entered text should be displayed successfully

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag8
  Scenario Outline: Test the check box functionality in Manage Batch page
    Given User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>"
    When The user clicks on Batch and The user clicks on the check box of all assignments
    Then The check box of the header should be clicked successfully

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag9
  Scenario Outline: Validate delete functionality of one Manage Batch by clicking Yes in confirmation page
    Given The user is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>"
    When The user clicks Delete button after selecting check box of an Batch and The user clicks on Yes in confirm deletion form
    Then The selected batches should be deleted successfully with Successful Batch Deleted message

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  #@tag10
  #Scenario Outline: Validate delete functionality of one Batch by clicking No in confirmation page
  #Given The user is logged in to Batch page using valid credentials from "<testId>" and "<sheetname>"
  #When The user clicks Delete button after selecting check box of an batch  and The user clicks on No in confirm deletion form
  #Then The user should be directed to the Manage Batch page
  #Examples:
  #| testId | sheetname |
  #| a      | Sheet1    |
  #
  #@tag11
  #Scenario Outline: Validate delete functionality of multiple batches by clicking Yes in confirmation page
  #Given The user is logged in to Batch page using valid credentials from "<testId>" and "<sheetname>"
  #When The user clicks Delete button after selecting check boxes of all batches and The user clicks on Yes in confirm deletion form
  #Then The selected batches should be deleted successfully with a Successful Batch Deleted message
  #Examples:
  #| testId | sheetname |
  #| a      | Sheet1    |
  @tag12
  Scenario Outline: Validate new assignment details page with empty fields
    Given The User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>" and user clicks on batch
    When The user clicks A new batch button and The user keeps all fields empty and clicks save
    Then An error message Name is required should be displayed under name field

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag13
  Scenario Outline: Validate new batch details page by entering all fields
    Given User is logged in to Batch page  using valid credentials from "<testId>" and "<sheetName>" and user clicks on batch
    When The user clicks A new batch button and The user enters all fields and clicks save
    Then A new batch should be created successfully with a message Batch created

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag14
  Scenario Outline: Validate working of cancel button in Assignment page
    Given User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>" and user clicks on batch
    When The user clicks A new batch button with enters all fields and The user clicks cancel after clicking on Edit button
    Then The Batch details page should be closed successfully

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag19
  Scenario Outline: Validate previous and next page buttons for pagination
    Given User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>" and user clicks on batch
    When The user clicks on next button
    Then The user should be a navigated to the next page

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  #@tag20
  #Scenario Outline: Validate first and last page buttons for pagination
  #Given User is logged in to Batch page
  #When The user clicks on last page button
  #Then The user should be navigated to a last page
  #When The user clicks on first page button
  #Then The user should be navigated to the first page
  @tag21
  Scenario Outline: Validate sorting Batch name in ascending and descending order
    Given User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>" and user clicks on batch
    When The user clicks on Batch name
    Then The Batch name should be sorted in ascending order

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag22
  Scenario Outline: Validate sorting Batch description in ascending and descending order
    Given User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>" and user clicks on batch
    When The user clicks on Batch description
    Then The Batch description should be sorted in ascending order

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag23
  Scenario Outline: Validate sorting Batch Status in ascending and descending order
    Given User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>" and user clicks on batch
    When The user clicks on Batch status
    Then The Batch status should be sorted in ascending order

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag24
  Scenario Outline: Validate sorting No of Classes in ascending and descending order
    Given User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>" and user clicks on batch
    When The user clicks on  No of Classes
    Then No of Classes should be sorted in ascending order

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |

  @tag25
  Scenario Outline: Validate sorting Program Name in ascending and descending order
    Given User is logged in to Batch page using valid credentials from "<testId>" and "<sheetName>" and user clicks on batch
    When The user clicks on Program Name
    Then The Program Name should be sorted in ascending order

    Examples: 
      | testId | sheetName |
      | a      | Sheet1    |
