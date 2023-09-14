# all Scenarios are running in Batch Execution mode..(i.e, one by one all scenarios are running)
Feature: ActiTime Login

  Background:  # Write the repeated Steps in Backgroun Keyword
    Given Login page must display
    And Click on login

  Scenario: Login to the actiTime home page
    When Fill the valid username
    And Fill the valid password
    Then Home page must display

  Scenario: Login to the actiTime home page
    When Fill the invalid username
    And Fill the valid password
    Then Home page must display

  Scenario: Login to the actiTime home page
    When Fill the valid username
    And Fill the invalid password
    Then Home page must display

  Scenario: Login to the actiTime home page
    When Fill the invalid username
    And Fill the invalid password
    Then Home page must display

  Scenario: Login to the actiTime home page
    When Fill the blank username
    And Fill the blank password
    Then Home page must display
