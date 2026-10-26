package Step_Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gmail_login {
	@Given("User Should be ragistered")
	public void precondition() {
		
		System.out.println("User is ragistered");
		
	}
	
	@When("Open Gamil login page , enter valid credentials")
	public void Test_Step() {
		System.out.println("Email:kaveri@gmail.com & password:kaveri@123");
		
	}
	@Then("Gmail login should be successfully")
	public void Expected_result() {
		System.out.println("User login Succesfully");
		
	}
}
