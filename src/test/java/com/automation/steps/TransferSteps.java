package com.automation.steps;

import com.automation.pages.Dbank.TransferPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransferSteps {
    TransferPage transferPage = new TransferPage();
    @When("User clicks on transfer menu")
    public void userClicksOnTransferMenu() {
        transferPage.clickOnTransferMenu();
    }

    @Then("User Selects from account")
    public void userSelectsFromAccount() {
        transferPage.selectFromAccount("ABCD (Standard Checking)");
    }

    @And("User selects to account")
    public void userSelectsToAccount() {
        transferPage.selectToAccount("ABCD (Savings)");
    }

    @And("user gives amount {string}")
    public void userGivesAmount(String arg0) {
        transferPage.selectAmount(arg0);
    }

    @And("verify that the amount transferred successfully")
    public void verifyThatTheAmountTransferredSuccessfully() {
    }
}
