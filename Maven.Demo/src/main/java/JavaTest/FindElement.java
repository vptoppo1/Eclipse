package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElement {
	
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.officedepot.com/";
		String tagName = " ";
		
		driver.get(baseUrl);
		tagName = driver.findElement(By.id("Header")).getTagName();
		System.out.println(tagName);
		driver.close();
		System.exit(0);
		
	}

}
