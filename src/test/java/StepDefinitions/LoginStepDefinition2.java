package StepDefinitions;

import Utils.testContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;





public class LoginStepDefinition2 {
	
public testContextSetup testcontext;
	
	public LoginStepDefinition2(testContextSetup testcontext)
	{
		this.testcontext=testcontext;
	}
	

    @Then("^Verify that user is succesfully logged in$")
    public void verify_that_user_is_succesfully_logged_in() throws Throwable {
    	
    	
		System.out.println(testcontext.pagefactory.log.getloginfailuretext().getText());
    
    }

    @And("^close login page$")
    public void close_login_page() throws Throwable {
    	
    	testcontext.pagefactory.log.getloginclose().click();
    	
        
    }

    @And("^close browsers$")
    public void close_browsers() throws Throwable {
    	
    	//testcontext.pagefactory.driver.close();
    	
        
    }

}
