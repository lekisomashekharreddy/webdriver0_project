package dec26;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickholdactions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		Actions ac =new Actions(driver);
		List<WebElement>all_frames=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames are::"+all_frames.size());
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		ac.clickAndHold(source).moveToElement(target).release().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		Thread.sleep(2000);
		driver.quit();



	}

}
