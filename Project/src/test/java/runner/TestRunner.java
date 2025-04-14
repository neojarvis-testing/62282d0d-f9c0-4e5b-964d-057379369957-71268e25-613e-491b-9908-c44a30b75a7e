package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./features", glue = "stepdefinition", tags = "@HealthLib or @Providers")

public class TestRunner {

}
