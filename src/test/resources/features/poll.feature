Feature: Poll activity

  Background:
    Given The user is on log in page


  Scenario Outline:Add users from contact list to Poll
    When the user logins as a "<userType>"
    And the user navigates to Poll tab
    And the user selects "marketing84@cybertekschool.com","helpdesk1@cybertekschool.com" from contacts
    Then the user should be able to add "marketing84@cybertekschool.com","helpdesk1@cybertekschool.com"

    Examples:
      | userType        |
      | Helpdesk        |
      | Human Resources |
      | Marketing       |


  Scenario Outline:Add link to Poll
    When the user logins as a "<userType>"
    And the user navigates to Poll tab
    And the user adds "https://www.amazon.com/Logitech-Headset-H390-Noise-Cancelling/dp/B000UXZQ42/ref=lp_16225007011_1_9" from link option
    Then the user should be able to add "https://www.amazon.com/Logitech-Headset-H390-Noise-Cancelling/dp/B000UXZQ42/ref=lp_16225007011_1_9" as a link

    Examples:
      | userType        |
      | Helpdesk        |
      | Human Resources |
      | Marketing       |

  @wip
  Scenario Outline:Add mention to Poll
    When the user logins as a "<userType>"
    And the user navigates to Poll tab
    And the user clicks on add mention icon and mentions "marketing84@cybertekschool.com"
    Then the user should be able to add "marketing84@cybertekschool.com" as a mention


    Examples:
      | userType        |
      | Helpdesk        |
      | Human Resources |
      | Marketing       |

