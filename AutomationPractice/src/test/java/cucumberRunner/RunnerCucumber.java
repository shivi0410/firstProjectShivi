package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resource/test.feature"},		//will give location of feature file
		glue = {"stepDef"},
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumber.html"},
		monochrome = true                               //males test output more readable
		//tags = "@tag"
		
		)
public class RunnerCucumber extends AbstractTestNGCucumberTests {

}
