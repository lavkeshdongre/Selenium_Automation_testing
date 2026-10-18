package Testing.Selenium_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoremaining {

    

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.xpath("//option[@value='red']")).click();

        System.out.println("red color is selected");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//option[@value='dog']")).click();
        System.out.println("dog printed");
        Thread.sleep(1000);

        driver.findElement(By.id("datepicker")).click();
        System.out.println("box open");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a[data-date='17']")).click();
        System.out.println("date selected");

        Thread.sleep(1000);

        driver.findElement(By.name("SelectedDate")).click();

        driver.findElement(By.cssSelector("a[data-date='18']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("start-date")).sendKeys("11");
        driver.findElement(By.id("start-date")).sendKeys("12");
        driver.findElement(By.id("start-date")).sendKeys("2004");

        System.out.println("button click successfully ");
        Thread.sleep(1000);

        driver.findElement(By.id("end-date")).sendKeys("1");
        driver.findElement(By.id("end-date")).sendKeys("1");

        Thread.sleep(1000);

        driver.findElement(By.id("end-date")).sendKeys("2005");

        System.out.println("Second box selected successfully");

        driver.findElement(By.className("submit-btn")).click();

        Thread.sleep(1000);

        List<WebElement> check = driver.findElements(
                By.xpath("//table[@id='productTable']//input[@type='checkbox']")
        );

        for (int i = 0; i < check.size(); i++) {

            if (!check.get(i).isSelected()) {

                check.get(i).click();

            }
        }

        // Step 1: Click on page number 2
        driver.findElement(By.xpath("//a[normalize-space()='2']")).click();

        Thread.sleep(1000);

        System.out.println("Page 2 is selected");

        // Step 2: Find all checkboxes on the current page
        List<WebElement> check1 = driver.findElements(
                By.xpath("//table[@id='productTable']//input[@type='checkbox']")
        );

        // Step 3: Select all checkboxes using normal for loop
        for (int i = 0; i < check1.size(); i++) {

            if (!check1.get(i).isSelected()) {

                check1.get(i).click();

                System.out.println("Checkbox " + (i + 1) + " is selected");
            }
        }

        System.out.println("All checkboxes on page 2 are selected");

        // 3 button
        driver.findElement(By.xpath("//a[normalize-space()='3']")).click();

        Thread.sleep(1000);

        System.out.println("Page 3 is selected");

        // Step 2: Find all checkboxes on the current page
        List<WebElement> check2 = driver.findElements(
                By.xpath("//table[@id='productTable']//input[@type='checkbox']")
        );

        // Step 3: Select all checkboxes using normal for loop
        for (int i = 0; i < check2.size(); i++) {

            if (!check2.get(i).isSelected()) {

                check2.get(i).click();

                System.out.println("Checkbox " + (i + 1) + " is selected");
            }
        }

        System.out.println("All checkboxes on page 3 are selected");

        // 4 button
        driver.findElement(By.xpath("//a[normalize-space()='4']")).click();

      //  Thread.sleep(1000);

        System.out.println("Page 4 is selected");

        // Step 2: Find all checkboxes on the current page
        List<WebElement> check3 = driver.findElements(
                By.xpath("//table[@id='productTable']//input[@type='checkbox']")
        );

        // Step 3: Select all checkboxes using normal for loop
        for (int i = 0; i < check3.size(); i++) {

            if (!check3.get(i).isSelected()) {

                check3.get(i).click();

            //    Thread.sleep(1000);

                System.out.println("Checkbox " + (i + 1) + " is selected");
            }
        }

        System.out.println("All checkboxes on page 4 are selected");

        driver.findElement(By.id("apple")).click();

//        Thread.sleep(1000);

        driver.navigate().back();

  //      Thread.sleep(1000);

        driver.findElement(By.id("lenovo")).click();

    //    Thread.sleep(1000);

        driver.navigate().back();

      //  Thread.sleep(1000);

        driver.findElement(By.id("dell")).click();

        //Thread.sleep(1000);

        driver.navigate().back();
        
       
        
        List<WebElement> Errorlink1 = driver.findElements(By.className("link"));

        for (int i = 0; i < Errorlink1.size(); i++) {

            WebElement l = Errorlink1.get(i);

            System.out.println(l.getText());

           // Thread.sleep(1000);
        }
        
        //footer Section
        
        driver.findElement(By.name("input1")).sendKeys("Hello my name is lavkesh ");
        driver.findElement(By.id("btn1")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.name("input2")).sendKeys("i am from wardha  ");
        driver.findElement(By.id("btn2")).click();
        
        driver.findElement(By.name("input3")).sendKeys("currently leaving at the karve nagar pune  ");
        driver.findElement(By.id("btn3")).click();
        
        
        WebElement file = driver.findElement(By.cssSelector("input[type='file']"));
        file.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Lavkesh Dongare Joining letter - signed.pdf");
        
        Thread.sleep(6000);
        
        
        
        driver.quit();
        driver.close();

    }
}