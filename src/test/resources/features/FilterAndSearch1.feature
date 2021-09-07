@NEXTBASE-366
Feature: 

	#*US*
	#
	#As a user, I should be able to use 'Filter and search' functionality on Active Stream.
	#
	#*AC*
	#
	#*1. User should be able to see default filters as "my activity, work, favourite, annoucements, and workflows"*
	# *2. User should be able to add and remove field.*
	# *3. User should be able to search by selecting Date,*
	# 4. User should be able to search by selecting one or more Type,
	# 5. User should be able to save filter.
	# 6. User should be able to restore default field,
	# 7. User should be able to reset filters to default.
	@NEXTBASE-365
	Scenario Outline: Verify that as a user, I should be able to use 'Filter and search' functionality on Active Stream.
		User validates filters and searches based on date
		    Given user lands on activity stream page with valid "<username>" and "<password>" as "<User>"
		    When User clicks filter and search box which stands below the quick navigate menu
		    And user validates default filters as "MY ACTIVITY, WORK, FAVORITES, ANNOUNCEMENTS, WORKFLOWS"
		    And user clicks Add field button which located above the Search button and below the To: dropdown menu.
		    And user sees opened check boxes located under the add Add field button
		    And user clicks Favorites checkbox.
		    And user sees Favorites dropdown menu existed under the To: dropdown menu
		    And user clicks Favorites checkbox.
		    And user validates Favorites field is not available in the fields section
		    And user clicks on Tag field that located above the Type field
		    And user clicks This month tab from dropdown list
		    And user validates This month is visible inside the Date field box
		    And user clicks to the search button
		    Then user validates searched posts are existed
		
		    Examples:
		      | User      | username                      | password |
		      | HR        | hr30@cybertekschool.com        | UserUser |