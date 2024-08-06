package Dec18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/user/Downloads/MultiListboxHtmlpage_lyst1589.html");
	Thread.sleep(1000);
	Select multilistbox = new Select(driver.findElement(By.name("multiselection")));
	for(int i=0;i<=9;i++)
	{
	Thread.sleep(1000);
	multilistbox.selectByIndex(i);
	}
	List<WebElement>all_itmes=multilistbox.getAllSelectedOptions();
	System.out.println("no of itmes are::"+all_itmes.size());
	Thread.sleep(1000);
	for(WebElement each :all_itmes) {
		System.out.println(each.getText());
		driver.quit();
	}
	
	
	}
	

	}
