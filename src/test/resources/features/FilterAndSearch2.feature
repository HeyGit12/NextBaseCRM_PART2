@NEXTBASE-368
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
	# *4. User should be able to search by selecting one or more Type,*
	# 5. User should be able to save filter.
	# 6. User should be able to restore default field,
	# 7. User should be able to reset filters to default.
	@NEXTBASE-367
	Scenario Outline: Verify that as a user, I should be able to use 'Filter and search' functionality on Active Stream.
		 User searches based on type
		     Given user lands on activity stream page with valid "<username>" and "<password>" as "<User>"
		    When User clicks filter and search box which stands below the quick navigate menu
		    And user clicks on Type field that located below the Date field
		    And user clicks Posts and Announcements tabs under inside the Type dropdown menu
		    And user validates Posts and Announcements are visible inside the Type box
		    And user clicks to the search button
		    Then user validates searched posts are existed
		
		     Examples:
		       | User      | username                      | password |
		       | HR        | hr30@cybertekschool.com        | UserUser |