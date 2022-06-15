package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
        Select drpCountry = new Select(driver.findElement(By.name("country")));
		
		drpCountry.selectByVisibleText("BAHAMAS");	
		
		driver.close();

	}

}
