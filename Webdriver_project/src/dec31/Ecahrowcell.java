package dec31;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecahrowcell {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.moneycontrol.com/markets/currencies/");
		Thread.sleep(3000);
		WebElement webtable=driver.findElement(By.className("GlobalCurrencyRate_web_commontable__WdOgi"));
		List<WebElement>rows,cols;
		rows=webtable.findElements(By.tagName("tr"));
		int row=rows.size()-5;
		for (WebElement eachrow :rows) {
		cols= eachrow.findElements(By.tagName("td"));
		for (WebElement eachcell : cols) {
System.out.println(eachcell.getText());
		
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Thread.sleep(300);
	
		}
		

	}
}

