package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\admin\\Desktop\\workspace\\BDDDemo\\src\\main\\java\\Features\\login.feature",
		glue = {"stepDefinitions"},
		format = {"pretty","html:test-output"},
		monochrome = true,
		dryRun = false,
		strict = false
		)

public class TestRunner {

}
