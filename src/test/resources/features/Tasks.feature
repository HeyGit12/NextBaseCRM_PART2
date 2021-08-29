Feature: Tasks page functionality

  Scenario: HR User can create task
    Given user already logged in with "hr1@cybertek.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And user click NEW TASK button
    And user enter following informations
      | Things to do | Test              |
      | Description  | Testing this page |
    And user click High Priority check box
    And user enter deadline
    And user Add mention
    And  user click "ADD TASK" button
    Then user should be able to add new task


  Scenario: Marketing User can edit the task
    Given user already logged in with "marketing1@cybertek.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And user click created task
    And user click EDIT
    And user enter following informations
      | Things to do | Test |
    And user click "SAVE CHANGES" button
    Then user should be able to edit the task


  Scenario:Hr user can use edit functionality
    Given user already logged in with "hr1@cybertek.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And user click created task
    And user click EDIT
    And user click More
    And user add Time tracking
    And user add reminder
    And user add Dependent tasks
    And user click "SAVE CHANGES" button
    Then user can see edited following informations
      | Reminder        | alper@cybertekschool.com |
      | Estimate        | 02:30:00                 |
      | Dependent tasks | things to do             |

  @wip
    Scenario: Marketing User can create a subtask
      Given user already logged in with "marketing1@cybertek.com" username "UserUser" password
      When user click plus icon
      And user enter following informations
        | Things to do | Test.m.v.1              |
        | Description  | Subtask created |
      And user add subtask
      And user click More
      And user add Tags
      And  user click "ADD TASK" button
      Then user should be ableto create subtask