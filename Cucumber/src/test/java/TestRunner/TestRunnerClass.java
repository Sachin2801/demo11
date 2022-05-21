package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "FeatureFile/Login.feature" }, 
        glue = { "StepDefination" },
        monochrome= true,
        dryRun= true
)
public class TestRunnerClass {

}
