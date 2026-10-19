package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	
		public static void main(String [] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.calculator.net/");
			
			driver.findElement(By.xpath("//span[@onclick='r(7)']")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("+")).click();	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
			
		//	driver.findElement(By.cssSelector("span.scieq")).click();
			
			
			
			Thread.sleep(3000);
			driver.close();
			
		}

	}


