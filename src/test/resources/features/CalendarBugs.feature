
Feature: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track
  the tasks or events on "Calendar" page.
  @wip
  Scenario: HR User edits repeat section as "Daily"
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks event and selects edit
    Then user should be able to change repeat section as "Daily"