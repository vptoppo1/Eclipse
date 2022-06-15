package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		String expectedUrl = "https://www.facebook.com/login/";
				
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String t = driver.getTitle();
		
		System.out.println("Title is :" +t);
								
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		String actualUrl = driver.getCurrentUrl();
		
		System.out.println("Current URL :" +actualUrl);
		
		if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
		
	}
}

	