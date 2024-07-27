package com.automation.steps;

import com.automation.pages.EbayHomePage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;



public class Hooks {
    static WebDriver driver;

    EbayHomePage homePage;

    @Before
    public void setUp() throws IOException {
        ConfigReader.initConfig();
        DriverManager.createDriver();
        driver=DriverManager.getDriver();

        homePage = new EbayHomePage();


    }

    @After
    public void tearDown() {

        driver.quit();
    }
}
