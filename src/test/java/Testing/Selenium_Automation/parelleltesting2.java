package Testing.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parelleltesting2 {
	@Test
	public void checksecond() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://saveclip.app/en8");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
