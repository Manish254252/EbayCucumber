package com.automation.steps;

import com.automation.pages.EbayHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepDefs {
    EbayHomePage ebayHomePage = new EbayHomePage();
    @Given("User is on Home Page")
    public void user_is_on_home_page() {
            ebayHomePage.openWebsite();
    }

    @When("User Search for {string}")
    public void user_search_for(String string) {
        ebayHomePage.searchItem(string);
    }

    @When("Clicks on Search Button")
    public void clicks_on_search_button() {
        ebayHomePage.clickOnSearchBtn();
    }

    @Then("List of searched product should be displayed")
    public void list_of_searched_product_should_be_displayed() {
        Assert.assertTrue(ebayHomePage.isSaveSearchVisible());
    }

    @When("User adds some product to cart")
    public void userAddsSomeProductToCart() {
        ebayHomePage.selectProducts(2);
    }

    @Then("User clicks on addToCart Logo")
    public void userClicksOnAddTocartLogo() {
        ebayHomePage.clickOnAddToCartLogo();
    }

    @Then("Verify items price plus tax is equals to totalPrice")
    public void verifyItemsPricePlusTaxIsEqualsToTotalPrice() {
        ebayHomePage.verifyPrices();
    }


}
