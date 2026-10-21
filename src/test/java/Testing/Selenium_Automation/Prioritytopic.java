package Testing.Selenium_Automation;

import org.testng.annotations.Test;

public class Prioritytopic {
	
	@Test(priority=2)
	public void launched() {
		System.out.println("launced browser successfully");
		
	}
	
	
	
	
	@Test(priority=0)
	public void credential() {
		System.out.println("Enter credential");
	}
	
	@Test 
	public void login() {
		System.out.println("login Successfully ");
	}
	
	@Test
	public void Login() {
		System.out.println("Capital ");
		
	}
	

}
