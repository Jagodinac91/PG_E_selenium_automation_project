package com.PG_E.step_definitions;

import com.PG_E.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestingFrameworkStepDefinition {
    @Given("We land on the PG_E main page")
    public void we_land_on_the_pg_e_main_page() {
    }
    @Then("The title should be: {string}")
    public void the_title_should_be(String actualTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
    }
}
