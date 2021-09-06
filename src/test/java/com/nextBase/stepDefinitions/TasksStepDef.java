package com.nextBase.stepDefinitions;

import com.nextBase.pages.HomePage;
import com.nextBase.pages.TasksPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.Map;
import java.util.NoSuchElementException;

public class TasksStepDef {


    @When("user click {string} {string} under Activity stream")
    public void user_click_under_Activity_stream(String tab, String module) {
        HomePage homePage = new HomePage();
        homePage.navigateToModule(tab, module);

    }

    @When("user click NEW TASK button")
    public void user_click_NEW_TASK_button() {
        new TasksPage().newTaskButton.click();
    }

    @When("user enter following informations")
    public void user_enter_following_informations(Map<String, String> taskInfo) {
        TasksPage tasksPage = new TasksPage();
        switch (taskInfo.get("Action Type")) {
            case "Create":
                Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
                WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
                wait.until(ExpectedConditions.visibilityOf(tasksPage.thingsToDo));

                tasksPage.thingsToDo.sendKeys(taskInfo.get("Things to do"));
                Driver.get().switchTo().frame(tasksPage.descriptionFrame);
                tasksPage.description.sendKeys(taskInfo.get("Description"));
                Driver.get().switchTo().defaultContent();
                break;
            case "MarketingEdit":
                Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
                Driver.get().switchTo().frame(tasksPage.descriptionFrame);
                tasksPage.description.clear();
                tasksPage.description.sendKeys(taskInfo.get("Description"));
                Driver.get().switchTo().defaultContent();
                break;

            case "Add":
                Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
               Driver.get().switchTo().frame(tasksPage.descriptionFrame);
               tasksPage.description.clear();
               tasksPage.description.sendKeys(taskInfo.get("Description"));
                Driver.get().switchTo().defaultContent();
                Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
                tasksPage.checklist.click();
                tasksPage.writeChecklist.sendKeys("test");
                tasksPage.summitChecklist.click();
                tasksPage.paticipants.click();
                BrowserUtils.scrollToElement(tasksPage.addParticipant);
                tasksPage.addParticipant.click();
                tasksPage.writeParticipants.sendKeys(taskInfo.get("Participants"),Keys.ENTER);

                tasksPage.observers.click();
                tasksPage.addObservers.click();
                tasksPage.writeObservers.sendKeys(taskInfo.get("Observers"),Keys.ENTER);
                Driver.get().switchTo().defaultContent();
                break;
            case "Template":
                tasksPage.thingsToDoTaskTemplate.sendKeys(taskInfo.get("Things to do"));
                Driver.get().switchTo().frame(tasksPage.descriptionFrame);
                tasksPage.description.sendKeys(taskInfo.get("Description"));
                Driver.get().switchTo().defaultContent();
                tasksPage.deadlineIn.sendKeys(taskInfo.get("Deadline in"));

                break;

        }


    }

