package Testing.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	ChromeDriver driver;
	EdgeDriver d;
	
	@Test
	public void test() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://claude.ai/new");
	  
	  Thread.sleep(3000);
	  driver.quit();
	}
}
