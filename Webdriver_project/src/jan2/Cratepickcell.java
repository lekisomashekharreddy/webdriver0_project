package jan2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cratepickcell {

	public static void main(String[] args) throws Throwable {
		String doj="20/3/2024";
		String temp[]=doj.split("/");
		String date =temp[0];
		String month = temp[1];
		String year = temp[2];
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/");
		Thread.sleep(2000);
		
		
		

	}

}
