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

    public void loginAs(String userType) {
        String type=userType.toLowerCase();
        userName.sendKeys(ConfigurationReader.get(type+"_username"));
        password.sendKeys(ConfigurationReader.get(type+"password"));
        submit.click();
    }

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }


}