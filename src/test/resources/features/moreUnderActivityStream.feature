@NEXTBASE-351
Feature: Announcement function from "More"

  #*{color:#ff0000}User Story:
	#{color}*{color:#172b4d}As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.{color}*{color:#ff0000}
	#
	#Acceptance Criteria:{color}*
	#
	#*1. User should be able to click on upload files icon to upload files and pictures from local disks.*
	# 2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
	# 3. User should be able to attach link by clicking on the link icon.
	# 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	# 5. User should be able to create a quote by clicking on the Comma icon.
	# 6. User should be able to add mention by clicking on the Add mention icon.
	# 7. User should be able to send announcement.

	#Scenario: Verify that user should be able to click on upload files icon to upload files and pictures from local disks.
  @NEXTBASE-343
  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user uploads a file from localdisk
    Then the user should be able to see file and picture are uploaded

    Examples:
      | userType       |
      | Helpdesk       |
      | Human_Resources |
      | Marketing      |

#*{color:#de350b}User Story:{color}*
	#As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#
	#{color:#de350b} *Acceptance Criteria:*{color}
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks.
	# *2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.*
	# 3. User should be able to attach link by clicking on the link icon.
	# 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	# 5. User should be able to create a quote by clicking on the Comma icon.
	# 6. User should be able to add mention by clicking on the Add mention icon.
	# 7. User should be able to send announcement.

  #Scenario: Verify that user should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
  @NEXTBASE-344
  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user adds multiple users by selecting
    Then the user should be able to see users are added

    Examples:
      | userType       |
      | Helpdesk       |
      | Human_Resources |
      | Marketing      |

    #*{color:#de350b}User Story:{color}*
	#As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#
	#{color:#de350b} *Acceptance Criteria:*{color}
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks.
	# 2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
	# *3. User should be able to attach link by clicking on the link icon.*
	# 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	# 5. User should be able to create a quote by clicking on the Comma icon.
	# 6. User should be able to add mention by clicking on the Add mention icon.
	# 7. User should be able to send announcement.

  #Scenario: Verify that user should be able to attach link by clicking on the link icon.
  @NEXTBASE-345
  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user attaches a link
    Then the user should be able to see the link is attached

    Examples:
      | userType       |
      | Helpdesk       |
      | Human_Resources |
      | Marketing      |



#*{color:#de350b}User Story:{color}*
	#As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#
	#{color:#de350b} *Acceptance Criteria:*{color}
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks.
	# 2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
	# 3. User should be able to attach link by clicking on the link icon.
	# *4. User should be able to insert videos by clicking on the video icon and entering the video URL.*
	# 5. User should be able to create a quote by clicking on the Comma icon.
	# 6. User should be able to add mention by clicking on the Add mention icon.
	# 7. User should be able to send announcement.

  #Scenario: Verify that user should be able to insert videos by clicking on the video icon and entering the video URL.
  @NEXTBASE-346
  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user enters a video link
    Then the user should be able to see video is inserted


    Examples:
      | userType       |
      | Helpdesk       |
      | Human_Resources |
      | Marketing      |

    #*{color:#de350b}User Story:{color}*
	#As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#
	#{color:#de350b} *Acceptance Criteria:*{color}
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks.
	# 2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
	# 3. User should be able to attach link by clicking on the link icon.
	# 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	# *5. User should be able to create a quote by clicking on the Comma icon.*
	# 6. User should be able to add mention by clicking on the Add mention icon.
	# 7. User should be able to send announcement.

  #Scenario: Verify that User should be able to create a quote by clicking on the Comma icon.
  @NEXTBASE-347
  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user creates a quote
    Then the user should be able to see the quote is created

    Examples:
      | userType       |
      | Helpdesk       |
      | Human_Resources |
      | Marketing      |


    #*{color:#de350b}User Story:{color}*
	#As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#
	#{color:#de350b} *Acceptance Criteria:*{color}
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks.
	# 2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
	# 3. User should be able to attach link by clicking on the link icon.
	# 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	# 5. User should be able to create a quote by clicking on the Comma icon.
	# *6. User should be able to add mention by clicking on the Add mention icon.*
	# 7. User should be able to send announcement.

  #Scenario: Verify that user should be able to add mention by clicking on the Add mention icon.
  @NEXTBASE-348
  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user adds mention
    Then the user should be able to see the mention is added

    Examples:
      | userType       |
      | Helpdesk       |
      | Human_Resources |
      | Marketing      |

  #*{color:#de350b}User Story:{color}*
	#As a user, I should be able to send annoucement from Annoucement subheadding from "More" under Activity Stream.
	#
	#{color:#de350b} *Acceptance Criteria:*{color}
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks.
	# 2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
	# 3. User should be able to attach link by clicking on the link icon.
	# 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	# 5. User should be able to create a quote by clicking on the Comma icon.
	# 6. User should be able to add mention by clicking on the Add mention icon.
	# *7. User should be able to send announcement.*

  #Scenario: Verify that user should be able to send announcement.
  @NEXTBASE-349
  Scenario Outline: Announcement with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user opens Announcement panel
    And the user sends the announcement
    Then the user should be able to see announcement is posted

    Examples:
      | userType       |
      | Helpdesk       |
      | Human_Resources |
      | Marketing      |