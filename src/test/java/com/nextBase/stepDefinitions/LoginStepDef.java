package com.nextBase.stepDefinitions;

import com.nextBase.pages.LoginPage;
import com.nextBase.utilities.ConfigurationReader;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Given;

public class LoginStepDef {
    @Given("user already logged in with {string} username {string} password")
    public void user_already_logged_in_with_username_password(String username, String password) {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login(username,password);

    }
}
