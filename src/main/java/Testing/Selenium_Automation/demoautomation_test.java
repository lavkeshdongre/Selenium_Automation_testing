package Testing.Selenium_Automation;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoautomation_test {
	public static void main(String[]args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		//1.tagname[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Lavkesh");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Dongre");
		
		driver.findElement(By.cssSelector("textarea[rows='3']")).sendKeys("Pune");
		//2.xpath=tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("lavkeshdongre66@gmail.com");
		
		//3.xpath:-//tagname[attribute='value']
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8180935629");
		
		
		//4.name
		
		driver.findElement(By.name("radiooptions")).click();
		
		//id loctor used By.id("value")
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		
		
		//drop down arrow>
		
		
		//driver.findElement(By.id("msdd")).click();
		
	//	driver.findElement(By.xpath("//a[normalize-space()='English']")).click();
		//driver.findElement(By.xpath("//a[text()='Catalan']")).click();
		//Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//select[@id='Skills']")).click();
		 WebElement Skills = driver.findElement(By.id("Skills"));

	     Select s = new Select(Skills);

	     s.selectByVisibleText("Analytics");
	        
	        
	    Thread.sleep(1000);
	      
	    Select selC = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
		selC.selectByVisibleText("Select Country");
		
		
		//select Country field
		driver.findElement(By.xpath("//span[contains(@class,'select2-selection--single')]")).click();
		Select se = new Select(driver.findElement(By.xpath("//select[@id='country']")));
	    se.selectByValue("India");
		driver.findElement(By.xpath("//span[contains(@class,'select2-selection--single')]")).click();
		
	        
		       
		//ACCESSING DOB FIELDS
		Select dobYear = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		dobYear.selectByVisibleText("2004");
				
		Select dobMonth = new Select(driver.findElement(By.xpath("//select[@Placeholder='Month']")));
		dobMonth.selectByVisibleText("January");
				
		Select dobDate = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
		dobDate.selectByVisibleText("24");
		        
		
		
		
		driver.close();
		
		
	    	
	    }
	}


