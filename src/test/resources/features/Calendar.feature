Feature: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events on "Calendar" page.
  Scenario:
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks "Add"
    And user clicks "This event is important" checkbox
    And user selects event date "08/25/2021" and event end date as "08/30/2021"
    And user selects "(UTC +02:00) Europe/Stockholm" by clicking timezone
    And user selects Repeat option as "Daily"
    And user selects Location option as "Central Meeting Room"
    And user selects Attendees option as "marketing1@cybertekschool.com","helpdesk1@cybertekschool.com"
    And user selects Event color from  More option as "Pink"
    And user selects Availability from  More option as "Occupied"
    Then user should be able to add event by clicking SAVE button and display event on calendar

