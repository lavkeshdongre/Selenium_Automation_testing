package Listner_pom_framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners((Listner_pom_framework.Listner_script.class))
public class Listner_Execute {
	ChromeDriver driver;
	@Test(priority = 1)
	void launch() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test(priority = 2)
	public void verify() {
		 String Actual = driver.getCurrentUrl();
		 String Expect = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		 
		 Assert.assertEquals(Actual, Expect,"Website not launch");
		 
		 
	}
	
	@Test(priority=3)
	public void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority=4)
    public void logout() {
    	
    	System.out.println("This method is skip");
    }

}
