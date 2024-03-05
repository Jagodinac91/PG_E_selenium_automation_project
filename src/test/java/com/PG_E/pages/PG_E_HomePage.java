package com.PG_E.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PG_E_HomePage extends BasePage{
    @FindBy(xpath = "//a[@href='https://m.pge.com/#visitorota']/../a[2]")
    private WebElement visitorBtn;

    public WebElement getVisitorBtn() {
        return visitorBtn;
    }
}
