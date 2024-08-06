package dec16;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dec23.Chroome;

public class LIstbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>all_itmes=listbox.getOptions();
		System.out.println("No of itmes are::"+all_itmes.size());
		Thread.sleep(1000);
		for(WebElement each:all_itmes) {
			Thread.sleep(1000);
			System.out.println(each.getText());
		}
			Thread.sleep(1000);
			driver.quit();
		}
		



	}


