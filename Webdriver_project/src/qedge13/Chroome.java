package qedge13;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chroome {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://Google.com");
		Thread.sleep(1000);
		String gmiltext=driver.findElement(By.linkText("Images")).getText();
		System.out.println(gmiltext);
		String chromeurl=driver.findElement(By.linkText("Images")).getAttribute("href");
		System.out.println(chromeurl);
		driver.quit();
		
		
		



	}

}
