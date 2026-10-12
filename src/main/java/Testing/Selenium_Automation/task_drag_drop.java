package Testing.Selenium_Automation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class task_drag_drop {
	public static void main(String[]args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		
		
		WebElement drop = driver.findElement(By.id("droparea"));
		Thread.sleep(1000);
		Actions ac = new Actions(driver);
		
		//1element:-
		WebElement drag1= driver.findElement(By.id("angular"));
		ac.dragAndDrop(drag1, drop).perform();
		Thread.sleep(1000);
		
		//2.Element:-
		WebElement drag2=driver.findElement(By.id("mongo"));
		ac.dragAndDrop(drag2, drop).perform();
		Thread.sleep(1000);
		
		//3.element:-
		WebElement drag3=driver.findElement(By.id("node"));
		ac.dragAndDrop(drag3, drop).perform();
		Thread.sleep(1000);
		System.out.println("All logo drag and drop will be successfully");
		driver.close();
	}
}
