package Testing.Selenium_Automation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {
	public static void main (String []args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement pointmebutn=driver.findElement(By.xpath("//button[text()='Point Me']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(pointmebutn).build().perform();
		
		
		}
}
