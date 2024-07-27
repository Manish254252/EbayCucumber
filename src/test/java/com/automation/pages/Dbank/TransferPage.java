package com.automation.pages.Dbank;

import com.automation.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TransferPage extends BasePage {

    @FindBy(id = "transfer-menu-item")
    WebElement transferMenuLink;

    @FindBy(id = "fromAccount")
    WebElement fromAccount;

    @FindBy(id="toAccount")
    WebElement toAccount;

    @FindBy(id = "amount")
    WebElement amount;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitBtn;

    public void clickOnTransferMenu()
    {
        transferMenuLink.click();

    }



    public void selectFromAccount(String data)
    {
        Select selectFromAccount = new Select(fromAccount);
        fromAccount.click();
        selectFromAccount.selectByIndex(2);
        actions.pause(4000).build().perform();
    }
    public void selectToAccount(String data)
    {
        Select selectToAccount = new Select(toAccount);
        toAccount.click();
        selectToAccount.selectByIndex(1);
        actions.pause(4000).build().perform();
    }

    public void selectAmount(String data)
    {
        amount.sendKeys(data);
        actions.pause(5000).build().perform();
    }

    public void clickOnSubmitBtn()
    {
        submitBtn.click();
        actions.pause(4000).build().perform();
    }
}
