package dec120;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HAndilingwindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='terms-link'])[1]")).click();
		driver.findElement(By.xpath("(//a[@id='privacy-link'])[1]")).click();
		driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(brw.get(3));
		Thread.sleep(2000);
		


		
		
		
		
	

	}

	}

