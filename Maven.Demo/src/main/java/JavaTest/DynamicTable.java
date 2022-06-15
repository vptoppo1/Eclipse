package JavaTest;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\Vishal\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/table.html");
		
		List <WebElement> row_no = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		int row_count = row_no.size();
		
		for (int row = 0; row < row_count; row++) {
			List <WebElement> column_rows = driver.findElements(By.xpath("/html/body/table/tbody/tr[" + (row +1) +"]/td"));
			int column_count = column_rows.size();
			System.out.println("Number of column in row " + row + " are " + column_count);
			
			for (int column = 0; column < column_count; column++) {
    	        // To retrieve text from that specific cell.
    	        String celtext = column_rows.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
    	    System.out.println("-------------------------------------------------- ");
		}
		
		driver.close();
	}

}
