package dec29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice297selectedordislected {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0')]")).click();
		Thread.sleep(3000);
		WebElement fristname=driver.findElement(By.name("firstname"));
		boolean is_enabled=fristname.isEnabled();
		System.out.println(is_enabled);
		WebElement reenteremail=driver.findElement(By.name("reg_email_confirmation__"));
		boolean is_displayed=reenteremail.isDisplayed();
		System.out.println(is_displayed);
		WebElement raidobutton=driver.findElement(By.xpath("//input[@value='1']"));
		boolean is_selected = raidobutton.isSelected();
		System.out.println(is_selected);
		
		

	}

}
