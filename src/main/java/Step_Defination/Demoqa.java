package Step_Defination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demoqa {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Given("user should be on browser")
	public void launch() {
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		System.out.println("LAunch Browser successfully");
	}
	@When("enter valid data")
	public void  fname() throws InterruptedException {
		
		
		driver.findElement(By.id("firstName")).sendKeys("lavkesh");
		driver.findElement(By.id("lastName")).sendKeys("Dongre");
		driver.findElement(By.id("userEmail")).sendKeys("lav@123");
		
		//gender Section
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8180935629");
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select dateyr = new Select(year);
		
		dateyr.selectByVisibleText("2004");
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select datemon = new Select(month);
		
		datemon.selectByVisibleText("March");
		
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--024']")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[2]")).sendKeys("Software Testing");
		// Subjects
		WebElement subject = driver.findElement(By.id("subjectsInput"));

		subject.sendKeys("Maths");

		subject.sendKeys(Keys.ARROW_DOWN);

		subject.sendKeys(Keys.ENTER);
		subject.sendKeys("Hindi");
		subject.sendKeys(Keys.ARROW_DOWN);
		subject.sendKeys(Keys.ENTER);
		List<WebElement> Checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i =0;i<Checkbox.size();i++) {
			Checkbox.get(i).click();
		}
		Thread.sleep(1000);
		
		//WebElement upload = driver.findElement(By.id("uploadPicture"));

		//upload.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Passportphoto.jpeg");
		
		WebElement upload = driver.findElement(By.id("uploadPicture"));

		upload.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Passportphoto.jpeg");
		System.out.println(upload.getAttribute("value"));
    
	    WebElement Add =  driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
	   Add.sendKeys("At.post sarwadi Karanja [ghedge] Dist Wardha");
		
//		WebElement state = driver.findElement(By.id("react-select-3-input"));
//		Select State = new Select(state);
//		State.selectByIndex(2);
	   
//	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	   WebElement submit = wait.until(
//	       ExpectedConditions.elementToBeClickable(By.id("submit"))
//	   );
//
//	   submit.click();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	   WebElement submit = wait.until(
	       ExpectedConditions.visibilityOfElementLocated(By.id("submit"))
	   );

	   ((JavascriptExecutor) driver).executeScript(
	       "arguments[0].scrollIntoView({block:'center'});", submit
	   );

	   wait.until(ExpectedConditions.elementToBeClickable(By.id("submit"))).click();
		
		System.out.println("Data inserted in feild successfully");
		
		
		
	}
	@Then("After data insert on the page  successfully added in the feild")
	public void complete() {
		System.out.println(driver.getCurrentUrl());
	}

}
