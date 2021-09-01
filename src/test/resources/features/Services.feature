@NEXTBASE-309 @wip
Feature: 

	#*U.S:*
	#
	#As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
	#
	#*A.C:*
	#
	#*1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.*
	#*2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".*
	#*3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.*
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-304
	Scenario: Verify that as a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
		User can be redirected to "New Event" page for booking a meeting room
		    Given the user logged in as a "helpdesk"
		    When the user go to "Services" "Meeting Room Booking"
		    And the user click "Meeting Room Booking Calendar View"
		    And the user should be able to display "Event Calendar"
		    And the user click "East Meeting Room" to uncheck the checkbox
		    And the user click "Book meeting room"
		    Then the user should be able to display "New Event" page	

	#*U.S:*
	#
	#As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
	#
	#*A.C:*
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#*4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.*
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-305
	Scenario: Verify that as a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
		User can suggest new idea
		    Given the user logged in as a "marketing"
		    When the user go to "Services" "Ideas"
		    And the user click "New idea"
		    And the user enter title as "MY_TEST_IDEA"
		    And the user enter description as "MY_TEST_DESCRIPTION_OF_IDEA"
		    And the user select "Holidays" from category
		    Then the user should be able to suggest new idea	

	#*U.S:*
	#
	#As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
	#
	#A.C:
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#*5. Marketing User can dislike the idea.*
	#*6. Marketing User can like the idea.*
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-306
	Scenario Outline: Verify that as a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
		user can <icon> an idea
		    Given the user logged in as a "<user>"
		    When the user go to "<tab>" "<module>"
		    And the user can click "<icon>" icon
		    Then the user should be able to click "<sign>" icon
		
		
		    Examples:
		      | user      | tab      | module | icon   | sign  |
		      | marketing | Services | Ideas  | Like   | plus  |
		      | marketing | Services | Ideas  | Unlike | minus |	

	#*U.S:*
	#
	#As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
	#
	#*A.C:*
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#*7. Marketing User can sort the ideas by date added.*
	#*8. Marketing User can sort the ideas by rating.*
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-307
	Scenario Outline: Verify that as a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
		User can sort ideas by
		    Given the user logged in as a "<userType>"
		    When the user go to "<tab>" "<module>"
		    And the user can sort the ideas by "<sortType>"
		    Then the user should be able to sort ideas by "<sortType>"
		
		    Examples:
		      | userType  | tab      | module | sortType   |
		      | marketing | Services | Ideas  | rating     |
		      | marketing | Services | Ideas  | date added |	

	#*U.S:*
	#
	#As a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
	#
	#*A.C:*
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#*9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.*
	@NEXTBASE-308
	Scenario: Verify that as a user, I should be able to use "Services" functionality so that user can take advantage of company's services.
		User can print Lists
		      Given the user logged in as a "human resources"
		      When the user go to "Services" "Lists"
		      And the user should display lists area
		      And the user click "Print" link
		      Then the user should be able to print