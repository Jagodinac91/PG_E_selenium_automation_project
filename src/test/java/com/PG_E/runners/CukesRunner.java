package com.PG_E.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/html-report.html",
                "pretty",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumberort.json"
        },
        features = "src/test/resources/features",
        glue = "com/PG_E/step_definitions",
        dryRun = false,
        tags = "@Test"
)




public class CukesRunner {

}