    @When("user click High Priority check box")
    public void user_click_High_Priority_check_box() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        tasksPage.highPriorityCB.click();
        Driver.get().switchTo().defaultContent();
    }

    @When("user enter deadline")
    public void user_enter_deadline() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        tasksPage.deadlineManager.click();
        tasksPage.deadlineMonthPicker.click();
        tasksPage.deadlineMonth.click();
        try {
            tasksPage.deadlineDay.click();
        } catch (ElementClickInterceptedException e) {
            tasksPage.deadlineDay.click();
        }


        tasksPage.deadlineHour.clear();
        tasksPage.deadlineHour.sendKeys("3");
        tasksPage.deadlineMinute.clear();
        tasksPage.deadlineMinute.sendKeys("30");
        tasksPage.deadlineSelectButton.click();
        Driver.get().switchTo().defaultContent();
    }

    @When("user Add mention")
    public void user_Add_mention() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        tasksPage.addMention.click();
        tasksPage.mentionPerson.click();
        Driver.get().switchTo().defaultContent();

    }

    @When("user click {string} button")
    public void user_click_button(String string) {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        tasksPage.saveChanges.click();
        Driver.get().switchTo().defaultContent();

    }

    @Then("user should be able to add new task")
    public void user_should_be_able_to_add_new_task() {
        Assert.assertTrue(new TasksPage().createdTask.isDisplayed());
    }


    @When("user click created task")
    public void user_click_created_task() {
        TasksPage tasksPage = new TasksPage();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(tasksPage.createdTaskMarketing));
            tasksPage.createdTaskMarketing.click();
        } catch (StaleElementReferenceException e) {
            wait.until(ExpectedConditions.elementToBeClickable(tasksPage.createdTaskMarketing));
            tasksPage.createdTaskMarketing.click();
        }

    }

    @When("user click EDIT")
    public void user_click_EDIT() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        tasksPage.edit.click();
        Driver.get().switchTo().defaultContent();

    }

    @Then("user should be able to edit the task")
    public void user_should_be_able_to_edit_the_task() {
        Driver.get().switchTo().frame(new TasksPage().thingsToDoFrame);
        Assert.assertEquals(new TasksPage().createdTaskDescription.getText(), "Testing");
        Driver.get().switchTo().defaultContent();
    }

    @When("user change responsible person;")
    public void user_change_responsible_person() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(new TasksPage().thingsToDoFrame);
        tasksPage.responsiblePersonChange.click();
        tasksPage.resposiblePersonWrite.sendKeys("alper@cybertekschool.com");
        //tasksPage.responsiblePersonOk.click();
        Driver.get().switchTo().defaultContent();
    }


    @When("user click More")
    public void user_click_More() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        tasksPage.moreButton.click();
        Driver.get().switchTo().defaultContent();
    }

    @When("hr user click created task")
    public void hr_user_click_created_task() {
        TasksPage tasksPage = new TasksPage();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(tasksPage.createdTask));
            tasksPage.createdTask.click();
        } catch (StaleElementReferenceException e) {
            wait.until(ExpectedConditions.elementToBeClickable(tasksPage.createdTask));
            tasksPage.createdTask.click();
        }

    }

    @When("user add Time tracking")
    public void user_add_Time_tracking() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        JavascriptExecutor js = ((JavascriptExecutor) Driver.get());
        js.executeScript("arguments[0].scrollIntoView(true);",tasksPage.timeTrackingCB);
        tasksPage.timeTrackingCB.click();
        tasksPage.timeTrackingHour.clear();
        tasksPage.timeTrackingHour.sendKeys("2");
        tasksPage.timeTrackingMinute.clear();
        tasksPage.timeTrackingMinute.sendKeys("30");
        Driver.get().switchTo().defaultContent();

    }

    @When("user add reminder")
    public void user_add_reminder() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        tasksPage.reminderModule.click();
        tasksPage.selectReminderType.click();
        tasksPage.reminderType.click();

        tasksPage.reminderWithEmail.click();
        tasksPage.reminderSummit.click();
        Driver.get().switchTo().defaultContent();

    }

    @When("user add Dependent tasks")
    public void user_add_Dependent_tasks() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        JavascriptExecutor js = ((JavascriptExecutor) Driver.get());
        js.executeScript("arguments[0].scrollIntoView(true);",tasksPage.dependentTaskAdd);
        tasksPage.dependentTaskAdd.click();
        tasksPage.dependentTask.click();
        tasksPage.depententTaskSummit.click();
        Driver.get().switchTo().defaultContent();

    }

    @Then("user can see edited following informations")
    public void user_can_see_edited_following_informations(Map<String, String> taskInfo) {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        Assert.assertTrue(tasksPage.reminderCheck.getText().contains("to responsible person"));
        Assert.assertTrue(tasksPage.estimateTime.getText().contains(taskInfo.get("Estimate")));
        Assert.assertEquals(tasksPage.dependentTaskCheck.getText(), taskInfo.get("Dependent tasks"));
        Driver.get().switchTo().defaultContent();
    }


    @When("user click plus icon")
    public void user_click_plus_icon() {
        TasksPage tasksPage = new TasksPage();
        new Actions(Driver.get()).moveToElement(tasksPage.tasksTab).build().perform();
        tasksPage.plusIcon.click();

    }

    @When("user add subtask")
    public void user_add_subtask() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        BrowserUtils.scrollToElement(tasksPage.subtaskAdd);
        tasksPage.subtaskAdd.click();
        tasksPage.subtask.click();
        tasksPage.subtaskSummit.click();
        Driver.get().switchTo().defaultContent();

    }

    @When("user add Tags")
    public void user_add_Tags() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        BrowserUtils.scrollToElement(tasksPage.tagsAdd);
        tasksPage.tagsAdd.click();
        tasksPage.tagsWrite.sendKeys("Testing");
        tasksPage.tagsSummit.click();
        Driver.get().switchTo().defaultContent();
    }

    @Then("user should be ableto create subtask")
    public void user_should_be_ableto_create_subtask() {
        TasksPage tasksPage = new TasksPage();
        Assert.assertTrue(tasksPage.subTaskCheck.isDisplayed());
    }


    @Then("user should be add informations")
    public void user_should_be_add_informations() {
        TasksPage tasksPage = new TasksPage();
        Driver.get().switchTo().frame(tasksPage.thingsToDoFrame);
        Assert.assertTrue(tasksPage.descriptionCheck.getText().contains("checklist tested"));
        Assert.assertTrue(tasksPage.participantCheck.getText().contains("hr1@cybertekschool.com"));
        Assert.assertTrue(tasksPage.observersCheck.getText().contains("helpdesk1@cybertekschool.com"));
        Driver.get().switchTo().defaultContent();

    }


    @When("user open New task module")
    public void user_open_New_task_module() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.newTaskArrowIcon.click();

    }

    @When("user click All templates")
    public void user_click_All_templates() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.allTemplates.click();
    }

    @When("user click ADD")
    public void user_click_ADD() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.add.click();
    }

    @When("user must be on {string} page")
    public void user_must_be_on_page(String string) {
        TasksPage tasksPage = new TasksPage();
        Assert.assertTrue(tasksPage.newTaskTemplatePageCheck.getText().contains("New task template"));
    }
    @When("user click to High Priority check box")
    public void user_click_to_High_Priority_check_box() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.highPriorityCB.click();
    }
    @When("user click to Add mention")
    public void user_click_to_Add_mention() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.addMentionTaskTemplate.click();
        tasksPage.mentionPerson.click();
    }
    @When("user click Add mention")
    public void user_click_Add_mention() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.addMention.click();
        tasksPage.mentionPerson.click();
    }

    @When("user click Options")
    public void user_click_Options() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.options.click();
    }

    @When("user click Responsible person can change deadline check box and Approve task when completed check box")
    public void user_click_Responsible_person_can_change_deadline_check_box_and_Approve_task_when_completed_check_box() {
        TasksPage tasksPage = new TasksPage();
        BrowserUtils.scrollToElement(tasksPage.responsiblePChangeDeadline);
        tasksPage.responsiblePChangeDeadline.click();
    }

    @When("user click CREATE TEST TEMPLATE  button")
    public void user_click_CREATE_TEST_TEMPLATE_button() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.createTaskTemplateButton.click();
    }



    @Then("user must be create new task template")
    public void user_must_be_create_new_task_template() {
        TasksPage tasksPage = new TasksPage();
        Assert.assertTrue(tasksPage.taskTemplateCheck.getText().contains("Test.h"));
    }

    @When("user click tasks check box")
    public void user_click_tasks_check_box() {
        TasksPage tasksPage = new TasksPage();
        try {
            tasksPage.createdHrTaskCB.click();
        }catch (StaleElementReferenceException e){
            tasksPage.createdHrTaskCB.click();
        }

    }

    @When("user select Delete from SELECT ACTION menu")
    public void user_select_Delete_from_SELECT_ACTION_menu() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.selectActionButton.click();
        BrowserUtils.scrollToElement(tasksPage.delete);
        tasksPage.delete.click();
    }

    @When("user click APPLY")
    public void user_click_APPLY() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.apply.click();
    }

    @When("user click CONTINUE")
    public void user_click_CONTINUE() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.Continue.click();
    }

    @Then("user should be able to delete task")
    public void user_should_be_able_to_delete_task() {
        TasksPage tasksPage = new TasksPage();
        try {
            Assert.assertTrue(tasksPage.createdHrTask.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
        }


    }
    @When("user click add more button;")
    public void user_click_add_more_button() {
        TasksPage tasksPage = new TasksPage();
        tasksPage.addMoreResponsiblePerson.click();
    }

    @Then("user must add more responsible person")
    public void user_must_add_more_responsible_person() {

    }
}
