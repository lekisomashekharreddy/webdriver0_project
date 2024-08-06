package tuesday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handiling2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img)[5]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//img)[11]")).click();
			Thread.sleep(1000);
			
		String alret_message= driver.switchTo().alert().getText();
		System.out.println(alret_message);
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(1000);
	
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String alretmessage=driver.switchTo().alert().getText();
		System.out.println(alretmessage);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
