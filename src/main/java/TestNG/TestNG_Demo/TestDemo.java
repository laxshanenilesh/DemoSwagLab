package TestNG.TestNG_Demo;

import org.junit.Before;
import org.junit.Test;

public class TestDemo {
       
	 
	@Test
	  public void demo()
	  {
		  System.out.println("Configuration demo is Ok!");
	  }
	
	@Test
	  public void m1()
	  {
		  System.out.println("Configuration m1 is Ok!");
	  }
	
	@Before
	  public void m2()
	  {
		  System.out.println("Configuration m2 is Ok!");
	  }
}
