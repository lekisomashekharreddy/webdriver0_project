package html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com/");
		driver.findElement(By.name("email")).sendKeys("sdfg");
		driver.findElement(By.id("pass")).sendKeys("uss");
		driver.findElement(By.name("login")).click();
		

	}
}