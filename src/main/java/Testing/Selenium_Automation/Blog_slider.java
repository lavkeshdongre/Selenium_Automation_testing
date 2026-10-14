package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Blog_slider {
	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//left slider
		
		WebElement leftslider= driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		
		Actions a =new Actions(driver);
		
		a.dragAndDropBy(leftslider,80,0).build().perform();
		Thread.sleep(1000);
		
		//Right slider
		WebElement rightslider= driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		Actions a1 = new Actions(driver);
		
		a1.dragAndDropBy(rightslider,-80,0);
		Thread.sleep(3000);
		
		driver.close();

	}

}
