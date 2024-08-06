package dec29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0')]")).click();
		Thread.sleep(2000);
		List<WebElement> all_radio=driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("No of radio buttons::"+all_radio.size());
		for (WebElement each : all_radio) {
			System.out.println(each.getText());
		}
			driver.quit();			
		}
		
		
		

	}

