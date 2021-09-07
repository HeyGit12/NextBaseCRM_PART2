@vip
Feature: Filter and search


  Scenario Outline: User validates filters and searches based on date
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


   Scenario Outline: User searches based on type
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


   Scenario Outline: User creates new filter
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


     Scenario Outline: User restores the fields
       Given user lands on activity stream page with valid "<username>" and "<password>" as "<User>"
       When User clicks filter and search box which stands below the quick navigate menu
       And user clicks This month tab from dropdown list
       And user validates This month is visible inside the Date field box
       And user clicks Restore default fields button that located under the To: field
       Then user validates that fields are restored
       Examples:
         | User      | username                      | password |
         | HR        | hr30@cybertekschool.com        | UserUser |


  Scenario Outline:  User resets the filters
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

