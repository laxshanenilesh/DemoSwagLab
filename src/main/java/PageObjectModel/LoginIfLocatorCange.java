package PageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



// STEP........2

public class LoginIfLocatorCange {         
   
	public WebDriver driver;
	
	private By username=By.name("username");
    private By password=By.name("password");
    private By submit= By.xpath("//button[@type='submit']");
    
    
	public LoginIfLocatorCange(WebDriver driver2)
	{
		this.driver=driver2;
	}
	public WebElement UserName()
	{
		return driver.findElement(username);	
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement login()
	{
		return driver.findElement(submit);
	}
}
