package com.PG_E.pages;

import com.PG_E.utilities.BrowserUtils;
import com.PG_E.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class CompanyInformationPage extends BasePage{

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 4);
    @FindBy (xpath = "//div[@class='col-lg-4 col-md-4 col-sm-4 col-xs-12 footer-link-list']//a[@href='/en_US/about-pge/company-information/company-information.page']")
    private WebElement companyInformationButton;

    @FindBy (xpath = "//a[text()='Access PG&E fast facts']")
    private WebElement pgFastFactOne;

    @FindBy (xpath = "//a[text()='Understand how we help keep our customers and employees safe']")
    private WebElement pgFastFactTwo;

    public void scrollDownToCompanyElement() {
        BrowserUtils.scrollToElement(companyInformationButton);
    }

    public void clickOnTheCompanyInfoButton () {
        wait.until(ExpectedConditions.elementToBeClickable(companyInformationButton));
        companyInformationButton.click();
    }


    public String getTextFromFastFactOne () {
        wait.until(ExpectedConditions.visibilityOf(pgFastFactOne));
        return pgFastFactOne.getText();
    }

    public String getTextFromFastFactTwo () {
        wait.until(ExpectedConditions.visibilityOf(pgFastFactTwo));
        return pgFastFactTwo.getText();
    }
}
