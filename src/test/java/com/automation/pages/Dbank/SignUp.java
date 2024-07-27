package com.automation.pages.Dbank;

import com.automation.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUp extends BasePage {

    @FindBy(xpath = "//a[text()=' Sign Up Here']")
    WebElement signUpLink;

    @FindBy(id = "title")
    WebElement titleElement;

    @FindBy(id = "firstName")
    WebElement firstNameElement;

    @FindBy(id = "lastName")
    WebElement lastNameElement;

    @FindBy(id = "gender")
    WebElement genderEle;

    @FindBy(id = "dob")
    WebElement DOB;

    @FindBy(id = "ssn")
    WebElement SSN;

    @FindBy(id = "emailAddress")
    WebElement emailAddress;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(id = "workPhone")
    WebElement workPhone;

    @FindBy(id = "mobilePhone")
    WebElement mobilePhone;

    @FindBy(id = "homePhone")
    WebElement homePhone;

    @FindBy(id = "postalCode")
    WebElement postalCode;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "region")
    WebElement region;

    @FindBy(id = "locality")
    WebElement locality;

    @FindBy(id = "address")
    WebElement address;

    @FindBy(id = "agree-terms")
    WebElement agree_terms;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitBtn;


    public void openWebsite() {
        driver.get("https://dbank-qa.wedevx.co/bank/login");
    }

    public void clickOnSignUp() {
        signUpLink.click();
    }
    public boolean isSignUpVisible() {
       return titleElement.isDisplayed();
    }

    public void selectTitle(String data) {
        Select select = new Select(titleElement);
        select.selectByValue(data);
        actions.pause(2000).build().perform();
    }

    public void fillFirstName(String data) {
        firstNameElement.sendKeys(data);
    }

    public void fillLastName(String data) {
        lastNameElement.sendKeys(data);
    }

    public void selectGender(String data) {
        genderEle.click();
    }

    public void setDOB(String data) {
        DOB.sendKeys(data);
    }

    public void setSSN(String data) {
        SSN.sendKeys(data);
    }

    public void setEmailAddress(String data) {
        emailAddress.sendKeys(data);
    }

    public void setPassword(String data) {
        password.sendKeys(data);
    }

    public void setConfirmPassword(String data) {
        confirmPassword.sendKeys(data);
    }

    public void clickOnSubmit() {
        submitBtn.click();
        actions.pause(7000).build().perform();
    }


    public void setWorkPhone(String data) {
        workPhone.sendKeys(data);
    }

    public void setMobilePhone(String data) {
        mobilePhone.sendKeys(data);
    }

    public void setHomePhone(String data) {
        homePhone.sendKeys(data);

    }

    public void setPostalCode(String data) {
        postalCode.sendKeys(data);
    }

    public void setCountry(String data) {
        country.sendKeys(data);
    }

    public void setRegion(String data) {
        region.sendKeys(data);
    }

    public void setLocality(String data) {
        locality.sendKeys(data);
    }

    public void setAddress(String data) {
        address.sendKeys(data);
    }

    public void agreeTerms() {
        agree_terms.click();
    }
}
