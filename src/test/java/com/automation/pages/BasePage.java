package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public WebDriver driver;
    public Actions actions;
    public BasePage() {

        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);

    }
}
