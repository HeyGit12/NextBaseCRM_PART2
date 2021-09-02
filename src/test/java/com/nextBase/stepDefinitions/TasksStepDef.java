package com.nextBase.stepDefinitions;

import com.nextBase.pages.HomePage;
import com.nextBase.pages.TasksPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

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
            case "CreateSubTask":
                break;
            case "Add":
                break;
            case "Template":
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


    @When("user click More")
    public void user_click_More() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user add Time tracking")
    public void user_add_Time_tracking() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user add reminder")
    public void user_add_reminder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user add Dependent tasks")
    public void user_add_Dependent_tasks() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user can see edited following informations")
    public void user_can_see_edited_following_informations(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }


    @When("user click plus icon")
    public void user_click_plus_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user add subtask")
    public void user_add_subtask() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user add Tags")
    public void user_add_Tags() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be ableto create subtask")
    public void user_should_be_ableto_create_subtask() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("user should be add informations")
    public void user_should_be_add_informations() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user open New task module")
    public void user_open_New_task_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click All templates")
    public void user_click_All_templates() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click ADD")
    public void user_click_ADD() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user must be on {string} page")
    public void user_must_be_on_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click Options")
    public void user_click_Options() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click Responsible person can change deadline check box and Approve task when completed check box")
    public void user_click_Responsible_person_can_change_deadline_check_box_and_Approve_task_when_completed_check_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user must be create new task template")
    public void user_must_be_create_new_task_template() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click tasks check box")
    public void user_click_tasks_check_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user select Delete from SELECT ACTION menu")
    public void user_select_Delete_from_SELECT_ACTION_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click APPLY")
    public void user_click_APPLY() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click CONTINUE")
    public void user_click_CONTINUE() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to delete task")
    public void user_should_be_able_to_delete_task() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
