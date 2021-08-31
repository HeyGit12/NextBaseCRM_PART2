Feature: Poll activity

  Background:
    Given The user is on log in page


  Scenario Outline:Add users from contact list to Poll
    When the user logins as a "<userType>"
    And the user navigates to Poll tab
    And the user enters "test" as a title
    And the user selects "<contact_1>","<contact_2>" from contacts
    And the user clicks send button
    Then the user should be able to add "<contact_1>","<contact_2>"

    Examples:
      | userType        | contact_1                      | contact_2                    |
      | Helpdesk        | marketing84@cybertekschool.com | helpdesk1@cybertekschool.com |
      | Human Resources | marketing84@cybertekschool.com | helpdesk1@cybertekschool.com |
      | Marketing       | marketing84@cybertekschool.com | helpdesk1@cybertekschool.com |


  Scenario Outline:Add link to Poll
    When the user logins as a "<userType>"
    And the user navigates to Poll tab
    And the user adds "<link>" from link option
    And the user clicks send button
    Then the user should be able to add "<link>" as a link

    Examples:
      | userType        | link                                                                                               |
      | Helpdesk        | https://www.amazon.com/Logitech-Headset-H390-Noise-Cancelling/dp/B000UXZQ42/ref=lp_16225007011_1_9 |
      | Human Resources | https://www.amazon.com/Logitech-Headset-H390-Noise-Cancelling/dp/B000UXZQ42/ref=lp_16225007011_1_9 |
      | Marketing       | https://www.amazon.com/Logitech-Headset-H390-Noise-Cancelling/dp/B000UXZQ42/ref=lp_16225007011_1_9 |


  Scenario Outline:Add mention to Poll
    When the user logins as a "<userType>"
    And the user navigates to Poll tab
    And the user clicks on add mention icon and mentions "<email>"
    And the user clicks send button
    Then the user should be able to add "<email>" as a mention

    Examples:
      | userType        | email                          |
      | Helpdesk        | marketing84@cybertekschool.com |
      | Human Resources | marketing84@cybertekschool.com |
      | Marketing       | marketing84@cybertekschool.com |


  Scenario Outline:Add questions and answers to Poll
    When the user logins as a "<userType>"
    And the user navigates to Poll tab
    And the user adds questions and answers
    Then the user should be able to add questions and answers

    Examples:
      | userType        |
      | Helpdesk        |
      | Human Resources |
      | Marketing       |


  Scenario Outline:Delete questions and answers
    When the user logins as a "<userType>"
    And the user navigates to Poll tab
    And the user adds questions and answers
    And the user deletes questions and answers
    Then the user should be able to delete questions and answers

    Examples:
      | userType        |
      | Helpdesk        |
      | Human Resources |
      | Marketing       |

  @wip
  Scenario Outline:Provide the attendees multiple choice and send poll
    When the user logins as a "<userType>"
    And the user navigates to Poll tab
    And the user enters "test test" as a title
    And the user add "<Question>", "<Answer1>" and "<Answer2>"
    And the user clicks Allow multiple choice
    And the user clicks send button
    Then the user should be able to provide "<Question>", "<Answer1>" and "<Answer2>"

    Examples:
      | userType        | Question   | Answer1   | Answer2   |
      | Helpdesk        | exQuestion | exAnswer1 | exAnswer2 |
      | Human Resources | exQuestion | exAnswer1 | exAnswer2 |
      | Marketing       | exQuestion | exAnswer1 | exAnswer2 |