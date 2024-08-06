package dec23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ahtml {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://Google.com/");
		Thread.sleep(2000);
		List<WebElement>all_links=driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println(all_links.size());
		for (WebElement each : all_links) {
			
			System.out.println(each.getText());
		}
		Thread.sleep(2000);
		driver.quit();



	}



}


