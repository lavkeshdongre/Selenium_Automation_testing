package Testing.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {
public static void main(String []args) throws InterruptedException {
	
	//1.set the propertioes of webdriver
	System.setProperty("webdriver.chorme.driver","D:\\lavkesh_Automation_testing\\Selenium_Automation\\DriverResources\\chromedriver.exe");
	
	System.out.println("1.Webdriver configuration");
	
	//create the object of the chrome driver .
	ChromeDriver driver =new ChromeDriver();
	
	System.out.println("2.initailize chromedriver");
	
	driver.get("https://www.cravitaindia.com/");
	
	Thread.sleep(4000);
	
	driver.close();
	
	System.out.println("visit website successfully");
	
	
}
}

