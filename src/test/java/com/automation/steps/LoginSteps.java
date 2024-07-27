package com.automation.steps;

import com.automation.pages.Dbank.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();



    @Then("User login with the credentials")
    public void userLoginWithTheCredentials() {
        loginPage.openWebsite();
        loginPage.setUserName(ConfigReader.getConfig("email"));
        loginPage.setPassword(ConfigReader.getConfig("pass"));
        loginPage.clickOnSubmit();

    }
}
