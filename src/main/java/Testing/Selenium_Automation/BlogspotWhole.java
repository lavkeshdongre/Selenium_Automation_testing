package Testing.Selenium_Automation;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class BlogspotWhole {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.id("name")).sendKeys("lavkesh");

        driver.findElement(By.id("email")).sendKeys("lavkeshdongre66@gmail.com");

        driver.findElement(By.id("phone")).sendKeys("8180935629");

        driver.findElement(By.id("textarea")).sendKeys("At Post sarwadi Dist Wardha");

        driver.findElement(By.xpath("//input[@id='male']")).click();

        List<WebElement> Checkbox = driver.findElements(
                By.xpath("//input[@type='checkbox']"));

        for (int i = 0; i < Checkbox.size(); i++) {

            if (!Checkbox.get(i).isSelected()) {
                Checkbox.get(i).click();
            }

            
        }

        WebElement Country = driver.findElement(By.id("country"));

        Select dropdown = new Select(Country);

        dropdown.selectByIndex(3);

        

        driver.findElement(By.xpath("//option[@value='red']")).click();

        System.out.println("red color is selected");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//option[@value='dog']")).click();

        System.out.println("dog printed");

        Thread.sleep(1000);

        driver.findElement(By.id("datepicker")).click();

        System.out.println("box open");

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

        driver.findElement(By.xpath("//a[normalize-space()='2']")).click();

        Thread.sleep(1000);

        System.out.println("Page 2 is selected");

        List<WebElement> check1 = driver.findElements(
                By.xpath("//table[@id='productTable']//input[@type='checkbox']")
        );

        for (int i = 0; i < check1.size(); i++) {

            if (!check1.get(i).isSelected()) {

                check1.get(i).click();

                System.out.println("Checkbox " + (i + 1) + " is selected");
            }
        }

        System.out.println("All checkboxes on page 2 are selected");

        driver.findElement(By.xpath("//a[normalize-space()='3']")).click();

        Thread.sleep(1000);

        System.out.println("Page 3 is selected");

        List<WebElement> check2 = driver.findElements(
                By.xpath("//table[@id='productTable']//input[@type='checkbox']")
        );

        for (int i = 0; i < check2.size(); i++) {

            if (!check2.get(i).isSelected()) {

                check2.get(i).click();

                System.out.println("Checkbox " + (i + 1) + " is selected");
            }
        }

        System.out.println("All checkboxes on page 3 are selected");

        driver.findElement(By.xpath("//a[normalize-space()='4']")).click();

        System.out.println("Page 4 is selected");

        List<WebElement> check3 = driver.findElements(
                By.xpath("//table[@id='productTable']//input[@type='checkbox']")
        );

        for (int i = 0; i < check3.size(); i++) {

            if (!check3.get(i).isSelected()) {

                check3.get(i).click();

                System.out.println("Checkbox " + (i + 1) + " is selected");

            }
        }

        System.out.println("All checkboxes on page 4 are selected");

        driver.findElement(By.id("apple")).click();

        driver.navigate().back();

        driver.findElement(By.id("lenovo")).click();

        driver.navigate().back();

        driver.findElement(By.id("dell")).click();

        driver.navigate().back();

        List<WebElement> Errorlink1 = driver.findElements(By.className("link"));

        for (int i = 0; i < Errorlink1.size(); i++) {

            WebElement l = Errorlink1.get(i);

            System.out.println(l.getText());

        }

        driver.findElement(By.name("input1")).sendKeys("Hello my name is lavkesh ");

        driver.findElement(By.id("btn1")).click();

        Thread.sleep(1000);

        driver.findElement(By.name("input2")).sendKeys("i am from wardha  ");

        driver.findElement(By.id("btn2")).click();

        driver.findElement(By.name("input3")).sendKeys("currently leaving at the karve nagar pune  ");

        driver.findElement(By.id("btn3")).click();
        driver.findElement(By.linkText("Blog")).click();
        driver.navigate().back();

       Thread.sleep(6000);
       driver.findElement(By.xpath("//*[@id='shadow_host']//input[1]")).sendKeys("youtube");

        driver.findElement(By.xpath("//*[@id='shadow_host']//input[3]")).sendKeys("C:\\Users\\HP\\Downloads\\Lavkesh_Dongre_8180935629_testing.docx");

        System.out.println("file Selected successfully");
        
       

        driver.findElement(By.xpath("//*[@id=\"shadow_host\"]//input[2]")).click();
        System.out.println("Checkbox is selected ");

        Thread.sleep(1000);
        
        
        
        //Whole page tested this time to test the right side of the page 
        
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("tablet");
        
         driver.findElement(By.cssSelector("button[name='start'][onclick='toggleButton(this)']")).click();
        
        Thread.sleep(2000);
        
        //Alert interface 

		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(1000);
		
		Alert al = driver.switchTo().alert();
		
		System.out.println("The Alter text is :-"+ al.getText());
		al.accept();
		
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(1000);
		Alert al1 =driver.switchTo().alert();
		al1.dismiss();
		
		Thread.sleep(1000);
	    driver.findElement(By.id("promptBtn")).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().sendKeys("lavkesh");
	    Thread.sleep(1000);
	   driver.switchTo().alert().accept();
	   Thread.sleep(1000);
	    
		WebElement pointmebutn=driver.findElement(By.xpath("//button[text()='Point Me']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(pointmebutn).build().perform();
		Thread.sleep(1000);
	
	     WebElement doubleclick= driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
	     
	     Actions clickActions = new Actions(driver);
	     clickActions.doubleClick();
	     
	     Thread.sleep(2000);
			
			
			//drag
			WebElement drag = driver.findElement(By.id("draggable"));
			Thread.sleep(1000);
			
			//drop
			WebElement drop = driver.findElement(By.id("droppable"));
			
			// action
			
			Actions act=new Actions(driver);
			
			act.dragAndDrop(drag, drop).build().perform();
			
			Thread.sleep(1000);
			//slider
			WebElement leftslider= driver.findElement(By.xpath("//span[@style='left: 15%;']"));
			
			Actions a =new Actions(driver);
			
			a.dragAndDropBy(leftslider,80,0).build().perform();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='comboBox']")).click();

			driver.findElement(By.xpath("//*[@id=\"dropdown\"]/div[2]")).click();
			
			Thread.sleep(1000);
			
			//upload single file 
			
			driver.findElement(By.xpath("//*[@id='singleFileInput']")).sendKeys("C:\\Users\\HP\\Downloads\\Lavkesh_Dongre_8180935629_testing.docx");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"singleFileForm\"]/button")).click();
			
			Thread.sleep(1000);
			WebElement file1=driver.findElement(By.xpath("//*[@id=\"multipleFilesInput\"]"));
			file1.sendKeys("C:\\Users\\HP\\Downloads\\Lavkesh_Dongre_8180935629_testing.docx");
			file1.sendKeys("C:\\\\Users\\\\HP\\\\Downloads\\\\Lavkesh_Dongre_8180935629_testing.docx");
			
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"multipleFilesForm\"]/button")).click();
			
			driver.findElement(By.xpath("//*[@id='PageList1']/div/ul/li[1]")).click();
			
			
			driver.findElement(By.xpath("//*[@id='PageList1']/div/ul/li[2]/a")).click();
			
			
			driver.findElement(By.xpath("//*[@id='PageList1']/div/ul/li[3]")).click();
			
			
			
	     

        //driver.quit();

        

    }

}