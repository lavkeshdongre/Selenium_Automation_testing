package Testing.Selenium_Automation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
	
	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		
		d.get("https://testautomationpractice.blogspot.com/");
		
		//drag
		WebElement drag = d.findElement(By.id("draggable"));
		Thread.sleep(1000);
		
		//drop
		WebElement drop = d.findElement(By.id("droppable"));
		
		//actionclass
		
		Actions ac=new Actions(d);
		
		ac.dragAndDrop(drag, drop).build().perform();
		
	}

}
