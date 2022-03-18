package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.testContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;



public class hooks {
	
	

	public testContextSetup testcontext;
	public hooks(testContextSetup testcontext)
	{
		
		this.testcontext=testcontext;
	}
	@After
	public void afterscenario()
	{
		testcontext.pagefactory.driver.close();
		
	}
	
	@AfterStep
	
	
	public void Addscreenshot(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
		WebDriver driver=testcontext.bs.driver;
		java.io.File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    byte[] filecon =	FileUtils.readFileToByteArray(sourcepath);
	    scenario.attach(filecon, "image/png", "image");
	    
		}
		
		
	}

}
