package com.automation.steps;

import com.automation.pages.Dbank.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("User is on the HomePage")
    public void userIsOnTheHomePage() {
        homePage.getToHomePage();
    }

    @When("User clicks on Checking")
    public void userClicksOnChecking() {
        homePage.clickOnChecking();

    }

    @And("User selects new Checking")
    public void userSelectsNewChecking() {
        homePage.clickOnNewChecking();
    }

    @Then("User fills details for creating new checking account")
    public void userFillsDetailsForCreatingNewCheckingAccount() {
        homePage.selectStandardChecking();
        homePage.selectIndividual();
        homePage.selectAccountName("ABCD");
        homePage.selectInitialDeposite("9999999");
        homePage.clickSubmit();
    }

    @When("User clicks on Savings")
    public void userClicksOnSavings() {
        homePage.clickOnSaving();
    }

    @And("User selects new Savings")
    public void userSelectsNewSavings() {
        homePage.clickOnNewSaving();
    }

    @Then("User fills details for creating new Savings account")
    public void userFillsDetailsForCreatingNewSavingsAccount() {
        homePage.selectSaving();
        homePage.selectIndividual();
        homePage.selectAccountName("ABCD");
        homePage.selectInitialDeposite("9999999");
        homePage.clickSubmitForSaving();

    }

    @Given("Print account details")
    public void printAccountDetails() {
        homePage.getToHomePage();
        homePage.printCheckingDetails();
        homePage.printSavingsDetails();
        System.out.println("========++++++++++===============+++++++++++++++++==========================+++++++++++++++++++");
    }
}
