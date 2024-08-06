package dec30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificrowdata {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(4000);
		String tabletext1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[2]")).getText();
		String tabletext2=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[6]/td[1]")).getText();
		System.out.println(tabletext1+"    "+tabletext2);
		driver.quit();
		
		
		
		
		
		

	}

}
