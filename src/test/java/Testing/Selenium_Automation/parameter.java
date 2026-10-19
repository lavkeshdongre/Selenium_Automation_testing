package Testing.Selenium_Automation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	@Parameters({"P"})
	@Test
	public void add(int num) {
		System.out.println("number is "+ num);
	}

}
