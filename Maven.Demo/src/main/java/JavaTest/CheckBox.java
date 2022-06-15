package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.yahoomail.com/");
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(3000);
		
		WebElement chkPersist = driver.findElement(By.xpath("//*[@id=\"login-username-form\"]/div[3]/div[1]/span/label"));
		for(int i=0; i<6; i++) {
			chkPersist.click();
			
			WebElement a = driver.findElement(By.id("persistent"));
			
			if (a.isSelected()) {
				System.out.println("Checkbox is selected");
			}
			
			else {
				System.out.println("Checkbox is not selected");
			}
			
		}
		
		driver.close();
				
	}

}
