@wip
Feature: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track
  the tasks or events on "Calendar" page.

  //@pass

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

  Scenario:HR User edits event color as "Navy Blue"
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks event and selects edit
    Then user should be able to change event color as "Navy blue"

  Scenario:HR User edits privacy as "Private event"
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks event and selects edit
    Then user should be able to change privacy as "Private Event"


  Scenario: Marketing user tries to display HR user's event on his/her calendar
    Given User logins with "Marketing" credentials
    And user clicks "Calendar" menu
    When user clicks Schedule
    Then user should not be able to display HR user's event on his-her calendar

  Scenario: HR User edits his-her availability as "Unsure"
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks event and selects edit
    Then user should be able to change his-her availability as "Unsure"

  Scenario: HR User edits his-her event's name as "MY_TEST_EVENT"
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks event and selects edit
    Then user should be able to change his-her event's name as "MY_TEST_EVENT"

  Scenario: HR User deletes attendee by editing the event
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks event and selects edit
    Then user should be able to delete an attendee

  Scenario: HR User adds one more attendee by editing the event
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks event and selects edit
    Then user should be able to add one more attendee("marketing1@cybertekschool.com") by editing the event

  Scenario: Marketing user displays the invitations by using "Filter and search" box after clicking "Invitations" button
    Given  User logins with "Marketing" credentials
    And user clicks "Calendar" menu
    When user clicks Filter and search and clicks Invitations
    Then user should be able to display "Invitations"

  Scenario: HR user filters events and-or tasks by using "Filter and Search" box after clicking "I'M AN ORGANIZER" button
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks Filter and search and clicks I'M AN ORGANIZER
    Then user should be able to display "I'm an organiser"

  Scenario: Helpdesk user resets after selecting "Yes" under "Event with participants" menu and "Invited" under "Participant status"
    Given  User logins with "Helpdesk" credentials
    And user clicks "Calendar" menu
    When user clicks Filter and search
    And user selects Yes under Event with participants, Invited under Participation status and click reset
    Then user should be able to reset user input fields to "Not specified"

  Scenario: delete record
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    Then selects edit and delete event





