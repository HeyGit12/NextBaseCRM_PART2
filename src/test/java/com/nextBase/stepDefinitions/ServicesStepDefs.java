package com.nextBase.stepDefinitions;

import com.nextBase.pages.*;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ServicesStepDefs {

    @Given("the user logged in as a {string}")
    public void the_user_logged_in_as_a(String userType) {

        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;
        String password = null;

        switch (userType){

            case "helpdesk":
                username = ConfigurationReader.get("hd_username");
                password = ConfigurationReader.get("hd_password");
                break;

            case "human resources":
                username = ConfigurationReader.get("hr_username");
                password = ConfigurationReader.get("hr_password");
                break;

            case "marketing":
                username = ConfigurationReader.get("marketing_username");
                password = ConfigurationReader.get("marketing_password");
                break;

        }

        new LoginPage().login(username,password);

    }

    @When("the user go to {string} {string}")
    public void the_user_go_to(String tab, String module) {
        new HomePage().navigateToModule(tab,module);
    }



    @When("the user click {string}")
    public void the_user_click(String text) {
        new MeetingRoomsPage().goByText(text);
    }

    @When("the user should be able to display {string}")
    public void the_user_should_be_able_to_display(String string) {
        BrowserUtils.waitForVisibility(new MeetingRoomBookingPage().eventCalendar,5);
        Assert.assertTrue(new MeetingRoomBookingPage().eventCalendar.isDisplayed());
    }

    @When("the user click {string} to uncheck the checkbox")
    public void the_user_click_to_uncheck_the_checkbox(String string) {
        MeetingRoomBookingPage meetingRoomBooking = new MeetingRoomBookingPage();
        try {
            meetingRoomBooking.eastMeetingRoomCheckBoxOn.click();
            Assert.assertTrue(meetingRoomBooking.getEastMeetingRoomCheckBoxOff.isDisplayed());
        }catch (Exception e){
            meetingRoomBooking.getEastMeetingRoomCheckBoxOff.click();
            meetingRoomBooking.eastMeetingRoomCheckBoxOn.click();
            Assert.assertTrue(meetingRoomBooking.getEastMeetingRoomCheckBoxOff.isDisplayed());
        }
    }

    @Then("the user should be able to display {string} page")
    public void the_user_should_be_able_to_display_page(String page) {
        Assert.assertTrue(new MeetingRoomBookingPage().pageSubtitle.isDisplayed());
    }




    @When("the user enter title as {string}")
    public void the_user_enter_title_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enter description as {string}")
    public void the_user_enter_description_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user select {string} from category")
    public void the_user_select_from_category(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Then("the user should be able to suggest new idea")
    public void the_user_should_be_able_to_suggest_new_idea() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user can click {string} icon")
    public void the_user_can_click_icon(String string) {

        new AllIdeasPage().likeOrUnlike(string).click();


    }

    @Then("the user should be able to click {string} icon")
    public void the_user_should_be_able_to_click_icon(String icon) {
        Assert.assertTrue(new AllIdeasPage().afterClickingIcon(icon).isDisplayed());
    }

    @When("the user can sort the ideas by {string}")
    public void the_user_can_sort_the_ideas_by(String sortingType) {
        AllIdeasPage allIdeasPage = new AllIdeasPage();
        allIdeasPage.sortByType(sortingType);
    }

    @Then("the user should be able to sort ideas")
    public void the_user_should_be_able_to_sort_ideas() {
        System.out.println(BrowserUtils.getElementsText(new AllIdeasPage().sortedByDate));
    }


}
