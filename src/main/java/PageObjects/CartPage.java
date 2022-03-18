package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

public WebDriver driver;

//By addcartelelment =By.xpath("//ul[@class='row']/li[1]");
By addcartelelment =By.xpath("//ul[@class");
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement addcart()
	{
		return driver.findElement(addcartelelment);
	}

}
