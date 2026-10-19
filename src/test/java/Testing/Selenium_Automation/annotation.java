package Testing.Selenium_Automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
   @Test
	public void name() {
		System.out.println("lavkesh");
	}
	@AfterTest
	public void surname() {
		System.out.println("Dongre");
		
	}
	@BeforeTest
	public void email() {
		System.out.println("lavkesh123@gmail.com");
	}

}
