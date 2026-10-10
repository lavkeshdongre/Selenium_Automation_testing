package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cssselector {
	
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("lavkesh");
		
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("lavkesh@123gmail.com");
		
    	driver.findElement(By.cssSelector("input.form-control")).sendKeys("8180935629");
		
	//	driver.findElement(By.xpath("//div/textarea")).sendKeys("At post sarwadi taluka karanja ghadge");
		
	//	driver.findElement(By.xpath("//input[@id='male']")).click();
    	
    	//some important drowdown 
    	
    	Select sel = new Select(driver.findElement(By.id("country")));
    	sel.selectByVisibleText("India");
    	Thread.sleep(1000);
    	
    	sel.selectByIndex(0);
    	Thread.sleep(1000);
    	
    	
    	sel.selectByvalue()

	}

}
