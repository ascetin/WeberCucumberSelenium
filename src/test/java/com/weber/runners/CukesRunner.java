package com.weber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/weber/step_definitions",
        dryRun = false,
        tags = "@findprodukt"
)

public class CukesRunner {

}
