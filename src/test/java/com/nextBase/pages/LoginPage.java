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
        password.sendKeys(ConfigurationReader.get("password"));
        submit.click();
    }

    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }

    public void loginAsA(String userType){
        String username = null;
        String password = null;

        if (userType.equals("Helpdesk")) {
            username = ConfigurationReader.get("helpdesk_username");
            password = ConfigurationReader.get("helpdesk_password");
        } else if (userType.equals("Human_Resources")) {
            username = ConfigurationReader.get("human_resources_username");
            password = ConfigurationReader.get("human_resources_password");
        } else if (userType.equals("Marketing")) {
            username = ConfigurationReader.get("marketing_username");
            password = ConfigurationReader.get("marketing_password");
        }
        login(username,password);
    }


}