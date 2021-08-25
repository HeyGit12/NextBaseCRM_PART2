@services
Feature: Services functionality

  Scenario: User can be redirected to "New Event" page for booking a meeting room
    Given the user logged in as a "helpdesk"
    When the user go to "Services" "Meeting Room Booking"
    And the user click "Meeting Room Booking Calendar View"
    And the user should be able to display "Event Calendar"
    And the user click "East Meeting Room" to uncheck the checkbox
    And the user click "Book meeting room"
    Then the user should be able to display "New event" page

  Scenario: User can suggest new idea
    Given the user logged in as a "marketing"
    When the user go to "Services" "Ideas"
    And the user click "New idea"
    And the user enter title as "MY_TEST_IDEA"
    And the user enter description as "MY_TEST_DESCRIPTION_OF_IDEA"
    And the user select "Holidays" from category
    Then the user should be able to suggest new idea



  Scenario Outline: user can <icon> an idea
    Given the user logged in as a "<user>"
    When the user go to "<tab>" "<module>"
    And the user can click "<icon>" icon
    Then the user should be able to click "<sign>" icon


    Examples:
      | user      | tab      | module | icon   | sign  |
      | marketing | Services | Ideas  | Like   | plus  |
      | marketing | Services | Ideas  | Unlike | minus |


@wip
  Scenario: User can sort ideas by "date added"
    Given the user logged in as a "marketing"
    When the user go to "Services" "Ideas"
    And the user can sort the ideas by "date added"
    Then the user should be able to sort ideas

  Scenario: User can sort ideas by "rating"
    Given the user logged in as a "marketing"
    When the user go to "Services" "Ideas"
    And the user can sort the ideas by "rating"
    Then the user should be able to sort ideas




