package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginsaucedemo {
	ChromeDriver driver;
  @Test(priority = 0)
  public void launch() {
	  
	 driver  = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.saucedemo.com/");
	  
  }
  
  @Test(priority = 1)
  public void login1st() {
	 // driver = new ChromeDriver();
	  launch();
	   
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	  
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
  }
  
  @Test(priority = 2)
  public void login2st() {
	 // driver = new ChromeDriver();
	  launch();
	   
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("locked_out_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
  }
  
}
