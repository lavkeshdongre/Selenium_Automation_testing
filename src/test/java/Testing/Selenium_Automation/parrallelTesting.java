package Testing.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parrallelTesting {
	ChromeDriver driver;
	@Test
    public void test1() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=1Y6knVutUsI");
		
		Thread.sleep(3000);
    	System.out.println("This is first method " + Thread.currentThread().getId());
    	driver.quit();
    }
    
	@Test
    public void test2() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.canva.in/");
		Thread.sleep(2000);
    	System.out.println("This is second method " + Thread.currentThread().getId());
    	driver.quit();
	
    }
}
