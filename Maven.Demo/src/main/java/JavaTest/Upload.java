package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Vishal\\Pictures\\2005-01\\IMG_3718.JPG");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
		String message = driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
		System.out.println(message);
				
	}
	
}
	
