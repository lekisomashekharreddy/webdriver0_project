package jan5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class veriftitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		WebDriverWait myWait=new WebDriverWait(driver. Durationo.fSeconds(80));
		String expected="Google";
		String actual=driver.getTitle();
		myWait.until(ExpectedConditions.titleIs(expected));
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("title is matching");
			
		} else {
			System.out.println("title is not matching");
			

		}
			driver.quit();
		}
	
		
				
				
			
		
		
			
		
		


		
		
		
	
	
	
	
	
	{
		
	}
	
	}
			
			
			
		
	
		
			
			
			
			
			
	
	
	
	
	
	
	
			
			
		

	


