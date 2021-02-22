package com.sulebank.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//running cucumber framework executing feature files
//we use junit to execute our test case scenarios:
@RunWith(Cucumber.class)

//we need to tell runner to look under features file for the scenarios by default it will look under its file (runners)
@CucumberOptions(
        plugin={"json:target/cucumber.json",
                "html:target/default-html-reports"
        },//tells cucumber to create json file.
        features = "src/test/resources/Features",
        glue="com/sulebank/step_definitions", //locator for step definitions folder because runner also doesnt know where step definitions are
        dryRun=false,
        tags="@wip"
)
public class CukesRunner {
}
