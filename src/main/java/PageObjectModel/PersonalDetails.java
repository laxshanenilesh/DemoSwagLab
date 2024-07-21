package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalDetails {
      WebDriver driver;
	 private By PersonalDetails=By.xpath("//input[@name='firstName']");
	 
	 public PersonalDetails(WebDriver driver2) {
		 this.driver=driver2;
		 
		 WebElement PERSONALDETAIL = driver.findElement(By.name("firstName"));
		 
			boolean isEditable= PERSONALDETAIL.isEnabled();
			if(isEditable==true)
			{
				System.out.println("My Personal Details isEditable ");
			}
			else
			{
				System.out.println("My Personal Details is Not Editable");
			}	
	}

	public WebElement Personaldetails()
	 {
		return driver.findElement(PersonalDetails);
	 }	 
	}
	
//	public void clearPersonaldetails()
//	{
//		Personaldetails().clear();
//	}
//}

