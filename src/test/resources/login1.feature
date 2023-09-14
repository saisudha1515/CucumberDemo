# all Scenarios are running in Batch Execution mode..(i.e, one by one all scenarios are running)
Feature: ActiTime Login

  Scenario: Login to the actiTime home page
    Given Login page must display
    When Fill the valid username
    And Fill the valid password
    And Click on login
    Then Home page must display

    Scenario: Login to the actiTime home page
    Given Login page must display
    When Fill the invalid username
    And Fill the valid password
    And Click on login
    Then Home page must display
    
    Scenario: Login to the actiTime home page
    Given Login page must display
    When Fill the valid username
    And Fill the invalid password
    And Click on login
    Then Home page must display
    
    Scenario: Login to the actiTime home page
    Given Login page must display
    When Fill the invalid username
    And Fill the invalid password
    And Click on login
    Then Home page must display
    
    Scenario: Login to the actiTime home page
    Given Login page must display
    When Fill the blank username
    And Fill the blank password
    And Click on login
    Then Home page must display
    