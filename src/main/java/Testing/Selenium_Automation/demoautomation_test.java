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
		//driver.findElement(By.linkText("Hindi")).click();
		
		//driver.findElement(By.xpath("//select[@id='Skills']")).click();
		  WebElement Skills = driver.findElement(By.id("Skills"));

	      Select s = new Select(Skills);

	        s.selectByVisibleText("Analytics");
	        
	        
	        Thread.sleep(1000);
	      
	     WebElement country = driver.findElement(By.id("select2-country-results"));
	     Select c = new Select(country);
	     
	     c.selectByIndex(2);
	        
		       
	      
		        
		
		
		
		driver.close();
		
		
	    	
	    }
	}


