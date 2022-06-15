package TestNG;

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {		
		
		    public String baseUrl = "http://demo.guru99.com/test/guru99home/";
		    String driverPath = "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe";
	        public WebDriver driver;
	        
			@Test				
			public void testEasy() {	
				driver.get("http://demo.guru99.com/test/guru99home/");  
				String title = driver.getTitle();				 
				Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
			}	
			
			@BeforeTest
			public void beforeTest() {	
				System.out.println("launching chrome browser"); 
		        System.setProperty("webdriver.chrome.driver", driverPath);
		        driver = new ChromeDriver();
		        driver.get(baseUrl);  
			}		
			
			@AfterTest
			public void afterTest() {
				driver.close();			
			}		
	}	