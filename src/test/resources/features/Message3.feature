@NEXTBASE-340 @wip
Feature: As a user, I should be able to send messages by clicking on Message tab under Active Stream.

	#*Us:*
	#
	#As a user, I should be able to send messages by clicking on Message tab under Active Stream.
	#
	# 
	#
	#*Ac:*
	#
	#1. User should be able to click on upload files icon to upload files and pictures from local disks.
	#2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
	#3. User should be able to attach link by clicking on the link icon.
	#*4. User should be able to insert videos by clicking on the video icon and entering the video URL.*
	#5. User should be able to create a quote by clicking on the Comma icon.
	#6. User should be able to add mention by clicking on the Add mention icon.
	#7. User should be able to send a message.
	@NEXTBASE-335
	Scenario Outline: Verify that as a user, I should be able to send messages by clicking on Message tab under Active Stream.
		Sending message with uploaded video from youtube
		    Given the user is on the homepage with valid "<userName>" and "<password>" as "<user>"
		    When the user clicks on the Send message box under the MESSAGE feature
		    And the user click on Insert video icon at the bottom of the message typing box
		    And the user puts in video link from "<youtube>" in the opening Video source box
		    Then the user should not see any error message like "<youtubeError>"
		
		
		    Examples:
		      | user | userName                | password | youtubeError                      | youtube                                           |
		      | HR12 | hr12@cybertekschool.com | UserUser | [FVID404] The video was not found | https://www.youtube.com/watch?v=KlEPI_jV5iA&t=18s |
		
		