package jan12024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hram2024 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http:http://orangehrm.qedgetech.com/");
		Thread.sleep(3000);
		String tabletext1= driver.findElement(By.xpath("//table[@class='resultTable']/tbody/tr[2]/td[3]")).getText();
		String tabletext2= driver.findElement(By.xpath("//table[@class='resultTable']/tbody/tr[2]/td[1]")).getText();
		System.out.println(tabletext1+" "+tabletext2);
		driver.quit();
	

	}
	

}
