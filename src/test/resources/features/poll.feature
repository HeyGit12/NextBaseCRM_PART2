Feature: Poll activity

  Background:
    Given The user is on log in page

  @wip
  Scenario Outline:Add users from contact list
    When the user logins as a "<userType>"
    And the user clicks on Poll tab and adds "marketing84@cybertekschool.com","helpdesk1@cybertekschool.com"
    Then the user should be able to add "marketing84@cybertekschool.com","helpdesk1@cybertekschool.com"

    Examples:
      | userType        |
      | Helpdesk        |
      | Human Resources |
      | Marketing       |
