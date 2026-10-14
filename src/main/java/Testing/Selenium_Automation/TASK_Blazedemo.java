package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TASK_Blazedemo {
	private Object field1;

	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		
		WebElement srcountry = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select src = new Select(srcountry);
		src.selectByContainsVisibleText("Paris");
		System.out.println("The destination will paris select ");
		
		Thread.sleep(1000);
		WebElement srcdesountry = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select des = new Select(srcdesountry);
		des.selectByContainsVisibleText("New York");
		System.out.println("The destination will New York select ");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//next page will star 
		driver.findElement(By.xpath("(//input[@type='submit' and @class='btn btn-small'])[2]")).click();
		System.out.println("Button click successfully");

		//Enter the ragistration form Successfully
        driver.findElement(By.id("inputName")).sendKeys("lavkesh");
        driver.findElement(By.id("address")).sendKeys("Jakat naka Ambedkar chowk pune");
        driver.findElement(By.id("city")).sendKeys("Kothrud");
        driver.findElement(By.id("state")).sendKeys("Maharastra");
        driver.findElement(By.id("zipCode")).sendKeys("442201");
        
        
        WebElement card = driver.findElement(By.id("cardType"));
        Select visa = new Select(card);
        visa.selectByVisibleText("American Express");
        
        driver.findElement(By.id("creditCardNumber")).sendKeys("1234-2345-3456");
        //YA madhi pahilech value set karun ahe ithe code madhi tya stahi pahile aplyala te clear();kara lagte tya nantr tya madhi value put kara lagte teva te work akrte.
        WebElement f = driver.findElement(By.id("creditCardMonth"));
        f.clear();
        f.sendKeys("2");
        WebElement f1 =driver.findElement(By.xpath("//input[@id='creditCardYear']"));
        f1.clear();
        f1.sendKeys("2026");
         driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Dongre Lavkesh");
        driver.findElement(By.id("rememberMe")).click();
        
        driver.findElement(By.xpath("//input[@class='btn btn-primary' and @value='Purchase Flight']")).click();
        
        System.out.println("Website Testing complete by the Automation Script ");
       Thread.sleep(4000);
		driver.close();
		
		
		
	}

}
