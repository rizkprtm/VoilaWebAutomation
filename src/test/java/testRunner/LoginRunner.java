package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (features ="src/test/resources/features",
                glue ="stepDefinitions",
                tags = "@LoginScenario",
                monochrome = true,
                plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                        "html:Cucumber-Results/cucumber.html"})
public class LoginRunner extends AbstractTestNGCucumberTests {
}
