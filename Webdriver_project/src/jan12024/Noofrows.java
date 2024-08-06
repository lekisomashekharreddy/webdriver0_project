package jan12024;

import java.sql.Driver;
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
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(2000);
		WebElement webtable = driver.findElement(By.className("table hover"));
		List<WebElement> rows=webtable.findElements(By.tagName("tr"));
		int row=rows.size()-2;
		System.out.println("no of rows are::"+row);
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println("row no"+i+"  "+"coloms size::"+cols.size());
			driver.quit();
			
		}
		
			
		}
		
		
		
		
		

	}


