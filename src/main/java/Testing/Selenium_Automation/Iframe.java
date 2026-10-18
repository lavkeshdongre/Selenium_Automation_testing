package Testing.Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Frames.html");

        // Step 1: Switch to single iframe
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@type='text']"))
              .sendKeys("lavkesh");
        
        System.out.println("Value enter successfully");

        Thread.sleep(1000);

        // Step 2: Return to the main page
        driver.switchTo().defaultContent();
        System.out.println("driver return form the web element");
        

        // Step 3: Click the nested iframe link
        driver.findElement(
            By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")
        ).click();
        System.out.println("Enter in duel field iframe ");

        Thread.sleep(1000);

        // Step 4: Switch to outer iframe
        driver.switchTo().frame(0);
        System.out.println("The driver enter in first field ");

        // Step 5: Switch to inner iframe
        driver.switchTo().frame(0);
        System.out.println("The driver enter in second iframe  field ");

        // Step 6: Enter text into the textbox
        driver.findElement(By.xpath("//input[@type='text']"))
              .sendKeys("Bhimtya");

        Thread.sleep(1000);

        driver.quit();
    }
}