package Testing.Selenium_Automation;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class newtab_newwindow {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.fortunecloudindia.com/");
		System.out.println("URL of page :- " + driver.getCurrentUrl());
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://www.cravitaindia.com/");
		System.out.println("URL of page :- " + driver.getCurrentUrl());
		
		driver.close();
		
		EdgeDriver driver1= new EdgeDriver();
		
		driver1.get("https://mauligroup.org/");
		System.out.println("Current url of the page "+ driver1.getCurrentUrl());
		Thread.sleep(1000);
		driver1.switchTo().newWindow(WindowType.TAB);
		driver1.navigate().to("https://sgbau.ucanapply.com/");
		System.out.println("Current url of the page "+ driver1.getPageSource());
		
		driver.quit();
		driver1.quit();
		driver1.close();
	}

}
