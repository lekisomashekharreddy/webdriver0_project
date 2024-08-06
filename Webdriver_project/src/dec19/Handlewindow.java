package dec19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlewindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='terms-link'])[1]")).click();
		driver.findElement(By.xpath("(//a[@id='privacy-link'])[1]")).click();
		driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		for(String child: driver.getWindowHandles()) {
			if(!parent.equals(child));
			{
			String pagetitle=driver.switchTo().window(child).getTitle();
			System.out.println(pagetitle);
			Thread.sleep(2000);
			driver.close();
			}
		}
           driver.switchTo().window(parent); 
			Thread.sleep(2000);
			Select element=new Select(driver.findElement(By.name("birthday_year")));
			List<WebElement> All_itmes=element.getOptions();
			System.out.println("no of itmes in list box::"+All_itmes.size());
			for(WebElement each:All_itmes) {
				System.out.println(each.getText());
			}
				Thread.sleep(2000);
				driver.quit();
			}
			
		



	}

