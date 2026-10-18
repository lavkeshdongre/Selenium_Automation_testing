package Testing.Selenium_Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

    public static void main(String[] args) throws IOException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/");

        // Take screenshot
        File src = driver.getScreenshotAs(OutputType.FILE);

        // Destination path
        File des = new File(
            "D:\\lavkesh_Automation_testing\\Selenium_Automation\\screenshot.png"
        );

        // Copy screenshot to destination
        FileHandler.copy(src, des);

        System.out.println("Screenshot saved successfully!");

        driver.quit();
    }
}