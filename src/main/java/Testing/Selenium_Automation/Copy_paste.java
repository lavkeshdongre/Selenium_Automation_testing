package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_paste {
 
	public static void main (String []args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement search = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		
		search.sendKeys("Mobile");
		
		//enter this keys is predefine in the for the keyboard control
		search.sendKeys(Keys.ENTER);
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		//select the field
		WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Firstname.sendKeys("lavkesh");
		
		//select the text
		Firstname.sendKeys(Keys.CONTROL+"A");
		 
		//copy the text
		Firstname.sendKeys(Keys.CONTROL+"C");
		
		
		//paste name 
		WebElement Lastname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		Lastname.sendKeys(Keys.CONTROL+"V");
		
		Thread.sleep(1000);
		
		
	}
	
}
