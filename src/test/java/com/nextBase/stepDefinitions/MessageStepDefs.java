package com.nextBase.stepDefinitions;

import com.nextBase.pages.HomePage;
import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.BrowserUtils;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class MessageStepDefs {

    @Given("the user is on the homepage with valid {string} and {string} as {string}")
    public void the_user_is_on_the_homepage_with_valid_and_as(String username, String password, String user) {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

        HomePage homePage = new HomePage();
        String expectedName = username;
        String actualName = homePage.profilName.getText();
        Assert.assertEquals(expectedName,actualName);

    }

    @When("the user clicks on the Send message box under the MESSAGE feature")
    public void the_user_clicks_on_the_Send_message_box_under_the_MESSAGE_feature() {
        HomePage homePage = new HomePage();
        homePage.messageBox.click();
        Assert.assertTrue(homePage.messageBox.isEnabled());
    }

    @When("the user types {string} in the message typing box")
    public void the_user_types_in_the_message_typing_box(String message) {
        BrowserUtils.waitFor(1);
        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(1);

        Driver.get().findElement(By.cssSelector("body[contenteditable='true']")).clear();
        Driver.get().findElement(By.cssSelector("body[contenteditable='true']")).sendKeys(message);

        String actualMessage = Driver.get().findElement(By.cssSelector("body[contenteditable='true']")).getText();
        String expectedMessage = message;
        Assert.assertEquals(expectedMessage,actualMessage);

        Driver.get().switchTo().defaultContent();
        BrowserUtils.waitFor(1);
    }
    @When("the user clicks on upload files icon at the bottom left of the message typing box")
    public void the_user_clicks_on_upload_files_icon_at_the_bottom_left_of_the_message_typing_box() {

        HomePage homePage = new HomePage();
        homePage.fileUpload.click();
        BrowserUtils.waitFor(1);
        Assert.assertTrue(homePage.fileUpload.isEnabled());

    }

    @When("the user clicks on Add more icon which located in the to box")
    public void the_user_clicks_on_Add_more_icon_which_located_in_the_to_box() {

        HomePage homePage = new HomePage();
        homePage.addMore.click();
        BrowserUtils.waitFor(1);
        Assert.assertTrue(homePage.addMore.isEnabled());

    }

    @When("the user clicks on All employees icon then clicks on Employees and departments icon from opening popup")
    public void the_user_clicks_on_All_employees_icon_then_clicks_on_Employees_and_departments_icon_from_opening_popup() {

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.allEmployees.isEnabled());
        Assert.assertTrue(homePage.employeesDepartment.isEnabled());
        homePage.allEmployees.click();
        BrowserUtils.waitFor(1);
        homePage.employeesDepartment.click();
        BrowserUtils.waitFor(1);

    }

    @When("the user choose {string} and {string} by clicking on employees from opening list")
    public void the_user_choose_and_by_clicking_on_employees_from_opening_list(String employee1, String employee2) {
        HomePage homePage = new HomePage();
        homePage.marketing.click();
        homePage.helpDesk.click();
        Assert.assertTrue(homePage.toBox.getText().contains(employee1));
        Assert.assertTrue(homePage.toBox.getText().contains(employee2));
        BrowserUtils.waitFor(1);
    }

    @When("the user clicks on link icon and adds {string} and {string} to the boxes and clicks save icon")
    public void the_user_clicks_on_link_icon_and_adds_and_to_the_boxes_and_clicks_save_icon(String linkInfo, String textinfo) {

        HomePage homePage = new HomePage();
        homePage.linkIcon.click();
        homePage.link.sendKeys(linkInfo);
        homePage.text.sendKeys(textinfo);
        BrowserUtils.waitFor(1);
        homePage.linkSave.click();


        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(1);
        String actualLinkText =Driver.get().findElement(By.cssSelector("body[contenteditable='true']")).getText();
        Assert.assertTrue(actualLinkText.contains(textinfo));

        Driver.get().switchTo().defaultContent();
        BrowserUtils.waitFor(1);

    }

    @When("the user clicks on Add mention icon at the bottom of the message typing box")
    public void the_user_clicks_on_Add_mention_icon_at_the_bottom_of_the_message_typing_box() {

        HomePage homePage = new HomePage();
        homePage.mention.click();
        Assert.assertTrue(homePage.mention.isEnabled());
        BrowserUtils.waitFor(1);
    }

    @When("the user clicks on Employees and departments icon form opening popup and choose {string} by clicking on")
    public void the_user_clicks_on_Employees_and_departments_icon_form_opening_popup_and_choose_by_clicking_on(String employee1) {

        HomePage homePage = new HomePage();
        homePage.employeesDepartment.click();
        homePage.marketing.click();

        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(1);
        Assert.assertTrue(Driver.get().findElement(By.cssSelector("body[contenteditable='true']")).getText().contains(employee1));
        Driver.get().switchTo().defaultContent();
        BrowserUtils.waitFor(1);

    }


    @When("the user creates a Quote by clicking on the Quote icon at the bottom of the message typing box")
    public void the_user_creates_a_Quote_by_clicking_on_the_Quote_icon_at_the_bottom_of_the_message_typing_box() {
        HomePage homePage = new HomePage();
        homePage.quoteIcon.click();

        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(1);
        Assert.assertTrue(Driver.get().findElement(By.cssSelector("blockquote[class='bxhtmled-quote']")).isEnabled());

        Driver.get().switchTo().defaultContent();
        BrowserUtils.waitFor(1);

    }

    @When("the user clicks on send icon at the bottom lef of the general message box")
    public void the_user_clicks_on_send_icon_at_the_bottom_lef_of_the_general_message_box() {

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.send.isEnabled());
        BrowserUtils.waitFor(1);
        homePage.send.click();


    }

    @Then("the user should see forwarded message under Activity Stream title with visible sender as {string}")
    public void the_user_should_see_forwarded_message_under_Activity_Stream_title_with_visible_sender_as(String username) {

        HomePage homePage = new HomePage();
        BrowserUtils.waitFor(5);
       Assert.assertTrue(homePage.sender.getText().contains(username));
        homePage.more.click();
        BrowserUtils.waitFor(1);
        homePage.delete.click();
        BrowserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
        BrowserUtils.waitFor(1);
    }

    @When("the user click on Insert video icon at the bottom of the message typing box")
    public void the_user_click_on_Insert_video_icon_at_the_bottom_of_the_message_typing_box() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.videoInsertIcon.isEnabled());
        homePage.videoInsertIcon.click();
        BrowserUtils.waitFor(1);

    }


    @When("the user puts in video link from {string} in the opening Video source box")
    public void the_user_puts_in_video_link_from_in_the_opening_Video_source_box(String videoUrl) {

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.videoUrlBox.isEnabled());
        homePage.videoUrlBox.sendKeys(videoUrl);
        BrowserUtils.waitFor(8);


    }

    @Then("the user should not see any error message like {string}")
    public void the_user_should_not_see_any_error_message_like(String errorMessage) {
        HomePage homePage = new HomePage();
        String expectedMessage = errorMessage;
        String actualMessage = homePage.videoError.getText();
        Assert.assertFalse(actualMessage.contains(expectedMessage));
        homePage.urlSaveIcon.click();

    }


}
