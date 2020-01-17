package com.accenture.tests.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "src/test/resources/SearchTest/",
        glue = "com.accenture.tests",
        plugin = {"pretty"}
)

public class LoginTestRunner {
    
}
