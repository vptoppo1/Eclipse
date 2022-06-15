package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/social-icon.html");
		String expectedTooltip = "Github";
		
		String actualTooltip = driver.findElement(By.className("github")).getAttribute("Title");
		System.out.println("Actual tooltip is - " +actualTooltip);
		
		if(actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test case passed");
		}
		
		driver.close();
	}

}
