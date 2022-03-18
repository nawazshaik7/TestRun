package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	
	public WebDriver driver;
	By username=By.xpath("//form[@autocomplete='on']/div[1]/input");
	By password=By.xpath("//form[@autocomplete='on']/div[2]/input");
	By login=By.xpath("//form[@autocomplete='on']/div[4]/button");
	By loginfailuretext=By.xpath("//form[@autocomplete='on']/div/span[2]/span");
	By loginclose=By.xpath("//div[@tabindex='-1']/div/button");

	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getpassword()
	{

		return driver.findElement(password);
	}
	
	public WebElement getlogin()
	{

		return driver.findElement(login);
	}
	
	public WebElement getloginfailuretext()
	{

		return driver.findElement(loginfailuretext);
	}
	
	public WebElement getloginclose()
	{

		return driver.findElement(loginclose);
	}
}
