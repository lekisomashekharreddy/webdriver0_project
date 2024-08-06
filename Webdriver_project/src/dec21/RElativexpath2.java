package dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RElativexpath2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		username.clear();
		username.sendKeys("lekisomashekharreddy@gmail.com");
		Thread.sleep(2000);
		String uservalue=username.getAttribute("value");
		System.out.println(uservalue);
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.clear();
		password.sendKeys("somu@143sd");
		String passvalue=password.getAttribute("value");
		System.out.println(passvalue);
		WebElement loginbtn = driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
		loginbtn.click();
		Thread.sleep(2000);
		/*String expected="dashboard";
		String Actual=driver.getCurrentUrl();
		if(Actual.contains(expected))
		{
			System.out.println("username and password are valid:"+expected+"  "+Actual);
		}
		else
		{
		 String error_message=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		  
		  System.out.println("error_message"+"      "+expected+"    "+Actual);
		}*/
		driver.quit();
		
		
		
		
	
		
	
	
		
		

	}}


