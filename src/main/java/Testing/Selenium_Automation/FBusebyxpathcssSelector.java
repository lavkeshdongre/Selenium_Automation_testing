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
		
		driver.findElement(By.cssSelector("input[aria-label='Select day']")).click();
		
		driver.close();
		
	}

}
