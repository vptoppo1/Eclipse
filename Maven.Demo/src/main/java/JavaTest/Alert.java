package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("897456");
		driver.findElement(By.name("res")).click();
		
		driver.findElement(By.name("cusid")).sendKeys("897456");
		driver.findElement(By.name("submit")).click();
		
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.name("submit")).click();
		
		String message1 = driver.switchTo().alert().getText();
		System.out.println(message1);
		
		driver.switchTo().alert().accept();
		
		String message2 = driver.switchTo().alert().getText();
		System.out.println(message2);
		
		driver.switchTo().alert().accept();	
		
		driver.close();

	}

}
