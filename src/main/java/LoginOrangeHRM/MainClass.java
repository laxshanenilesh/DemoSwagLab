package LoginOrangeHRM;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.By;

public class MainClass extends LoginOrangeHrmIfChangeLocator {
	
	@Test
	@Override
	public void initializeDriver() throws IOException {
		super.initializeDriver();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
  
	
}
