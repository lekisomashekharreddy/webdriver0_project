package dec19;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlechild {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(1000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(5000);
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		Thread.sleep(5000);
		for(String each : allwins) {
			if(!parent.equals(each))
			{
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(4000);
				driver.close();
			}
		}
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.findElement(By.name("identifier")).sendKeys("pragna2010");
		Thread.sleep(4000);
		driver.quit();
	}

}
