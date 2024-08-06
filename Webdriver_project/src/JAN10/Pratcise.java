package JAN10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratcise {

	public static void main(String[] args) throws Throwable {
ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String gmailtext= driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmailtext);
		String gmailurl=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(gmailurl);
		driver.quit();
		

	}

}
