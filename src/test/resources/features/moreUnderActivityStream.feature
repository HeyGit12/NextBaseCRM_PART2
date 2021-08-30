Feature: Announcement function from "More"


  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user uploads a file from localdisk
    And the user adds multiple contacts
    And the user attaches a link
    And the user creates a quote
    And the user adds mention
    And the user sends the announcement
    Then the announcement is posted


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user inserts a video

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |