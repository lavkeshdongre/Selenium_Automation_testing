import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Swaglablogintest {
  @Test(dataProvider = "data")
  public void verify_login(String n, String s) {
	  ChromeDriver driver = new ChromeDriver();
      driver  = new ChromeDriver();
	  
	   driver.manage().window().maximize();
	  
	  driver.get("https://www.saucedemo.com/");
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(n);
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(s);
	  
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] { "performance_glitch_user", "secret_sauce" },
      new Object[] { "error_user", "secret_sauce" },
      new Object[] { "standard_user", "secret_sauce" },
    };
  }
}
