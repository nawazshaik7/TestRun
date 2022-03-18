package StepDefinitions;

import Utils.testContextSetup;
import io.cucumber.java.en.And;

public class Cartpagestepdfinition {
	public testContextSetup testcontext;
	
	public Cartpagestepdfinition(testContextSetup testcontext)
	{
		this.testcontext=testcontext;
	}
	
	

@And("^Add item to cart$")
public void add_item_to_cart() throws Throwable {
	
	
	testcontext.gu.switchtoChildWindow();
	testcontext.pagefactory.cartpage().addcart().click();
	Thread.sleep(4000);

}
}
