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
import org.openqa.selenium.Keys;

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
        new LoginPage().loginAsA(userType);
    }

    @When("the user navigates to Poll tab")
    public void the_user_navigates_to_Poll_tab() {
        BrowserUtils.waitFor(1);
        new HomePage().pollTab.click();
    }

    @When("the user selects {string},{string} from contacts")
    public void the_user_clicks_on_Poll_tab_and_adds(String contact1, String contact2) {

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

    @When("the user adds {string} from link option")
    public void the_user_clicks_on_Poll_tab_and_adds_from_link_option(String expLink) {
        pollPage.link.click();
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-text")).sendKeys("Headset");
        Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-href")).sendKeys(expLink + Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @Then("the user should be able to add {string} as a link")
    public void the_user_should_be_able_to_add_as_a_link(String actLink) {
        Driver.get().switchTo().frame(0);
        String linkLocator = "//a[@href='"+ actLink +"']";
        boolean linkAssertion = Driver.get().findElement(By.xpath(linkLocator)).isEnabled();
        Assert.assertTrue(linkAssertion);
    }

    @When("the user clicks on add mention icon and mentions {string}")
    public void the_user_clicks_on_add_mention_icon_and_mentions(String mentionEmail) {
        pollPage.addMention.click();
        pollPage.empAndDeps.click();
        pollPage.addContact(mentionEmail);
    }

    @Then("the user should be able to add {string} as a mention")
    public void the_user_should_be_able_to_add_mention(String expText) {
        Driver.get().switchTo().frame(0);
        String actualText = Driver.get().findElement(By.xpath("//span[@class='bxhtmled-metion']")).getText();
        Assert.assertEquals(expText,actualText);
    }



}
