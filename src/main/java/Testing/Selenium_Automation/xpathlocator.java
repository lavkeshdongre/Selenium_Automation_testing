package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator{
	public static void main(String[]args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/register");
		
		//x[pathlocator syntax :- By.xpath://tagname[@attribute='value'];
		
	   driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("lavkesh");
	   
	   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("lavkesh123");
	   
	   // 2 syntax:= By.xpath://parenttagname/childtagname
	   
	   driver.findElement(By.xpath("//div/input")).sendKeys("lavkesh@123");
	   
	   //3.xpath //tagname[@attribute='value and @attribute='value']
	   
	   driver.findElement(By.xpath("//input[@placeholder='UserName' and @id='userName']")).sendKeys("lavkeshdongre");
	   driver.findElement(By.xpath("//input[@placeholder='Password' and @id='password']")).sendKeys("Ltd@2403");
	   
	   driver.findElement(By.id("register")).click();
	}

}

