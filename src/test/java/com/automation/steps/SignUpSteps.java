package com.automation.steps;

import com.automation.pages.Dbank.SignUp;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignUpSteps {
    SignUp signUp = new SignUp();
    @Given("user is on the landing page")
    public void userIsOnTheLandingPage() {
        signUp.openWebsite();
    }

    @When("User clicks on SignUp Link")
    public void userClicksOnSignUpLink() {
        signUp.clickOnSignUp();
    }

    @Then("verify user is on SignUpPage")
    public void verifyUserIsOnSignUpPage() {
        Assert.assertTrue(signUp.isSignUpVisible());
    }

    @Then("user Fills all necessary values for SignUp")
    public void fillNecessaryValuesForSignUp() {
        signUp.selectTitle("Mr.");
        signUp.fillFirstName("ABC");
        signUp.fillLastName("CD");
        signUp.selectGender("M");
        signUp.setDOB("04/04/2012");
        signUp.setSSN(ConfigReader.getConfig("SSN"));
        signUp.setEmailAddress(ConfigReader.getConfig("email"));
        signUp.setPassword(ConfigReader.getConfig("pass"));
        signUp.setConfirmPassword(ConfigReader.getConfig("pass"));
        signUp.clickOnSubmit();
        signUp.setAddress("123 Digital Lane");
        signUp.setLocality("Internet City");
        signUp.setRegion(" CA");
        signUp.setPostalCode(" 94302");
        signUp.setCountry(" US");
        signUp.setHomePhone( "(547) 392-5436");
        signUp.setMobilePhone( "(547) 392-5436");
        signUp.setWorkPhone("(547) 392-5436");
        signUp.agreeTerms();
        signUp.clickOnSubmit();

    }

}
