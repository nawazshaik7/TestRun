package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectfactory;
import PageObjects.login;





public class testContextSetup {
	
	public WebDriver driver;
	public PageObjectfactory pagefactory;	
	public base bs;
	public GenericUtils gu;
	
	
	public testContextSetup() throws IOException
	{
		  bs=new base();
		  pagefactory=new PageObjectfactory(bs.initializeDriver());
		  gu=new GenericUtils(bs.driver);
	}
	
	
	
		
	}


