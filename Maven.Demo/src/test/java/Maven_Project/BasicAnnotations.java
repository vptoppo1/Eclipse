package Maven_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BasicAnnotations {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe";
    public WebDriver driver ; 
     
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
          driver.get(baseUrl);
      }
      @Test
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }
}