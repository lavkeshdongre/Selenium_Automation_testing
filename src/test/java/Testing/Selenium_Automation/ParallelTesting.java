package Testing.Selenium_Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	ChromeDriver driver;
	EdgeDriver d;
	
	
	@Test
	public void test1() throws InterruptedException {
		
		System.out.println("This is 1st block " + Thread.currentThread().getId() );	
		
		}
	@Test
	public void test2() throws InterruptedException {
	
		System.out.println("This is 2nd Block"+ Thread.currentThread().getId());
	}
	@Test
	public void test3() throws InterruptedException {
	
		System.out.println("This is 3nd Block"+ Thread.currentThread().getId());
	}

}
