package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpractice {
public static void main(String[]args) {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("lavkesh");
	
	driver.findElement(By.xpath("//input[@id='email' and @placeholder='Enter EMail']")).sendKeys("lavkesh@123gmail.com");
	
	driver.findElement(By.xpath("//input[@id='phone' and @placeholder='Enter Phone']")).sendKeys("8180935629");
	
	driver.findElement(By.xpath("//div/textarea")).sendKeys("At post sarwadi taluka karanja ghadge");
	
	driver.findElement(By.xpath("//input[@id='male']")).click();
	
	
}

}
