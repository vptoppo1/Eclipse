package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.officedepot.com/");
	    
	    Thread.sleep(3000);
	    WebElement services = driver.findElement(By.xpath("//*[@id=\"Header\"]/div/header/div[1]/div/div[2]/nav/div[2]/a/div[1]/span/span"));
	    
	    
	    Actions builder = new Actions(driver);
	    Action mouseOverHome = builder.moveToElement(services).build();
	    mouseOverHome.perform();
	    
	    
	    
	}
	
}
	
	
	
	