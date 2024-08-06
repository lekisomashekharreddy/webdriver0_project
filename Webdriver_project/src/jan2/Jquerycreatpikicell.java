package jan2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquerycreatpikicell {

	public static void main(String[] args) throws Throwable {
		String doj="20/3/2030";
		String temp[]=doj.split("/");
		String date=temp[0];
		String month=temp[1];
		String year=temp[2];
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Datepicker")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year));
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']\"))")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			}
			String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			while(!calmonth.equalsIgnoreCase(month));
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']\"))")).click();
				calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			}
			WebElement webtable=driver.findElement(By.className("ui-datepicker-calendar"));
			List<WebElement>rows,cols;
			rows= webtable.findElements(By.tagName("tr"));
			for(WebElement eachrow :rows ) {
				cols =eachrow.findElements(By.tagName("td"));
				for(WebElement eachcell:cols) {
					if (eachcell.getText().equals(date)) {
						eachcell.click();
						
					}
				}
			}
			
			
			
		}
			
		}
		
		

	


