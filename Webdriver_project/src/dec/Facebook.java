package dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dec23.Chroome;

public class Facebook {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(1000);
	Select dayliSelectbox=new Select(driver.findElement(By.name("birthday_day")));
	Select monthlistbox=new Select(driver.findElement(By.name("birthday_month")));
	Select yearlistbox=new Select(driver.findElement(By.name("birthday_year")));
	boolean value=dayliSelectbox.isMultiple();
	System.out.println(value);
	dayliSelectbox.selectByIndex(2);
	Thread.sleep(3000);
	yearlistbox.selectByVisibleText("2000");
	Thread.sleep(3000);
	monthlistbox.selectByVisibleText("Nov");
	Thread.sleep(3000);
	
	
	


	}

}
