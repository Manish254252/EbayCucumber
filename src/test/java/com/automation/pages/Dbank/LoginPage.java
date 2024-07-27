package com.automation.pages.Dbank;

import com.automation.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "submit")
    WebElement submit;
    public void openWebsite() {
        driver.get("https://dbank-qa.wedevx.co/bank/login");
    }
    public void setUserName(String data) {
        userName.sendKeys(data);
    }

    public void setPassword(String data) {
        password.sendKeys(data);
    }

    public void clickOnSubmit() {
        submit.click();
    }

    public void doLogin(String s1, String s2) {
        openWebsite();
        userName.sendKeys(s1);
        password.sendKeys(s2);
        submit.click();
    }
}
