package dec29;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Checkbobx {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://designsystem.digital.gov/components/checkbox/");
		Thread.sleep(3000);
		List<WebElement> checkboxes=driver.findElements(By.xpath("//label[@class='usa-checkbox__label']"));
		System.out.println("no of checkboxes are:: "+checkboxes.size());
		for (WebElement each : checkboxes) {
			boolean value = each.isSelected();
			String checkboxname=each.getText();
			Thread.sleep(2000);
			System.out.println(checkboxname+" "+value);
			each.click();
			
			
		}

	}

}
