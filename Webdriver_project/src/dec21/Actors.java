package dec21;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actors {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("amazon ");
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(40000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		driver.quit();
		
		
	 

	}

}