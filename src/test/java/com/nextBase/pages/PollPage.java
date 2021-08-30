package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollPage extends BasePage{

    @FindBy(id = "bx-destination-tag")
    public WebElement addMoreBttn;

    @FindBy(xpath = "//a[@href='#switchTab'][2]")
    public WebElement empAndDeps;

    public void addContact(String email){
        String emailLocator = "//div[@class='bx-finder-company-department-employee-name' and .='" + email +"']";
        Driver.get().findElement(By.xpath(emailLocator)).click();
    }

    public boolean checkIfAdded(String email){
        String checkLocator = "//span[@class= 'feed-add-post-destination-text' and .='"+ email +"']";

        if(Driver.get().findElement(By.xpath(checkLocator)).isDisplayed()){
            return true;
        }else{
            return false;
        }
    }



}
