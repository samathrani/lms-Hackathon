package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		plugin = { "pretty", "html:target/cucumber-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		features = { "src/test/resources/feature" }, 
		glue = { "stepDefinition" })

public class ExtendReport extends AbstractTestNGCucumberTests{

}
