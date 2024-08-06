package dec28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dec26.Clickhold;

public class Xpathfollowing {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='reg']//following::input[2]")).sendKeys("selenium");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[3]")).sendKeys("testing");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[4]")).sendKeys("somu@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[5]")).sendKeys("somu@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[6]")).sendKeys("testing77");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[1]"))).selectByVisibleText("20");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[2]"))).selectByVisibleText("Apr");
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[3]"))).selectByVisibleText("2002");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[10]")).click();
		driver.findElement(By.xpath("//form[@id='reg']//following::input[11]")).click();		
		driver.findElement(By.xpath("//form[@id='reg']//following::button[1]")).click();
		
		
		
		

	}

}
