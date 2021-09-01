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
import org.openqa.selenium.By;

public class announcementStepDefs {


    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        Driver.get().get(ConfigurationReader.get("url"));

        String username =null;
        String password =null;

        if(userType.equals("Helpdesk")){
            username = ConfigurationReader.get("helpdesk_username");
            password = ConfigurationReader.get("helpdesk_password");
        }else if(userType.equals("Human Resource")){
            username = ConfigurationReader.get("human_resources_username");
            password = ConfigurationReader.get("human_resources_password");
        }else if(userType.equals("Marketing")){
            username = ConfigurationReader.get("marketing_username");
            password = ConfigurationReader.get("marketing_password");
        }

        new LoginPage().loginAs(userType);

    }

    @When("the user opens Announcement panel")
    public void the_user_opens_Announcement_panel() {

        new HomePage().moreBtn.click();
        new HomePage().announcementBtn.click();


    }

    @When("the user uploads a file from localdisk")
    public void the_user_uploads_a_file_from_localdisk() {

        new HomePage().uploadBtn.click();


        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/textfile.txt";
        String fullPath = projectPath+"/"+filePath;
        new HomePage().uploadBtn2.sendKeys(fullPath);




    }

    @Then("the user should be able to see file and picture are uploaded")
    public void the_user_should_be_able_to_see_file_and_picture_are_uploaded() {

        String textName = new HomePage().uploadedFilesPanel.getText();
        String fileName = "textfile.txt";
        Assert.assertEquals(fileName,fileName);


    }

    @When("the user adds multiple users by selecting")
    public void the_user_adds_multiple_users_by_selecting() {

        new HomePage().addMoreBtn.click();
        new HomePage().listBtn.click();
        new HomePage().firstOfList.click();
        new HomePage().secondOfList.click();
        new HomePage().thirdOfList.click();


    }

    @Then("the user should be able to see users are added")
    public void the_user_should_be_able_to_see_users_are_added() {

        Assert.assertTrue(new HomePage().getFirstOfList.getText().contains("cyber"));
        Assert.assertTrue(new HomePage().getSecondOfList.getText().contains("cyber"));
        Assert.assertTrue(new HomePage().getThirdOfList.getText().contains("cyber"));





    }

    @When("the user attaches a link")
    public void the_user_attaches_a_link() {

        new HomePage().linkAttachment.click();
        new HomePage().linkURLM.sendKeys("https://www.google.com/");
        new HomePage().saveBtn.click();


    }

    @Then("the user should be able to see the link is attached")
    public void the_user_should_be_able_to_see_the_link_is_attached() {

        Driver.get().switchTo().frame(0);
        String body = Driver.get().findElement(By.cssSelector("body")).getText();
        Assert.assertTrue(body.contains("google"));


    }

    @When("the user enters a video link")
    public void the_user_enters_a_video_link() {

    new HomePage().videoBtn.click();
    new HomePage().videoURL.sendKeys("https://www.youtube.com/watch?v=yY7iGa4t9-I&t=2867s&ab_channel=Mr_MoMoMusic");

    BrowserUtils.waitFor(3);




    }

    @Then("the user should be able to see video is inserted")
    public void the_user_should_be_able_to_see_video_is_inserted() {

        BrowserUtils.waitFor(2);
        Assert.assertFalse(new HomePage().errorMessage.isDisplayed());


    }

    @When("the user creates a quote")
    public void the_user_creates_a_quote() {
        new HomePage().quoteBtn.click();
        Driver.get().switchTo().frame(0);
        new HomePage().quoteBox.sendKeys("This is a quote");


    }

    @Then("the user should be able to see the quote is created")
    public void the_user_should_be_able_to_see_the_quote_is_created() {

        String text = new HomePage().quoteBox.getText();
        Assert.assertTrue(text.contains("This"));

    }

    @When("the user adds mention")
    public void the_user_adds_mention() {
       new HomePage().mentionBtn.click();
       new HomePage().listBtn.click();
       new HomePage().firstOfList.click();


    }

    @Then("the user should be able to see the mention is added")
    public void the_user_should_be_able_to_see_the_mention_is_added() {
        Driver.get().switchTo().frame(0);
        String body = Driver.get().findElement(By.cssSelector("body")).getText();
        Assert.assertTrue(body.contains("cyber"));


    }

    @When("the user sends the announcement")
    public void the_user_sends_the_announcement() {

        Driver.get().switchTo().frame(0);
        Driver.get().findElement(By.cssSelector("body")).sendKeys("Denzel was here");
        Driver.get().switchTo().defaultContent();

        new HomePage().linkAttachment.click();
        new HomePage().linkURLM.sendKeys("https://www.google.com/");
        new HomePage().saveBtn.click();

        Driver.get().switchTo().defaultContent();
        new HomePage().mentionBtn.click();
        new HomePage().listBtn.click();
        new HomePage().firstOfList.click();

        new HomePage().addMoreBtn.click();
        new HomePage().listBtn.click();
        new HomePage().firstOfList.click();
        new HomePage().secondOfList.click();
        new HomePage().thirdOfList.click();

        new HomePage().uploadBtn.click();


        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/textfile.txt";
        String fullPath = projectPath+"/"+filePath;
        new HomePage().uploadBtn2.sendKeys(fullPath);




        new HomePage().quoteBtn.click();
        Driver.get().switchTo().frame(0);
        new HomePage().quoteBox.sendKeys("This is a quote");

        Driver.get().switchTo().defaultContent();
         new HomePage().sendBtn.click();




    }

    @Then("the user should be able to see announcement is posted")
    public void the_user_should_be_able_to_see_announcement_is_posted() {

        BrowserUtils.waitFor(3);
        Assert.assertTrue(new HomePage().iHaveReadThis.isDisplayed());
    }



}
