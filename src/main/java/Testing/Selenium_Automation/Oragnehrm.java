package Testing.Selenium_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Oragnehrm {
	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit wait;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		
		//explicit wait 
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		WebElement loginbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));
		loginbtn.click();
		
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		driver.close();
	}
}