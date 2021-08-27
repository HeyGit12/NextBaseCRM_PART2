package com.nextBase.stepDefinitions;

import com.nextBase.pages.CalendarPage;
import com.nextBase.pages.HomePage;
import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class CalendarStepDefs {
    String user=null;
    @Given("User logins with {string} credentials")
    public void user_logins_with_credentials(String userType) {
        user=userType.toLowerCase();
        new LoginPage().login(userType);
    }


    @Given("user clicks {string} menu")
    public void user_clicks_menu(String menu) {
        new HomePage().navigateToMenu(menu);
    }

    @When("user clicks {string}")
    public void user_clicks(String string) {
        new CalendarPage().add.click();
    }

    @When("enter the below event details and click Save button")
    public void enter_the_below_event_details_and_click_Save_button(Map<String, String> data) {
        CalendarPage calendarPage = new CalendarPage();

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
        calendarPage.more.click();
        calendarPage.eventDescription(data.get("Description"));

        calendarPage.selectColor(data.get("Event color"));

        Select selectAvailability = new Select(calendarPage.availability);
        selectAvailability.selectByVisibleText(data.get("Availability"));

    }


    @Then("user should be able to add event by clicking SAVE button and display event on calendar")
    public void user_should_be_able_to_add_event_by_clicking_SAVE_button_and_display_event_on_calendar() {
        new CalendarPage().save.click();

        String actualTitle = Driver.get().getTitle();
        String expectedTitle=ConfigurationReader.get(user+"_username")+": Calendar";
        Assert.assertEquals(expectedTitle,actualTitle);
    }


}
