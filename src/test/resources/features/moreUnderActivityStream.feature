@wip
Feature: Announcement function from "More"


  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user uploads a file from localdisk
    Then the user should be able to see file and picture are uploaded

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |


  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user adds multiple users by selecting
    Then the user should be able to see users are added

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user attaches a link
    Then the user should be able to see the link is attached

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user adds multiple users by selecting
    Then the user should be able to see users are added

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |


  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user enters a video link
    Then the user should be able to see video is inserted


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user creates a quote
    Then the user should be able to see the quote is created

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user adds mention
    Then the user should be able to see the mention is added

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @wip
  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user sends the announcement
    Then the user should be able to see announcement is posted

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |