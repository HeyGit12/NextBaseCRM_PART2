package com.nextBase.stepDefinitions;

import com.nextBase.pages.CalendarPage;
import com.nextBase.pages.HomePage;
import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.util.Map;



public class CalendarStepDefs {
    String user = null;
    CalendarPage calendarPage = new CalendarPage();

    @Given("User logins with {string} credentials")
    public void user_logins_with_credentials(String userType) {
        user = userType.toLowerCase();
        new LoginPage().login(userType);
    }


    @Given("user clicks {string} menu")
    public void user_clicks_menu(String menu) {
        new HomePage().navigateToMenu(menu);
    }

    @When("user clicks add")
    public void user_clicks_add() {
        calendarPage.add.click();
    }

    @When("enter the below event details and click Save button")
    public void enter_the_below_event_details_and_click_Save_button(Map<String, String> data) {

        if (Boolean.parseBoolean(data.get("This event is important"))) {
            calendarPage.importance.click();
        }
        calendarPage.dateFrom.clear();
        calendarPage.dateFrom.sendKeys(data.get("Event date"));
        calendarPage.dateTo.clear();
        calendarPage.dateTo.sendKeys(data.get("Event end date"));

        calendarPage.timeZone.click();
        Select select = new Select(calendarPage.timeZoneFrom);
        select.selectByVisibleText(data.get("Time zone"));

        calendarPage.location.click();
        calendarPage.location.sendKeys(data.get("Location"));

        calendarPage.addAttendees(data.get("Attendees"));

        BrowserUtils.waitForPageToLoad(10);
        calendarPage.more.click();
        calendarPage.eventDescription(data.get("Description"));
        BrowserUtils.waitForPageToLoad(10);
        calendarPage.selectColor(data.get("Event color"));

        Select selectAvailability = new Select(calendarPage.availability);
        selectAvailability.selectByVisibleText(data.get("Availability"));

    }


    @Then("user should be able to add event by clicking SAVE button and display event on calendar")
    public void user_should_be_able_to_add_event_by_clicking_SAVE_button_and_display_event_on_calendar() {
        calendarPage.save.click();

        String actualTitle = Driver.get().getTitle();
        String expectedTitle = ConfigurationReader.get(user + "_username") + ": Calendar";
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user clicks event and selects edit")
    public void user_clicks_event_and_selects_edit() {

        calendarPage.eventDetails.click();
        calendarPage.eventDetails.click();
        calendarPage.editEvent.click();
    }

    @Then("user should be able to change event color as {string}")
    public void user_should_be_able_to_change_event_color_as(String color) {
        BrowserUtils.waitForPageToLoad(10);
        calendarPage.more.click();
        calendarPage.selectColor(color);
        calendarPage.save.click();
        BrowserUtils.waitForPageToLoad(5);
        String style = calendarPage.eventColor.getAttribute("style");
//        System.out.println(style);
        String colorCode = "rgb(0, 0, 128)";
        Assert.assertTrue(style.contains(colorCode));
    }

    @Then("user should be able to change privacy as {string}")
    public void user_should_be_able_to_change_privacy_as(String privacy) {
        BrowserUtils.waitForPageToLoad(10);
        calendarPage.more.click();
        if (!calendarPage.privateEvent.isSelected()) {
            calendarPage.privateEvent.click();
        }
        calendarPage.save.click();
        calendarPage.eventDetails.click();
        calendarPage.eventDetails.click();
        String text = calendarPage.specialNotes.getText();
        System.out.println(text);
        Assert.assertEquals(privacy, text);
    }

    @When("user clicks Schedule")
    public void user_clicks_Schedule() {
        calendarPage.schedule.click();
    }

    @Then("user should be able to change his-her availability as {string}")
    public void user_should_be_able_to_change_his_her_availability_as(String availability) {
        BrowserUtils.waitForPageToLoad(10);
        calendarPage.more.click();
        BrowserUtils.waitForVisibility(calendarPage.privateEvent, 5);
        Select selectAvailability = new Select(calendarPage.availability);
        selectAvailability.selectByVisibleText(availability);
        calendarPage.save.click();
    }

    @Then("user should be able to change his-her event's name as {string}")
    public void user_should_be_able_to_change_his_her_event_s_name_as(String string) {
        calendarPage.eventName.sendKeys(string);
        calendarPage.save.click();
    }
    @Then("user should be able to change repeat section as {string}")
    public void user_should_be_able_to_change_repeat_section_as(String string) throws AWTException {
        BrowserUtils.waitForPageToLoad(10);
        Select select = new Select(calendarPage.repeat);
        select.selectByVisibleText(string);
        calendarPage.save.click();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = ConfigurationReader.get(user + "_username") + ": Calendar";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
