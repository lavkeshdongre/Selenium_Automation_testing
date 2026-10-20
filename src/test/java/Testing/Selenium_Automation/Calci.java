package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Calci {
	ChromeDriver driver;
	@BeforeSuite
	public void launchBrowser() {
		driver  = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.calculator.net/");
		}


    @Parameters({"num1","num2"})
    @Test
    public void add(int  num1,int num2) throws InterruptedException{
    	
    	driver.findElement(By.xpath("//span[@onclick='r(" + num1 + ")']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@onclick='r(" + num2 + ")']")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
	    Thread.sleep(3000);
	    System.out.println("Additon perform");
	    
   }
    
    @Parameters({"num3","num4"})
    @Test
    public void sub(int num3,int num4) throws InterruptedException {
    	driver.findElement(By.xpath("//span[@onclick='r(" + num3 + ")']")).click();
    	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
	     driver.findElement(By.xpath("//span[@onclick='r(" + num4 + ")']")).click();
	    
	    driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
	    System.out.println("Subtraction done!");
	    Thread.sleep(1000);
    }
 
 }

