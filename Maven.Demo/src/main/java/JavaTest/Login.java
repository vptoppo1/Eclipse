package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
	
	public static void main(String [] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.get("https:\\www.facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("vtoppo@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Tester123");
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.xpath("//div[@id='mount_0_0']/div/div/div/div[2]/div[4]/div/span/div/div/i")).click();	
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@class = 'qzhwtbm6 knvmm38d']//*[text() = 'Log Out']")).click();
	
	driver.close();
	
	}
	
}
