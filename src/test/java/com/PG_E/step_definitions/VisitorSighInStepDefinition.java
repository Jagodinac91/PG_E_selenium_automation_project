package com.PG_E.step_definitions;

import com.PG_E.pages.PG_E_HomePage;
import com.PG_E.pages.VisitorPage;
import com.PG_E.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisitorSighInStepDefinition {
    PG_E_HomePage pg_e_homePage = new PG_E_HomePage();
    VisitorPage visitorPage = new VisitorPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    @Given("we access visitor page")
    public void we_access_visitor_page() {
        pg_e_homePage.getVisitorBtn().click();
    }
    @When("the title should be {string}")
    public void the_title_should_be(String actualTitleVisitor) {
        wait.until(ExpectedConditions.titleContains(actualTitleVisitor));
        Assert.assertEquals(actualTitleVisitor,Driver.getDriver().getTitle());
    }
    @When("visitor enter valid acc number")
    public void visitor_enter_valid_acc_number() {
        visitorPage.enterAccNumber("12365478965");
    }
    @When("visitor enter valid SSN")
    public void visitor_enter_valid_ssn() {
        visitorPage.enterLastFourSSN("7878");
    }
    @When("visitor enter invalid meter number")
    public void visitor_enter_invalid_meter_number() {
        visitorPage.enterMeterNumber("789754456212315555");
    }
    @Then("error msg should be returned")
    public void error_msg_should_be_returned() {
        visitorPage.clickOnSighInBtn();
        visitorPage.assertErrorMsg();
    }
}
