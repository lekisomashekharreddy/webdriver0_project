package dec12;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class April {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.name(" "));
		Dimension dim= username.getSize();
		System.out.println(dim.height+"    "+dim.width);
		WebElement loginbutton=driver.findElement(By.name(""));
		Dimension dim1=loginbutton.getSize();
		System.out.println(dim.height+"    "+dim.width);
		driver.quit();

	}

}
