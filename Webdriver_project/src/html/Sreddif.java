package html;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sreddif {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		List<WebElement>all_link=driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println(all_link.size());
		for (WebElement each : all_link) {
			System.out.println(each.getText()); 
			
		}
			Thread.sleep(2000);
			driver.quit();
		}
			
		
}	
		


