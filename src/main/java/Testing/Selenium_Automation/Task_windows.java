package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_windows {
	public static void main(String[]args) throws InterruptedException {
	ChromeDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	WebElement click = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
	
	Actions ac = new Actions(driver);
	
	ac.moveToElement(click).doubleClick().build().perform();
	
	
	WebElement newtab = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	//Actions ac1 = new Actions(driver);
	
	ac.moveToElement(newtab).click().perform();
	System.out.println("the current url of this page is :-" + driver.getCurrentUrl()); 
	Thread.sleep(3000);
	
	driver.navigate().back();
	
	driver.close();
	
	
	
	
	
	
	
	
	
	}
}


