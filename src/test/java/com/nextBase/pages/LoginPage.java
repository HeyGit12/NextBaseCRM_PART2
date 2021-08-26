package com.nextBase.pages;

import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

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


    public void login(String userType) {
        String type=userType.toLowerCase();
        userName.sendKeys(ConfigurationReader.get(type+"_username"));
        password.sendKeys(ConfigurationReader.get("password"));
        submit.click();

    }


}
