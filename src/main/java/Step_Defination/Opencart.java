package Step_Defination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opencart {
	ChromeDriver driver = new ChromeDriver();
	@Given("Opencart website should be open")
	public void launch() {
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		System.out.println("launch browser successfully");
		}
	
	@When("All details enter in the feild")
	public void EnterDetails() {
		driver.findElement(By.id("input-username")).sendKeys("lavkeshdongre");
		driver.findElement(By.id("input-firstname")).sendKeys("Lavkesh");
		driver.findElement(By.id("input-lastname")).sendKeys("Lavkesh");
		driver.findElement(By.id("input-email")).sendKeys("lavkeshdongre66@gmail.com");
		WebElement country = driver.findElement(By.id("input-country"));
		
		Select C = new Select(country);
		
		C.deselectByVisibleText("India");
		
		driver.findElement(By.id("input-password")).sendKeys("lavkesh@123");
		
		
	}
	@Then("User Ragister Successfully")
	public void complete() {
		System.out.println("Sucessfully ragister");
	}
}
