package dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Relativexpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin34");
		//username.sendKeys("Admin");
		String uservalue=username.getAttribute("value");
		System.out.println(uservalue);
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		String passvalue=password.getAttribute("value");
		System.out.println(passvalue);
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginbtn.click();
		Thread.sleep(2000);
		String execepted="dashboard";
		
		String actual=driver.getCurrentUrl();
		if(actual.contains(execepted))
			
		{
			System.out.println("uesername and password are valid:"+execepted+"  "+actual);
			
		}
	
	else
	{
	String error_messsage= driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
	System.out.println(error_messsage);
	System.out.println("error_message"+"       "+execepted+"  "+actual);
	
	}
		driver.quit();
}} 

	

