@NEXTBASE-337 @wip
Feature: As a user, I should be able to send messages by clicking on Message tab under Active Stream.

	#*Us:*
	#
	#As a user, I should be able to send messages by clicking on Message tab under Active Stream.
	#
	# 
	#
	#*Ac:*
	#
	#*1. User should be able to click on upload files icon to upload files and pictures from local disks.*
	#*2. User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.*
	#*3. User should be able to attach link by clicking on the link icon.*
	#4. User should be able to insert videos by clicking on the video icon and entering the video URL.
	#*5. User should be able to create a quote by clicking on the Comma icon.*
	#*6. User should be able to add mention by clicking on the Add mention icon.*
	#*7. User should be able to send a message.*
	@NEXTBASE-333 @SMOKE
	Scenario Outline: Verify that as a user, I should be able to send messages by clicking on Message tab under Active Stream.
		Sending message as "<user>"
		    Given the user is on the homepage with valid "<userName>" and "<password>" as "<user>"
		    When the user clicks on the Send message box under the MESSAGE feature
		    And the user types "<message>" in the message typing box
		    And the user clicks on upload files icon at the bottom left of the message typing box
		    And the user clicks on Add more icon which located in the to box
		    And the user clicks on All employees icon then clicks on Employees and departments icon from opening popup
		    And the user choose "<employee 1>" and "<employee 2>" by clicking on employees from opening list
		    And the user clicks on link icon and adds "<link>" and "<text>" to the boxes and clicks save icon
		    And the user clicks on Add mention icon at the bottom of the message typing box
		    And the user clicks on Employees and departments icon form opening popup and choose "<employee 1>" by clicking on
		    And the user creates a Quote by clicking on the Quote icon at the bottom of the message typing box
		    And the user clicks on send icon at the bottom lef of the general message box
		    Then the user should see forwarded message under Activity Stream title with visible sender as "<userName>"
		
		
		    Examples:
		      | user | userName                | password | message        | employee 1                    | employee 2                   | link                                              | text       |
		      | HR12 | hr12@cybertekschool.com | UserUser | Recommendation | marketing1@cybertekschool.com | helpdesk1@cybertekschool.com | https://www.youtube.com/watch?v=6xLxF8Rh6Rs&t=21s | Experience |
		