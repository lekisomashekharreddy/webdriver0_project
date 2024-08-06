package dec51;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Soo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		Select daylistbox=new Select(driver.findElement(By.name("birthday_day")));
		Select monthlistbox =new Select(driver.findElement(By.name("birthday_month")));
		Select yearlistbox=new Select(driver.findElement(By.name("birthday_year")));
		boolean value=daylistbox.isMultiple();
		System.out.println(value);
		daylistbox.selectByIndex(5);
		Thread.sleep(2000);
		monthlistbox.selectByVisibleText("Nov");
		Thread.sleep(2000);
		yearlistbox.selectByIndex(50);
		Thread.sleep(2000);
		driver.quit();
		
		

		
		
		


	}

}
