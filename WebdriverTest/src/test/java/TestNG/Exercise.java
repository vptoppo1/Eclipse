package TestNG;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.util.Iterator;
import java.util.Set;


public class Exercise{
	
	  public static void main(String [] args) throws Exception {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		  
		  driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[1]/a")).click();
		  
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("C:\\Users\\Vishal\\eclipse-workspace\\ScreenShots\\06-05-21.jpg"));
		  
	  }
}