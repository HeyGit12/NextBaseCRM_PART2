package com.nextBase.stepDefinitions;

import com.nextBase.pages.HomePage;
import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarStepDefs {
    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login();
    }
    @Given("user clicks {string} menu")
    public void user_clicks_menu(String menu) {
        new HomePage().navigateToMenu(menu);
    }
    @When("user clicks {string} tab")
    public void user_clicks_tab(String tab) {
        new HomePage().navigateToTab(tab);
    }
    @Then("User should be able to display tasks {string}")
    public void user_should_be_able_to_display_tasks(String expected) {
        String actual = new HomePage().tasksContainer.getText();
        Assert.assertTrue(actual.contains(expected));

    }
}
