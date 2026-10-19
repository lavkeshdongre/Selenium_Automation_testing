package Testing.Selenium_Automation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("this is before suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is after suite");
	}
    @BeforeClass
    

    @BeforeMethod
    public void setup() {
        System.out.println("Before Method: Browser Open");
    }

    @Test
    public void loginTest() {
        System.out.println("Login Test Executed");
    }

    @Test
    public void logoutTest() {
        System.out.println("Logout Test Executed");
    }

    @AfterMethod
    public void teardown() {
        System.out.println("After Method: Browser Close");
    }
}