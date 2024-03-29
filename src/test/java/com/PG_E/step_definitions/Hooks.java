package com.PG_E.step_definitions;

import com.PG_E.utilities.ConfigurationReader;
import com.PG_E.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Before Scenario is running");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @After
    public void tearDown(Scenario scenario){
        System.out.println("After Scenario is running");

        if(scenario.isFailed()) {
                byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenShot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}