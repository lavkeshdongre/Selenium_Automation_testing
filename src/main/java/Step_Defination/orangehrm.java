package Step_Defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangehrm {
	WebDriver driver;
	
	@Given("oranghrm browser should be launch")
	public void oranghrm_browser_should_be_launch() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter the username as {string} and the password as {string}")
	public void enter_the_username_as_and_the_password_as(String uname, String pass) {
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
	   
	}

	@And("Click on the login btn of orangehrm")
	public void click_on_the_login_btn_of_orangehrm() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("user should be on the orange hrm dashboard")
	public void user_should_be_on_the_orange_hrm_dashboard() {
	    System.out.println("current website will be orange hrm the url is "+driver.getCurrentUrl());
	}



}
