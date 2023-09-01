package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		features="featureFile", 
		glue={"stepdefinition"},
		dryRun = false, 
		monochrome = true,
		tags = "@WithExamples"
		)
		///plugin={"html:report/webReport", "json:report/jsonreport.json"})
public class RunnerClass {

}
