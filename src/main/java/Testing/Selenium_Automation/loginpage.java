package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
    
	static ChromeDriver driver;
	public static void main(String[] args) {
		loginpage obj = new loginpage();
		obj.launch();
		entercredential();
		

	}
	
	void launch() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.automationtesting.in/SignIn.html");
	}
	
	static void entercredential() {
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("lavkesh@123");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("lavkesh@123");
	}
 
    static void pressbutton() {}
}
