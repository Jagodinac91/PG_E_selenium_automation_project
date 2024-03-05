package com.PG_E.pages;

import com.PG_E.utilities.BrowserUtils;
import com.PG_E.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisitorPage extends BasePage{

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @FindBy (xpath = "//input[@id = 'otaAccountNumber']")
    private WebElement accNumberInput;
    @FindBy (xpath = "//input[@aria-labelledby='labelLastFourDigitsOfSSN']")
    private WebElement lastFourSSNInput;
    @FindBy (xpath = "//input[@aria-label='meterNumber']")
    private WebElement meterNumberInput;

    @FindBy (xpath = "//button[@id='medbase_home_login_submit']")
    private WebElement visitorSighInButton;

    @FindBy (xpath = "//label[@class='login-error-validation']")
    private WebElement errorMsgInvalidAcc;

    public void enterAccNumber (String str) {
        wait.until(ExpectedConditions.elementToBeClickable(accNumberInput));
       BrowserUtils.sendKeysWithTimeOut(accNumberInput,str, 10 );
    }

    public void enterLastFourSSN (String str) {
        BrowserUtils.sendKeysWithTimeOut(lastFourSSNInput, str, 10);
    }

    public void enterMeterNumber (String str) {
        BrowserUtils.sendKeysWithTimeOut(meterNumberInput, str, 10);
    }

    public String getTextFromErrorMsg () {
        BrowserUtils.waitForVisibility(errorMsgInvalidAcc, 10);
        return errorMsgInvalidAcc.getText();
    }

    public void clickOnSighInBtn ()  {
        BrowserUtils.scrollToElement(visitorSighInButton);
        BrowserUtils.clickWithTimeOut(visitorSighInButton, 10);

    }

    public void assertErrorMsg () {
        wait.until(ExpectedConditions.visibilityOf(errorMsgInvalidAcc));
        Assert.assertTrue(getTextFromErrorMsg().contains("Please enter a valid Account #, SSN and Meter Number."));
    }


}
