package FaceBookDEMO;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFB {
	  public WebDriver driver;	
	@Test
     public void initializeDriver() throws FileNotFoundException,IOException, InterruptedException
   {
          

        FileInputStream file=new FileInputStream("C:\\Users\\user\\Pictures\\TestNG_Demo\\data.properties");
		Properties pro=new Properties();
		pro.load(file);
		String browser=pro.getProperty("browser");
		
		//if(browser.equals(browser))
		 if(browser.equals(browser))            
		 {
			 driver= new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(3000);
       }		
		 else if(browser.equals(browser))
		{
			 driver= new EdgeDriver(); 
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(3000);
		}		
		else 
		{
			System.out.println("Page Not Found!");	
    	}
    }		
} 
