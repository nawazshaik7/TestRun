package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectfactory {
	
	public WebDriver driver;
	public login log;
	public MainSearchPgeObjects mp;
	public CartPage cp;
	
	
	public PageObjectfactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public login loginpage()
	{
	
	log=new login(driver);
	return log;
	}
	
	public MainSearchPgeObjects mspage()
	{
		mp=new MainSearchPgeObjects(driver);
		return mp;
	}

	public CartPage cartpage()
	{
		cp=new CartPage(driver);
		return cp;
	}
}
