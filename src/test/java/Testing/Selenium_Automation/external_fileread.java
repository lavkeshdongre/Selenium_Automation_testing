package Testing.Selenium_Automation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class external_fileread {
	@Test
	public void filereadtest() throws IOException {
		
		FileReader fr = new FileReader("D:\\lavkesh_Automation_testing\\Selenium_Automation\\base.properties");
		
		Properties pr = new Properties();
		pr.load(fr);
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get(pr.getProperty("cravita"));
		driver.close();
	}

}
