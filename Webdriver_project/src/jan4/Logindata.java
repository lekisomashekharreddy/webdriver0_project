package jan4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logindata {

	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("D:/webdriver.txt");
		BufferedReader br =new BufferedReader(fr);
		String str = "";
		while((str= br.readLine())!=null) {
			String login[]=str.split(";");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
			driver.findElement(By.name("Submit")).click();
			String expected="dashboard";
			String actual=driver.getCurrentUrl();
			if (actual.contains(expected)) {
				System.out.println("username and password are valid::"+expected+"       "+actual);
			}
			else
			{
				String error_message=driver.findElement(By.id("spanMessage")).getText();
				System.out.println(error_message+"    "+expected+"       "+actual);
				
			}
			
		}
	
			
		}
			
		}	
		
		




