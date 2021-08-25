package com.nextBase.pages;

import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){
    PageFactory.initElements(Driver.get(), this);
}

    @FindBy(xpath="//input[@name='USER_LOGIN']")
    public WebElement userName;



    @FindBy(xpath="//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMessage;


    public void login() {
        userName.sendKeys(ConfigurationReader.get("hr_username"));
        password.sendKeys(ConfigurationReader.get("password"));
        submit.click();

    }


}
