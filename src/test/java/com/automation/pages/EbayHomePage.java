package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class EbayHomePage extends BasePage {
    @FindBy(id = "gh-ac")
    WebElement searchBar;

    @FindBy(id = "gh-btn")
    WebElement searchBtn;

    @FindBy(xpath = "//span[@class=\"follow-heart-wrapper heartIcon \"]")
    WebElement saveSearchBtnVisible;
    @FindBy(xpath = "//ul[@class='srp-results srp-list clearfix']//div[@class='s-item__image-wrapper image-treatment']")
    List<WebElement> productList;

    @FindBy(id = "atcBtn_btn_1")
    WebElement addTOCartBtn;

    @FindBy(xpath = "(//li[@class=\"fake-tabs__item btn\"])[2]/a")
    WebElement buyItNowLink;

    @FindBy(xpath = "//div[@class=\"gh-menu\"]/a[@data-sp=\"m570.l2633\"]")
    WebElement addToCartLogoLink;

    @FindBy(xpath = "//button[@data-test-id=\"cta-top\"]")
    WebElement checkOutbtn;

    @FindBy(xpath = "//div[@data-testid='x-price-primary']/span")
    WebElement productPrice;

    @FindBy(xpath = "//div[@class=\"cart-summary-line-item\"][2]/div/span[@class=\"text-display-span\"]/span/span")
    WebElement taxElement;

    @FindBy(xpath = "//div[@data-test-id=\"SUBTOTAL\"]/span/span")
            WebElement totalPriceEle;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void openWebsite() {
        driver.get("https://www.ebay.com/");
    }

    public void searchItem(String itemName) {
        searchBar.click();
        searchBar.sendKeys(itemName);
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public boolean isSaveSearchVisible() {
        return saveSearchBtnVisible.isDisplayed();
    }

    Set<String> windowHandles;
    String homeWindowHandle;
    static float valueVerify =0;

    public void selectProducts(int a) {
        for (int i = 2; i < a + 2; i++) {
            js.executeScript("arguments[0].click", buyItNowLink);
//            buyItNowLink.click();
//            System.out.println(i);
            homeWindowHandle = driver.getWindowHandle();
            String newWindowHandle = "";

            productList.get(i).click();
//            System.out.println(productList.get(i).getText());




            Set<String> windowHandles = driver.getWindowHandles();
//            System.out.println(windowHandles);
            for (String x : windowHandles) {
                if (!x.equals(homeWindowHandle)) {
                    newWindowHandle = x;
                    break;
                }
            }
            driver.switchTo().window(newWindowHandle);
          String  productPriceCheckValue = productPrice.getText().replaceAll("[^0-9.]","");

            valueVerify+=Float.parseFloat(productPriceCheckValue);
            addTOCartBtn.click();

            driver.close();


            driver.switchTo().window(homeWindowHandle);
//            System.out.println(driver.getTitle());

        }
//        System.out.println(valueVerify);


    }

    public void clickOnAddToCartLogo() {
        addToCartLogoLink.click();




    }
    public void verifyPrices()
    {
        String tax = taxElement.getText().replaceAll("[^0-9.]","");
        valueVerify+=Float.parseFloat(tax);
//        System.out.println(tax);
//        System.out.println(valueVerify);
        String total =totalPriceEle.getText().replaceAll("[^0-9.]","");
        float totalPrice = Float.parseFloat(total);
//        System.out.println(total+" total ");
        String temp =  valueVerify+"";
        valueVerify =Float.parseFloat( temp.substring(0,temp.indexOf('.')+3));
//        System.out.println(valueVerify+" val ");
        Assert.assertEquals(valueVerify,totalPrice);
    }
}
