@NEXTBASE-361
Feature: 

	#US:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#AC:
	#
	#*1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.*
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-353
	Scenario: Verify that the user should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
		 HR User can create task
		    Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
		    When user click "Tasks" "All" under Activity stream
		    And user click NEW TASK button
		    And user enter following informations
		      | Action Type  | Create            |
		      | Things to do | Test.hr.v.1       |
		      | Description  | Testing this page |
		    And user click High Priority check box
		    And user enter deadline
		    And user Add mention
		    And  user click "ADD TASK" button
		    Then user should be able to add new task	

	#US:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#AC:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#*2. Marketing User can edit the task by declaring himself/herself as responsible person.*
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-354
	Scenario: Verify that the user should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
		 Marketing User can edit the task
		    Given user already logged in with "marketing1@cybertekschool.com" username "UserUser" password
		    When user click "Tasks" "All" under Activity stream
		    And user click created task
		    And user click EDIT
		    And user enter following informations
		      | Action Type  | MarketingEdit |
		      | Description | Testing          |
		    And user click "SAVE CHANGES" button
		    Then user should be able to edit the task	

	#US:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#AC:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#*3. HR User can edit the task for adding time tracking.*
	#*4. HR User can edit the task for adding reminder to e-mail.*
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#*9. HR User can add dependent tasks by editing the already created task.*
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-355
	Scenario: Verify that the user should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
		 Hr user can use edit functionality
		    Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
		    When user click "Tasks" "All" under Activity stream
		    And hr user click created task
		    And user click EDIT
		    And user change responsible person;
		    And user click More
		    And user add Time tracking
		    And user add reminder
		    And user add Dependent tasks
		    And user click "SAVE CHANGES" button
		    Then user can see edited following informations
		
		      | Reminder        | alper@cybertekschool.com |
		      | Estimate        | 02:30:00                 |
		      | Dependent tasks | Test             |
			

	#US:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#AC:
	#
	#1.HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#*6. HR User can add one more responsible person by editing created task.*
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-356
	Scenario: Verify that the user should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
		 HR User can add one more responsible person
		      Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
		      When user click "Tasks" "All" under Activity stream
		      And hr user click created task
		      And user click EDIT
		      And user click add more button;
		      Then user must add more responsible person	

	#US:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#AC:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#*7. Marketing User can add participants and observers to already created task by editing.*
	#*8. Marketing User can add checklist to an already created task by editing.*
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-357
	Scenario: Verify that the user should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
		Marketing User can add participants,observers,checklist
		    Given user already logged in with "marketing1@cybertekschool.com" username "UserUser" password
		    When user click "Tasks" "All" under Activity stream
		    And user click created task
		    And user click EDIT
		    And user enter following informations
		      | Action Type  | Add                          |
		      | Description | checklist tested             |
		      | Participants | hr1@cybertekschool.com       |
		      | Observers    | helpdesk1@cybertekschool.com |
		    And user click "SAVE CHANGES" button
		    Then user should be add informations	

	#US:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#AC:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#*10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.*
	#*11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.*
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the tas
	@NEXTBASE-358
	Scenario: Verify that the user should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
		 HR User can be redirected to "New task template" page
		    Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
		    When user click "Tasks" "All" under Activity stream
		    And user open New task module
		    And user click All templates
		    And user click ADD
		    And user must be on "New task template" page
		    And user click to High Priority check box
		    And user click to Add mention
		    And user enter following informations
		      | Action Type  | Template |
		      | Things to do | Test.h   |
		      | Description  | Test     |
		      | Deadline in  | 7335     |
		    And user click Options
		    And user click Responsible person can change deadline check box and Approve task when completed check box
		    And user click CREATE TEST TEMPLATE  button
		    Then user must be create new task template	

	#US:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#AC:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#*12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.*
	@NEXTBASE-359
	Scenario: Verify that the user should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
		HR User can delete task
		    Given user already logged in with "hr1@cybertekschool.com" username "UserUser" password
		    When user click "Tasks" "All" under Activity stream
		    And user click tasks check box
		    And user select Delete from SELECT ACTION menu
		    And user click APPLY
		    And user click CONTINUE
		    Then user should be able to delete task	

	#US:
	#
	#As a user, I should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
	#
	#AC:
	#
	#1. HR User can create a high priority task in duration of the certain deadline by mentioning about a user.
	#2. Marketing User can edit the task by declaring himself/herself as responsible person.
	#3. HR User can edit the task for adding time tracking.
	#4. HR User can edit the task for adding reminder to e-mail.
	#*5. Marketing User can create a subtask of the first acceptance criteria's task quickly by using plus button, adding tags.*
	#6. HR User can add one more responsible person by editing created task.
	#7. Marketing User can add participants and observers to already created task by editing.
	#8. Marketing User can add checklist to an already created task by editing.
	#9. HR User can add dependent tasks by editing the already created task.
	#10. HR User can be redirected to "New task template" page by clicking 'All templates' under "TASK TEMPLATES" menu on "New task" module.
	#11. HR User can create new task template for high priority task, for him/herself, by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
	#12. HR User can delete task by using "SELECT ACTION" dropdown menu after checking the task.
	@NEXTBASE-360
	Scenario: Verify that the user should be able to use "Tasks" functionality so that user can create, change, delete and track the tasks either on Activity Stream or Tasks page.
		 Marketing User can create a subtask
		    Given user already logged in with "marketing1@cybertekschool.com" username "UserUser" password
		    When user click plus icon
		    And user enter following informations
		      | Action Type  | Create   |
		      | Things to do | Test.m.v.1      |
		      | Description  | Subtask created |
		    And user click More
		    And user add subtask
		    And user add Tags
		    And  user click "ADD TASK" button
		    Then user should be ableto create subtask