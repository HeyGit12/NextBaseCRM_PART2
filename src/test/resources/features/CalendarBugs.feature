@NEXTBASE-322
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

#*User Story:*
	#
	#As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events on "Calendar" page.
	#
	#*Acceptance Criteria:*
	# # HR User can add new important event with description by specifying the start-end dates in the specific time zones, adding certain location, adding attendees, color as "Pink" and availability as "Occupied".
	# 2. HR User can edit the 1st AC's task color as "Navy Blue" by using "other color".
	# 3. HR User can edit the 1st AC's privacy as "Private event".
	# 4. Marketing user can not display the 3rd AC's private event on his/her calendar.
	# 5. HR User can edit his/her availability from "Occupied" to "Unsure".
	# 6. HR User can edit his/her event's name.
	# *7. HR User can edit Repeat section as "Daily".*
	# 8. HR User can delete attendee by editing the event.
	# 9. HR User can add one more attendee by editing the event.
	# 10. Marketing User can display the invitations by using "Filter and search" box after clicking "Invitations" button.
	# 11. HR User can filter events and/or tasks by using "Filter and search" box after clicking "I'M AN ORGANISER" button.
	# 12. Helpdesk User can reset after selecting "Yes" under "Event with participants" menu and "Invited" under "Participant status".
  @NEXTBASE-316
  Scenario: Verify that HR user should be able to edit Repeat section as "Daily".
    Given  User logins with "HR" credentials
    And user clicks "Calendar" menu
    When user clicks event and selects edit
    Then user should be able to change repeat section as "Daily"