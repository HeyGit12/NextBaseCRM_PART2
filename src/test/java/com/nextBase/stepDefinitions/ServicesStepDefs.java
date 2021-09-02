package com.nextBase.stepDefinitions;

import com.nextBase.pages.*;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ServicesStepDefs {

    @Given("the user logged in as a {string}")
    public void the_user_logged_in_as_a(String userType) {

        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;
        String password = null;

        switch (userType) {

            case "helpdesk":
                username = ConfigurationReader.get("helpdesk_username");
                password = ConfigurationReader.get("helpdesk_password");
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

        new LoginPage().login(username, password);

    }

    @When("the user go to {string} {string}")
    public void the_user_go_to(String tab, String module) {
        new HomePage().navigateToModule(tab, module);
    }


    @When("the user click {string}")
    public void the_user_click(String text) {
        new MeetingRoomBookingPage().goByText(text);
    }

    @When("the user should be able to display {string}")
    public void the_user_should_be_able_to_display(String string) {
        BrowserUtils.waitForVisibility(new MeetingRoomBookingPage().eventCalendar, 5);
        Assert.assertTrue(new MeetingRoomBookingPage().eventCalendar.isDisplayed());
    }

    @When("the user click {string} to uncheck the checkbox")
    public void the_user_click_to_uncheck_the_checkbox(String checkBoxText) {
        MeetingRoomBookingPage meetingRoomBooking = new MeetingRoomBookingPage();
        try {
            meetingRoomBooking.checkBoxOn(checkBoxText).click();
            Assert.assertTrue(meetingRoomBooking.checkBoxOff(checkBoxText).isDisplayed());
        } catch (Exception e) {
            meetingRoomBooking.checkBoxOff(checkBoxText).click();
            meetingRoomBooking.checkBoxOn(checkBoxText).click();
            Assert.assertTrue(meetingRoomBooking.checkBoxOff(checkBoxText).isDisplayed());
        }
    }

    @Then("the user should be able to display {string} page")
    public void the_user_should_be_able_to_display_page(String page) {
        Assert.assertEquals(page, new MeetingRoomBookingPage().pageSubtitle.getText());
    }


    @When("the user enter title as {string}")
    public void the_user_enter_title_as(String title) {
        new SuggestNewIdeaPage().titleInput.sendKeys(title);
    }

    @When("the user enter description as {string}")
    public void the_user_enter_description_as(String description) {
        SuggestNewIdeaPage suggestNewIdeaPage = new SuggestNewIdeaPage();
        Driver.get().switchTo().frame(suggestNewIdeaPage.descpriptionFrame);
        suggestNewIdeaPage.descriptionInput.sendKeys(description);
        Driver.get().switchTo().defaultContent();
    }

    @When("the user select {string} from category")
    public void the_user_select_from_category(String option) {
        new Select(new SuggestNewIdeaPage().selectCategory).selectByVisibleText(option);
    }


    @Then("the user should be able to suggest new idea")
    public void the_user_should_be_able_to_suggest_new_idea() {
        SuggestNewIdeaPage suggestNewIdeaPage = new SuggestNewIdeaPage();
        suggestNewIdeaPage.suggestNewIdeaBtn.click();
        Assert.assertTrue(suggestNewIdeaPage.newSuggestionMessage.isDisplayed());
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


    @Then("the user should be able to sort ideas by {string}")
    public void the_user_should_be_able_to_sort_ideas_by(String sortingType) throws ParseException {
        AllIdeasPage allIdeasPage = new AllIdeasPage();

        switch (sortingType) {

            case "date added":
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                List<Date> date = new ArrayList<>();

                for (String s : allIdeasPage.dateAdded()) {
                    date.add(sdf.parse(s));
                }

                for (int i = 0; i < date.size() - 1; i++) {
                    Assert.assertTrue(date.get(i).after(date.get(i + 1)) || date.get(i).equals(date.get(i + 1)));
                }
                break;

            case "rating":
                for (int i = 0; i < allIdeasPage.compareTheRating().size() - 1; i++) {
                    Assert.assertTrue(allIdeasPage.compareTheRating().get(i) >= allIdeasPage.compareTheRating().get(i + 1));
                }
                break;
        }
    }

    @When("the user should display lists area")
    public void the_user_should_display_lists_area() {
        Assert.assertTrue(new ListsPage().listsWorkArea.isDisplayed());
    }

    @When("the user click {string} link")
    public void the_user_click_link(String linkText) {
        new ListsPage().goByLinkText(linkText);
    }

    @Then("the user should be able to print")
    public void the_user_should_be_able_print_to_print() {
        Set<String> windowHandles = Driver.get().getWindowHandles();
        Assert.assertTrue(windowHandles.size() > 1);
    }

}
