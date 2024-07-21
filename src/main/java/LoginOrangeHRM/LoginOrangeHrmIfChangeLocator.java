package LoginOrangeHRM;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginOrangeHrmIfChangeLocator {
	
	
	//   step.......1
	
	public WebDriver driver;	//  
	
     @Test
	 public void initializeDriver() throws IOException
	{
          FileInputStream file=new FileInputStream("C:\\Users\\user\\Pictures\\TestNG_Demo\\data.properties");
          Properties pr=new Properties();
          pr.load(file);
          String browser= pr.getProperty("browser");
          
    	 if(browser.equals(browser))
    	 {
    		  driver=new ChromeDriver();
    		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    			driver.manage().window().maximize();
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 }
    	 
    	 else if(browser.equals(browser))
    	 {
    		 driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       }
    	 
        else
    	 {
    	System.out.println("Browser Not Found Please Check!");	 
    	 }
	}
}
