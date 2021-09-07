@NEXTBASE-372
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
	# *6. User should be able to restore default field,*
	# 7. User should be able to reset filters to default.
	@NEXTBASE-371
	Scenario Outline: Verify that as a user, I should be able to use 'Filter and search' functionality on Active Stream.
		User restores the fields
		       Given user lands on activity stream page with valid "<username>" and "<password>" as "<User>"
		       When User clicks filter and search box which stands below the quick navigate menu
		       And user clicks This month tab from dropdown list
		       And user validates This month is visible inside the Date field box
		       And user clicks Restore default fields button that located under the To: field
		       Then user validates that fields are restored
		       Examples:
		         | User      | username                      | password |
		         | HR        | hr30@cybertekschool.com        | UserUser |