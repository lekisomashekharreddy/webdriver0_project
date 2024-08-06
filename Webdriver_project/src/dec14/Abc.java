package dec14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Abc {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://google.com");
		Thread.sleep(2000);
		System.out.println("page title[1])"+driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("page title[2]"+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("page title[3]"+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("page title[4]"+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();
		

	}}
