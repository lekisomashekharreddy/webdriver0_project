package dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsperform {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("")));
		ac.pause(3000).perform();
		ac.moveToElement(driver.findElement(By.linkText("All")));
		ac.pause(4000).click().perform();
		
		
		

	}

}
