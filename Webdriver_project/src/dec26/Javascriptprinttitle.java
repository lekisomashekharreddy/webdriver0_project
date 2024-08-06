package dec26;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptprinttitle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.amazon.in//'");
		Thread.sleep(2000);
		String pagetitle = js .executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String strurl= js.executeScript("return document.URL").toString();
		System.out.println(strurl);
		System.out.println(strurl.length());
		String domain= js.executeScript("return  document. domain").toString();
		System.err.println(domain);
		System.out.println(domain.length());
		driver.quit();

	}

}
