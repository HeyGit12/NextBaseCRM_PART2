Feature: Tasks page functionality
@wip
  Scenario: HR User can create task
    Given user already logged in with "hr1@cybertek.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And user click NEW TASK button
    And user enter following informations
    |Things to do|Test|
    |Description |Testing this page|
    And user click High Priority check box
    And user enter deadline
    And user Add mention
    And  user click ADD TASK button
