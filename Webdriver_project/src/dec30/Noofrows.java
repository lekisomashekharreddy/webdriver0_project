package dec30;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noofrows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(3000);
		WebElement webtable=driver.findElement(By.className("dataTable"));
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int row =rows.size()-1;
		System.out.println("no of  rows are::"+row);
		for(int i=1;i<rows.size();i++)
		{
			
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No."+i+"   "+"colum size::"+cols.size());
			
			
		}
			
		}
	

	}


