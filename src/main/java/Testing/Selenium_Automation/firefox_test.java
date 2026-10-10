package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_test {
	public static void main(String[]args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("studen]t");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(1000);
		
		driver.findElement(By.id("submit")).click();
	} 
}

