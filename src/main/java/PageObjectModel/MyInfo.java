package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfo {
	public WebDriver driver;	
   private By Myinfo=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span");

   public MyInfo(WebDriver driver2) {
	   this.driver=driver2;
	}


    public WebElement MyInfoS()
   {
	return driver.findElement(Myinfo);
	   
   }
}