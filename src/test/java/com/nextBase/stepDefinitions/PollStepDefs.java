package com.nextBase.stepDefinitions;

import com.nextBase.pages.HomePage;
import com.nextBase.pages.LoginPage;
import com.nextBase.pages.PollPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Map;

public class PollStepDefs {
    PollPage pollPage = new PollPage();
    @Given("The user is on log in page")
    public void the_user_is_on_log_in_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user logins as a {string}")
    public void the_user_logins_as_a(String userType) {
        String username = null;
        String password = null;

        if (userType.equals("Helpdesk")) {
            username = ConfigurationReader.get("helpdesk_username");
            password = ConfigurationReader.get("helpdesk_password");
        } else if (userType.equals("Human Resources")) {
            username = ConfigurationReader.get("human_resources_username");
            password = ConfigurationReader.get("human_resources_password");
        } else if (userType.equals("Marketing")) {
            username = ConfigurationReader.get("marketing_username");
            password = ConfigurationReader.get("marketing_password");
        }
    }

    @When("the user clicks on Poll tab and adds {string},{string}")
    public void the_user_clicks_on_Poll_tab_and_adds(String contact1, String contact2) {
        BrowserUtils.waitFor(1);
        new HomePage().pollTab.click();
        pollPage.addMoreBttn.click();
        pollPage.empAndDeps.click();
        pollPage.addContact(contact1);
        pollPage.addContact(contact2);
    }

    @Then("the user should be able to add {string},{string}")
    public void the_user_should_be_able_to_add(String contact1, String contact2) {
        boolean assertion1 = pollPage.checkIfAdded(contact1);
        boolean assertion2 = pollPage.checkIfAdded(contact2);
        Assert.assertTrue(assertion1);
        Assert.assertTrue(assertion2);
    }



}
