package dec27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='https://demo.opencart.com/'");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		js.executeScript("document.querySelector(\"#input-firstname\").value='Selenium'");
		js.executeScript("document.querySelector(\"#input-lastname\").value='Manualtesting'");
		js.executeScript("document.getElementById('input-email').value='Test@gmail.com'");
		js.executeScript("document.querySelector('#input-password').value='Test@1234'");
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#input-newsletter-yes').click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#form-register > div > div > div > input').click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('#form-register > div > div > button').click()");
		
		

	}

}
