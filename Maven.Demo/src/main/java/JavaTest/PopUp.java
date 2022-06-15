package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jsbin.com/usidix/1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/input")).click();
		
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
