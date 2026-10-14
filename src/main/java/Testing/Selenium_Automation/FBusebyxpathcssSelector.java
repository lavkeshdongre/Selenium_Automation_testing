package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBusebyxpathcssSelector {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/?lang=en");
		
		driver.findElement(By.xpath("//input[@id='_R_1cl2p4jikacppb6amH1_']")).sendKeys("Lavkesh");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='_R_1kl2p4jikacppb6amH1_']")).sendKeys("Dongre");
		Thread.sleep(1000);
		
		 //this is for the dropdown option 
	    Select sel = new Select(driver.findElement(By.id("country")));
	    
	    sel.selectByVisibleText("India");
	    Thread.sleep(1000);
	    sel.selectByIndex(3);
	    Thread.sleep(1000);
	    sel.selectByValue("china");
	    Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='_r_15_']")).sendKeys("8180935629");
		Thread.sleep(1000);
	
		driver.close();
		
	}

}
