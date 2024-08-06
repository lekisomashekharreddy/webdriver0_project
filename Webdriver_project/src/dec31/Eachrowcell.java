package dec31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eachrowcell {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(4000);
		WebElement webtable=driver.findElement(By.className("dataTable"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		int row=rows.size()-2;
		System.out.println("No of rows are::"+row);
		Thread.sleep(3000);
		for (WebElement eachrow : rows){
			cols=eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				Thread.sleep(2000);
				System.out.println(eachcell.getText());
			
			}
			System.out.println("*****************************************************************************************************************************");
		
			Thread.sleep(500);
				
			}
			
		}
		{
			
			
		}
		
		
		
		
		

	}


