package Testing.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class basic_method {
 public static void main(String[] args) throws InterruptedException {
	 ChromiumDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 //launch Sgbau
	 driver.get("https://sgbau.ac.in/");
	 Thread.sleep(1000);
	 
	 driver.navigate().to("https://www.fortunecloudindia.com/");
	 Thread.sleep(1000);
	 
	 driver.navigate().back();
	 Thread.sleep(1000);
	 
	 driver.navigate().forward();
	 Thread.sleep(1000);
	 
	 driver.navigate().refresh();
	 Thread.sleep(1000);
 }
}
