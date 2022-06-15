package Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Syfe_test {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "https://uat-qa-1.nonprod.syfe.com/";
        driver.manage().window().maximize();
        
        driver.get(baseUrl);
        
        Thread.sleep(7000);
        
        String URL = driver.getCurrentUrl();
        
        System.out.println(URL);
        
        //Assert.assertEquals(URL, "https://uat-qa-1.nonprod.syfe.com/" );
        
        //Thread.sleep(7000);
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
       WebElement tabMore = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#syfe-header > div.container.header__container > nav > div.header-nav-menu > div > ul > li:nth-child(6) > span")));
      
             
              // WebElement tabMore = driver.findElement(By.linkText("More"));
        tabMore.isDisplayed();
        
        Actions actions = new Actions(driver);
        
               
        actions.clickAndHold(tabMore);
        
        Thread.sleep(2000);

        WebElement tabFAQ = driver.findElement(By.xpath("//a/h6[contains(@class,'mdc-typography mdc-typography--subtitle1 subtitle1 subtitle1--primary header-dropdown__title') and contains(text(),'FAQs')]"));
        
        actions.clickAndHold(tabFAQ);
        
        Thread.sleep(2000);
        
        tabFAQ.click();
        
        driver.close();
        System.exit(0);
         
        
}}