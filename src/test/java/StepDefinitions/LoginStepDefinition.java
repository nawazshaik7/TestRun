package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import PageObjects.login;
import Utils.base;
import Utils.testContextSetup;


public class LoginStepDefinition extends base{
	public testContextSetup testcontext;
	//public login log;
	
	public LoginStepDefinition(testContextSetup testcontext)
	{
		this.testcontext=testcontext;
		//this.log=testcontext.pagefactory.loginpage();
	}

	


	
	
	 


	    @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
	    	//testcontext.driver=initializeDriver();
	    
	    }
	    
	    @And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	    	
	    	testcontext.pagefactory.driver.get(strArg1);
	        
	    }
		

	    @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
	    	
	    	
	    	
	    	testcontext.pagefactory.loginpage().getusername().sendKeys(strArg1);
	    	testcontext.pagefactory.loginpage().getpassword().sendKeys(strArg2);
	    	testcontext.pagefactory.loginpage().getlogin().click();
	    	
	        
	    }


	}

