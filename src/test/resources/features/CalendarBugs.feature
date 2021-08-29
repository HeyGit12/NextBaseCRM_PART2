@wip
Feature: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track
  the tasks or events on "Calendar" page.

  Scenario:HR User adds new event with given details
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks add
    And enter the below event details and click Save button
      | Event name              | NextBase-290                                               |
      | Description             | MY_FIRST_DESCRIPTION_OF_BIRTHDAY                           |
      | This event is important | true                                                       |
      | Event date              | 09/25/2021                                                 |
      | Event end date          | 09/30/2021                                                 |
      | Time zone               | (UTC +02:00) Europe/Stockholm                              |
      | Location                | West Meeting Room                                          |
      | Attendees               | marketing1@cybertekschool.com/helpdesk1@cybertekschool.com |
      | Event color             | Pink                                                       |
      | Availability            | Occupied                                                   |

    Then user should be able to add event by clicking SAVE button and display event on calendar

  Scenario: HR User edits repeat section as "Daily"
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks event and selects edit
    Then user should be able to change repeat section as "Daily"