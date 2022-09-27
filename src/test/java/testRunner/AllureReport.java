package testRunner;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
		plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		glue =  "stepDefinition",
		features = {"src/test/resources/feature/Program.feature"})
		
@Test

public class AllureReport extends AbstractTestNGCucumberTests {

	@Override
	 
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
return super.scenarios();
}
}
