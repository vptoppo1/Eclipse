package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login");
		
		driver.findElement(By.cssSelector("a[title = \"Go to Facebook home\"]")).click();
		
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("We are back to Facebook homepage");
		}
		
		else {
			System.out.println("We are not in Facebook homepage");
		}
		
		driver.close();

	}

}
