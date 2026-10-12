package Testing.Selenium_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_interface {
	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		
		
		d.findElement(By.id("alertBtn")).click();
		Thread.sleep(1000);
		
		Alert al = d.switchTo().alert();
		
		System.out.println("The Alter text is :-"+ al.getText());
		al.accept();
		
		d.findElement(By.id("confirmBtn")).click();
		Thread.sleep(1000);
		Alert al1 =d.switchTo().alert();
		al1.dismiss();
		
		Thread.sleep(1000);
	    d.findElement(By.id("promptBtn")).click();
	    Thread.sleep(1000);
	    d.switchTo().alert().sendKeys("lavkesh");
	    Thread.sleep(1000);
	   d.switchTo().alert().accept();
	   Thread.sleep(1000);
	}
}
