package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login {
	
	public static void main(String[] args) {
  ChromeDriver driver =  new ChromeDriver();
  
  driver.manage().window().maximize();
  driver.get("https://secure.facebook.com/login.php/");
  
  //ya madhi apan find element karto tya input madhi attribute id cghi value takto.
  
  driver.findElement(By.id("email")).sendKeys("lavkeshdongre66@gmail.com");
  
  driver.findElement(By.id("pass")).sendKeys("Ltd@2004");
  
  driver.findElement(By.id("loginbutton")).click();
}
}
