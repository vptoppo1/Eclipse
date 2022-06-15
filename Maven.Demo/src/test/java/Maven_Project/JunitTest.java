package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class JunitTest {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "https://uat-qa-1.nonprod.syfe.com/";
        driver.manage().window().maximize();
        
       String HeaderActual = "";
       String HeaderExpected = "Sign up for News & Updates";
        
        driver.get(baseUrl);
        HeaderActual = driver.findElement(By.xpath("//p[contains(text(),'Sign up for News')]")).getText();
        
        System.out.println(HeaderActual);
        
      
		if (HeaderExpected.equals(HeaderActual)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are NOT equal");
		}
	
        
        
        
        WebElement email = driver.findElement(By.xpath("//*[@name='email' ]"));
        
        email.sendKeys("abcd.1234@yopmail.com");
        
               
        
        
        Thread.sleep(3000);
        
        WebElement submit = driver.findElement(By.xpath("//button/span[contains(text(),'Signup')]"));
        
        submit.click();
        
        Thread.sleep(6000);
        
        String message = "";

         message = driver.findElement(By.xpath("//span[contains(@class,'mdc-typography mdc-typography--caption caption caption--primary ') and contains(text(),'Thanks! You have signed up')]")).getText();
           
        
      		String msgExpected = "Thanks! You have signed up";
      		
      		System.out.println(message);
      		
      		if (msgExpected.equals(message)) {
    			System.out.println("Strings are equal");
    		} else {
    			System.out.println("Strings are NOT equal");
    		}
    	
        driver.close();
        System.exit(0);
        
        
	}

}
