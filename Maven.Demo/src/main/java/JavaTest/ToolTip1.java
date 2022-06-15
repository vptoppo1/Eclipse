package JavaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ToolTip1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String expectedTooltip = "What's new in 3.2";
		driver.get("http://demo.guru99.com/test/tooltip.html");
				
		WebElement download = driver.findElement(By.id("download_now"));
		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(download).build();
	    mouseOverHome.perform();
	    
	    WebElement toolTipText = driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/table/tbody"));
        String allText = toolTipText.getText();
        System.out.println("All text in tooltip - " + '\n' +allText);
        System.out.println("---------------------------------------");
	    
	    WebElement toolTipElement = driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div/div/a"));
        String actualTooltip = toolTipElement.getText();			
        System.out.println("Actual Title of Tool Tip is - "+actualTooltip);
        
        Thread.sleep(3000);
        
        if(expectedTooltip.equals(actualTooltip)) {
        	System.out.println("Test case passed");
        } else {
        	System.out.println("Test case failed");
        }
                
        driver.close();
	}

}
