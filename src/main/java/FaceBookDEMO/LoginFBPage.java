package FaceBookDEMO;
import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.By;


public class LoginFBPage extends WebDriverFB{
	     @Test
	     public void Loginpage() throws IOException, InterruptedException
	     {
	        initializeDriver();
	        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nilesh@21");
	       System.out.println(driver.getTitle());
	         }
	}
	
	     //OR
	
//	@Test
//	public void login()
//	{
//		WebDriver();
//	}

