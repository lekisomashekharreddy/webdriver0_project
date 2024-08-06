package dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsgmail {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Create an account'])[1]")).click();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ARROW_UP);
		ac.pause(2000).perform();
		ac.sendKeys(Keys.ARROW_UP);
		ac.pause(2000).perform();
		ac.sendKeys(Keys.ARROW_UP);
		ac.pause(2000).perform();
		ac.sendKeys(Keys.ENTER);
		ac.pause(2000).perform();
		driver.quit();

	}

}
