package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Swaglablogin_logout {
   
	ChromeDriver driver;
	@Given("launch the swaglab website")
	public void launch_the_swaglab_website() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.saucedemo.com/");
	}

	
	@When("Enter the username as {string}  and password {string}")
	public void enter_the_username_as_and_password(String uname, String passwrd) {
		driver.findElement(By.id("username")).sendKeys(uname);
	    driver.findElement(By.id("password")).sendKeys(passwrd);
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("Logout Successfully")
	public void logout_successfully() {
	    
	}

	@Then("Logout the Swaglab website successfully  and expected_result as {string}")
	public void logout_the_swaglab_website_successfully_and_expected_result_as(String string) {
	    
	}
}
