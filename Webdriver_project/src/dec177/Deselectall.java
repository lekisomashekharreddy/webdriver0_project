package dec177;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Deselectall {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/user/Downloads/MultiListboxHtmlpage_lyst1589.html");
		Thread.sleep(1000);
		Select multilistbox = new Select(driver.findElement(By.name("multiSelection")));
		boolean value = multilistbox.isMultiple();
		System.out.println(value);
		for(int i=0;i<=7;i++)
		{
			Thread.sleep(1000);
			multilistbox.selectByIndex(i);
			
		}
		Thread.sleep(1000);
		multilistbox.deselectByVisibleText("Blue");
		Thread.sleep(1000);
		multilistbox.deselectByIndex(2);
		Thread.sleep(1000);
		multilistbox.deselectAll();
		Thread.sleep(1000);
		driver.quit();
			
		}


	}


