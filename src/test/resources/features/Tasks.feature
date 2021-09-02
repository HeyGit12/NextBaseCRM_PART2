Feature: Tasks page functionality


  Scenario: HR User can create task
    Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And user click NEW TASK button
    And user enter following informations
      | Action Type  | Create            |
      | Things to do | Test.hr.v.1       |
      | Description  | Testing this page |
    And user click High Priority check box
    And user enter deadline
    And user Add mention
    And  user click "ADD TASK" button
    Then user should be able to add new task


  Scenario: Marketing User can edit the task
    Given user already logged in with "marketing1@cybertekschool.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And user click created task
    And user click EDIT
    And user enter following informations
      | Action Type  | MarketingEdit |
      | Description | Testing          |
    And user click "SAVE CHANGES" button
    Then user should be able to edit the task


  Scenario:Hr user can use edit functionality
    Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And hr user click created task
    And user click EDIT
    And user change responsible person;
    And user click More
    And user add Time tracking
    And user add reminder
    And user add Dependent tasks
    And user click "SAVE CHANGES" button
    Then user can see edited following informations

      | Reminder        | alper@cybertekschool.com |
      | Estimate        | 02:30:00                 |
      | Dependent tasks | Test             |


  Scenario: Marketing User can create a subtask
    Given user already logged in with "marketing1@cybertekschool.com" username "UserUser" password
    When user click plus icon
    And user enter following informations
      | Action Type  | Create   |
      | Things to do | Test.m.v.1      |
      | Description  | Subtask created |
    And user click More
    And user add subtask
    And user add Tags
    And  user click "ADD TASK" button
    Then user should be ableto create subtask


  Scenario: Marketing User can add participants,observers,checklist
    Given user already logged in with "marketing1@cybertekschool.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And user click created task
    And user click EDIT
    And user enter following informations
      | Action Type  | Add                          |
      | Description | checklist tested             |
      | Participants | hr1@cybertekschool.com       |
      | Observers    | helpdesk1@cybertekschool.com |
    And user click "SAVE CHANGES" button
    Then user should be add informations


  Scenario: HR User can be redirected to "New task template" page
    Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And user open New task module
    And user click All templates
    And user click ADD
    And user must be on "New task template" page
    And user click to High Priority check box
    And user click to Add mention
    And user enter following informations
      | Action Type  | Template |
      | Things to do | Test.h   |
      | Description  | Test     |
      | Deadline in  | 7335     |
    And user click Options
    And user click Responsible person can change deadline check box and Approve task when completed check box
    And user click CREATE TEST TEMPLATE  button
    Then user must be create new task template


  Scenario: HR User can delete task
    Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
    When user click "Tasks" "All" under Activity stream
    And user click tasks check box
    And user select Delete from SELECT ACTION menu
    And user click APPLY
    And user click CONTINUE
    Then user should be able to delete task


    Scenario: HR User can add one more responsible person
      Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
      When user click "Tasks" "All" under Activity stream
      And hr user click created task
      And user click EDIT
      And user click add more button;
      Then user must add more responsible person



