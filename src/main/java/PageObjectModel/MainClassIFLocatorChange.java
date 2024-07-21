package PageObjectModel;
import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import LoginOrangeHRM.LoginOrangeHrmIfChangeLocator;


//Step...........3

 public class MainClassIFLocatorChange extends LoginOrangeHrmIfChangeLocator {
	 
	 @Test
	 @Override
	public void initializeDriver() throws IOException {    
		super.initializeDriver();
		
	
		LoginIfLocatorCange IfChange= new LoginIfLocatorCange(driver);
		IfChange.UserName().sendKeys("Admin");
		IfChange.Password().sendKeys("admin123");
	    IfChange.login().click();
	    
	    MyInfo info= new MyInfo(driver);
	    info.MyInfoS().click();
	    
	    
	    PersonalDetails PD= new PersonalDetails(driver);
	    PD.Personaldetails().click();	    
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='firstName']"));
        
        firstNameInput.clear();
        
        firstNameInput.sendKeys("Nilesh");
	  
	   
	   
	   	
	} 
}
