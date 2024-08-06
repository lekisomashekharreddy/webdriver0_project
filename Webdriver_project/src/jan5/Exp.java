package jan5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Exp {
          
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
		driver.findElement(By.linkText("Create new account")).click();
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First name']")));
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("somu");
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@class='inputtext _55r1 _6luy']")));
		driver.findElement(By.name("lastname")).sendKeys("reddy");
		
		
		

	}

}
