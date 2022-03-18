package CucumberOptions;



import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "@target/failed_Scenarios.txt",
	    glue="StepDefinitions",monochrome = true,tags = "@login",plugin = {"html:target/cucumber.html","json:target/cucumber.json",
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunnerFaied extends AbstractTestNGCucumberTests  {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
