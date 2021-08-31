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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
        new HomePage().pollTab.click();
    }

    @When("the user enters {string} as a title")
    public void the_user_enters_as_a_title(String testText) {
        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(1);
        Driver.get().findElement(By.cssSelector("body")).sendKeys(testText);
        Driver.get().switchTo().defaultContent();
    }

    @When("the user selects {string},{string} from contacts")
    public void the_user_clicks_on_Poll_tab_and_adds(String contact1, String contact2) {
        pollPage.addMoreBttn.click();
        pollPage.empAndDeps.click();
        pollPage.addContact(contact1);
        pollPage.addContact(contact2);
        Driver.get().findElement(By.xpath("//span[@class='popup-window-close-icon']")).click();
    }

    @When("the user clicks send button")
    public void the_user_clicks_send_button() {
        pollPage.sendBttn.click();
        BrowserUtils.waitFor(3);
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
        Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-text")).sendKeys("Headset3");
        Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-href")).sendKeys(expLink + Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @Then("the user should be able to add {string} as a link")
    public void the_user_should_be_able_to_add_as_a_link(String expLink) {

        String linkLocator = "//a[@href='"+ expLink +"']";
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
    public void the_user_should_be_able_to_add_mention(String expMail) {

        String actMail = Driver.get().findElement(By.xpath("//a[.='"+ expMail +"' and @target='_blank']")).getText();
        Assert.assertEquals(expMail,actMail);
    }
    @When("the user adds questions and answers")
    public void the_user_adds_question_and_answers() {
        pollPage.addQuestion.click();
        Driver.get().findElement(By.xpath("//input[@placeholder='Answer  2']")).click();
    }

    @Then("the user should be able to add questions and answers")
    public void the_user_should_be_able_to_add_questions_and_answers() {
        WebElement addedQuestion = Driver.get().findElement(By.id("question_1"));
        WebElement addedAnswer = Driver.get().findElement(By.xpath("//input[@placeholder='Answer  3']"));

        Assert.assertTrue(addedAnswer.isEnabled());
        Assert.assertTrue(addedQuestion.isEnabled());
    }

    @When("the user deletes questions and answers")
    public void the_user_deletes_questions_and_answers() {
        WebElement addedQuestion = Driver.get().findElement(By.id("question_1"));
        WebElement addedAnswer = Driver.get().findElement(By.xpath("//input[@placeholder='Answer  3']"));

        BrowserUtils.hover(addedQuestion);
        Driver.get().findElement(By.xpath("//label[@for='question_1' and @title='Delete question']")).click();

        BrowserUtils.hover(addedAnswer);
        Driver.get().findElement(By.xpath("//label[@for='answer_0__2_' and @title='Delete answer']")).click();
    }

    @Then("the user should be able to delete questions and answers")
    public void the_user_should_be_able_to_delete_questions_and_answers() {
        boolean deletedQuestion = BrowserUtils.isElementPresent(By.id("question_1"));
        Assert.assertFalse(deletedQuestion);

        boolean deletedAnswer = BrowserUtils.isElementPresent(By.xpath("//label[@for='question_1' and @title='Delete question']"));
        Assert.assertFalse(deletedAnswer);
    }

    @When("the user add {string}, {string} and {string}")
    public void the_user_add_and(String q, String a1, String a2) {
        pollPage.question.sendKeys(q+ Keys.TAB + a1 +Keys.TAB +a2);
    }

    @When("the user clicks Allow multiple choice")
    public void the_user_clicks_Allow_multiple_choice() {
        Driver.get().findElement(By.id("multi_0")).click();
    }

    @Then("the user should be able to provide {string}, {string} and {string}")
    public void the_user_should_be_able_to_provide_and(String q, String a1, String a2) {
        Driver.get().findElement(By.xpath("//label[.='"+a1+"']")).click();
        Driver.get().findElement(By.xpath("//label[.='"+a2+"']")).click();

        boolean answer_1IsSelected = Driver.get().findElement(By.xpath("//label[.='"+a1+"']/..//input")).isSelected();
        boolean answer_2IsSelected = Driver.get().findElement(By.xpath("//label[.='"+a2+"']/..//input")).isSelected();
        boolean multiChoiceCheck = answer_1IsSelected && answer_2IsSelected;

        Assert.assertTrue(multiChoiceCheck);
    }


}
