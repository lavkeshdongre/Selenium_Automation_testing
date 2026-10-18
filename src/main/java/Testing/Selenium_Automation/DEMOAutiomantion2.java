package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMOAutiomantion2 {

	public static void main(String[] args) {
	   ChromeDriver driver = new ChromeDriver();
	   
	   driver.get("https://demo.automationtesting.in/Frames.html");
	   //iframe 
	   
	   driver.findElement(By.xpath("//input[@type='text'] ")).sendKeys("lavkesh");

	}

}
