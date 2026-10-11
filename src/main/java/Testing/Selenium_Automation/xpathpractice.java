package Testing.Selenium_Automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathpractice {
public static void main(String[]args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("lavkesh");
	
	driver.findElement(By.xpath("//input[@id='email' and @placeholder='Enter EMail']")).sendKeys("lavkesh@123gmail.com");
	
	driver.findElement(By.xpath("//input[@id='phone' and @placeholder='Enter Phone']")).sendKeys("8180935629");
	
	driver.findElement(By.xpath("//div/textarea")).sendKeys("At post sarwadi taluka karanja ghadge");
	
	driver.findElement(By.xpath("//input[@id='male']")).click();
	
	
	//handling multiple webelement
	
  List <WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input']"));
  
    Iterator<WebElement> it=checkboxes.iterator();
    
    while(it.hasNext()) {
    	WebElement Check=it.next();
    	Check.click();
    	Thread.sleep(1000);
    	
    	
    }
    
    
    //this is for the dropdown option 
    Select sel = new Select(driver.findElement(By.id("country")));
    
    sel.selectByVisibleText("India");
    Thread.sleep(1000);
    sel.selectByIndex(3);
    Thread.sleep(1000);
    sel.selectByValue("china");
    Thread.sleep(1000);
    
    
    
    
    driver.findElement(By.xpath("//option[@value='red']")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//option[@value='deer']")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//a[@data-date='13' and @id='datepicker']")).click();
    Thread.sleep(1000);
    driver.close();
    
    
    
   
	
	
}

}
