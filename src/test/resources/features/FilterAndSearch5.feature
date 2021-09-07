@NEXTBASE-374
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
	# 5. User should be able to save filter.
	# 6. User should be able to restore default field,
	# *7. User should be able to reset filters to default.*
	@NEXTBASE-373
	Scenario Outline: Verify that as a user, I should be able to use 'Filter and search' functionality on Active Stream.
		 User resets the filters
		    Given user lands on activity stream page with valid "<username>" and "<password>" as "<User>"
		    When User clicks filter and search box which stands below the quick navigate menu
		    And user clicks the settings icon that located right bottom of grey filters area
		    And user validates that settings icons existed
		    And user clicks on the Announcements filter
		    And user clicks This month tab from dropdown list
		    And user validates This month is visible inside the Date field box
		    And user clicks on the save button that located at the bottom of the field's
		    And user clicks the settings icon that located right bottom of grey filters area
		    And user clicks on the Reset to default button that stands left next of settings icon
		    Then user validates that filters are reseted
		
		    Examples:
		      | User      | username                      | password |
		      | HR        | hr30@cybertekschool.com        | UserUser |