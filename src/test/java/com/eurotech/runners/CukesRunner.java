package com.eurotech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features="src/test/resources/Features",
        glue="com/eurotech/step_definitions",
        dryRun = false,
        tags = "@smoke"
)

public class CukesRunner {

}
