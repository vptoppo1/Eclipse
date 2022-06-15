package JavaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTitle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.facebook.com/";
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = " ";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
				
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
