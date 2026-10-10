package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_test {

	public static void main (String[]args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//ithe apan jya website var jaicha ahe tya website chi link deto .
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//ya madhe asa aste ki jo block madhi apan value takto tya block la inspect karun tyachi id ghevun tyala send key ne data pathavto 
		driver.findElement(By.id("username")).sendKeys("student");
		
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		 driver.findElement(By.id("submit")).click();
		 
		 //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
		 
		 System.out.println("Url after login" + driver.getCurrentUrl());	
		 
		// Verify new page contains expected text ('Congratulations' or 'successfully logged in')
		 
		 WebElement text= driver.findElement(By.tagName("strong"));
		 
		 System.out.println("Text after login "+ text.getText());
		 
		// Verify button Log out is displayed on the new page
		 WebElement isloggedout=driver.findElement(By.linkText("Log out"));
		 
		 System.out.println("Log out text"+ isloggedout.getText());
		 
		 driver.close();
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
}
