package com.automation.pages.Dbank;

import com.automation.pages.BasePage;
import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {
    @FindBy(id = "checking-menu")
    WebElement checkingLink;

    @FindBy(id = "new-checking-menu-item")
    WebElement newCheckingLink;

    @FindBy(id = "Standard Checking")
    WebElement standardChecking;

    @FindBy(id = "savings-menu")
    WebElement savingLink;

    @FindBy(id = "new-savings-menu-item")
    WebElement newSavingLink;

    @FindBy(id = "Savings")
    WebElement saving;

    @FindBy(id = "Individual")
    WebElement individualLink;

    @FindBy(id = "name")
    WebElement accountName;

    @FindBy(id = "openingBalance")
    WebElement openingBalance;

    @FindBy(id = "newCheckingSubmit")
    WebElement submitBtn;

    @FindBy(id = "newSavingsSubmit")
    WebElement submitBtnforSaving;

    @FindBy(xpath = "(//div[@class='card-body'])[1]/div")
    List<WebElement> accountDetails;

    @FindBy(id = "view-checking-menu-item")
    WebElement viewCheckingDetails;

    @FindBy(id = "view-savings-menu-item")
    WebElement viewSavingsDetails;
    List<String> savingList = new ArrayList<>();
    List<String> checkingList = new ArrayList<>();


    LoginPage loginPage = new LoginPage();

    public void getToHomePage() {
        loginPage.doLogin(ConfigReader.getConfig("email"), ConfigReader.getConfig("pass"));


    }

    public void clickOnChecking() {
        checkingLink.click();
    }

    public void clickOnNewChecking() {
        newCheckingLink.click();
    }

    public void selectStandardChecking() {
        standardChecking.click();
    }

    public void clickOnSaving() {
        savingLink.click();
    }

    public void clickOnNewSaving() {
        newSavingLink.click();
    }

    public void selectSaving() {
        saving.click();
    }

    public void selectIndividual() {
        individualLink.click();
    }

    public void selectAccountName(String data) {

        accountName.sendKeys(data);
    }

    public void selectInitialDeposite(String data) {
        openingBalance.sendKeys(data);
    }

    public void clickSubmit() {
        submitBtn.click();
    }

    public void clickSubmitForSaving() {
        submitBtnforSaving.click();
        actions.pause(5000).build().perform();
    }

    public void printAccountDetails(String listName) {

        if (listName.equals("Saving")) {
            for (WebElement x : accountDetails) {
                savingList.add(x.getText());

                System.out.println(x.getText());
            }
        } else {
            for (WebElement x : accountDetails) {
                checkingList.add(x.getText());

                System.out.println(x.getText());
            }
        }

        System.out.println("=====================================================================");

    }

    public void printSavingsDetails() {
        savingLink.click();
        viewSavingsDetails.click();
        printAccountDetails("Saving");
//        System.out.println(savingList);
    }

    public void printCheckingDetails() {
        checkingLink.click();
        viewCheckingDetails.click();
        printAccountDetails("Checking");
//        System.out.println(checkingList);
    }
}
