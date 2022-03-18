package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainSearchPgeObjects {
	
	public WebDriver driver;
	
	public MainSearchPgeObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By mainpagesearchbar=By.xpath("//input[@title='Search for products, brands and more']");
	
	By mainpagesearchbarsugg= By.xpath("//form[contains(@class,'header-form-search')]/ul/li[5]");
	By item=By.partialLinkText("GIONEE Max Pro (Blue, 32 G");
	
	
	public WebElement mainpagesearchbarMet()
	{
		return driver.findElement(mainpagesearchbar);
	}
	public WebElement mainpagesearchbarsuggMet()
	{
		return driver.findElement(mainpagesearchbarsugg);
	}
	
	public WebElement itemMet()
	{
		return driver.findElement(item);
	}
	

}
