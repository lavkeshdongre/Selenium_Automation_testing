package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class edge_test {
	public static void main(String []args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password1");
		
		driver.findElement(By.id("submit")).click();
		
		
		
	}
}
