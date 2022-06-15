package JavaTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	public static void main(String [] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/how-to-take-screenshot-with-selenium-webdriver");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Vishal\\eclipse-workspace\\ScreenShots\\test.jpg"));
		
		System.out.println("Screenshot printed on desired location");
		driver.close();
		
	}

}
