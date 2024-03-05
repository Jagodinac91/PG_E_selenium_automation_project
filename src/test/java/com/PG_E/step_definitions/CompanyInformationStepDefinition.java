package com.PG_E.step_definitions;

import com.PG_E.pages.CompanyInformationPage;
import com.PG_E.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CompanyInformationStepDefinition {
    CompanyInformationPage companyInformationPage = new CompanyInformationPage();

    @Given("Customer is on landing page and scrolls down to the bottom of the page")
    public void customer_is_on_landing_page_and_scrolls_down_to_the_bottom_of_the_page() {
        companyInformationPage.scrollDownToCompanyElement();
    }
    @Given("access company information")
    public void access_company_information() {
        companyInformationPage.clickOnTheCompanyInfoButton();
    }
    @Then("customer should see this facts {string} {string}")
    public void customer_should_see_this_facts(String string, String string2) {
        Assert.assertEquals(companyInformationPage.getTextFromFastFactOne(), string);
        Assert.assertEquals(companyInformationPage.getTextFromFastFactTwo(), string2);
    }
}
