package StepDefinitions;

import java.awt.Desktop.Action;

import Utils.testContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MainSearchPage {
	
public testContextSetup testcontext;
	public MainSearchPage(testContextSetup testcontext)
	{
		this.testcontext=testcontext;
	}
	
@And("^search \"([^\"]*)\"$")
	    public void search_something(String strArg1) throws Throwable {
	testcontext.pagefactory.mspage().mainpagesearchbarMet().sendKeys(strArg1);
	Thread.sleep(4000);
	
	       
	    }
@And("^Select from dropdown$")
public void select_from_dropdown() throws Throwable {
	
	testcontext.pagefactory.mspage().mainpagesearchbarsuggMet().click();
	
	//Thread.sleep(4000);
    
}

@And("^click on item$")
public void click_on_item() throws Throwable {
	
	testcontext.pagefactory.mspage().itemMet().click();
	     
	    }




@Then("^verify \"([^\"]*)\" is addded to cart$")
public void verify_something_is_addded_to_cart(String strArg1) throws Throwable {
    
}




}
