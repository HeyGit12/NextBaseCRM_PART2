@NEXTBASE-370
Feature: 

	#*US*
	#
	#As a user, I should be able to use 'Filter and search' functionality on Active Stream.
	#
	#*AC*
	#
	#1. User should be able to see default filters as "my activity, work, favourite, annoucements, and workflows"
	# 2. User should be able to add and remove field.
	# 3. User should be able to search by selecting Date,
	# 4. User should be able to search by selecting one or more Type,
	# *5. User should be able to save filter.*
	# 6. User should be able to restore default field,
	# 7. User should be able to reset filters to default.
	@NEXTBASE-369
	Scenario Outline: Verify that as a user, I should be able to use 'Filter and search' functionality on Active Stream.
		User creates new filter
		     Given user lands on activity stream page with valid "<username>" and "<password>" as "<User>"
		     When User clicks filter and search box which stands below the quick navigate menu
		    And user validates default filters as "MY ACTIVITY, WORK, FAVORITES, ANNOUNCEMENTS, WORKFLOWS"
		    And user clicks Save filter button that located under the Home filter
		    And user validates save button existed
		    And user types the new filter name
		    And user clicks on the save button that located at the bottom of the field's
		    Then user validates new filter created
		
		    Examples:
		      | User      | username                      | password |
		      | HR        | hr30@cybertekschool.com        | UserUser |