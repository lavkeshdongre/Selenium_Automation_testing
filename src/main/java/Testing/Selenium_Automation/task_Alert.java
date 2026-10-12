package Testing.Selenium_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_Alert {
	public static void main(String[]args) throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html#google_vignette");
		
		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert al = driver.switchTo().alert();
		System.out.println("After chick on gthe text box :-" + al.getText());
		al.accept();
		Thread.sleep(1000);
		
		//it is for the accept
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert al1 = driver.switchTo().alert();
		System.out.println("After chick on gthe text box :-" + al1.getText());
		Thread.sleep(1000);
		al1.accept();
		
		//it is for the reject
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert al2 = driver.switchTo().alert();
		System.out.println("After chick on gthe text box :-" + al2.getText());
		Thread.sleep(1000);
		al2.dismiss();
		
		//third alert
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert al3 = driver.switchTo().alert();
		al3.sendKeys("lavkesh");
		Thread.sleep(1000);
		al3.accept();
		Thread.sleep(2000);
		
		System.out.println("Alert button successfully tested ");
		
		driver.close();
	}

}
