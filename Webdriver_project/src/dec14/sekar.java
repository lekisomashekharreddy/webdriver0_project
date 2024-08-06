package dec14;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sekar {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.name("txtuId"));
		Dimension dim=username.getSize();
		System.out.println(dim.height+"         "+dim.width);
		WebElement loginbutton=driver.findElement(By.name("login"));
		Dimension dim1=loginbutton.getSize();
		System.out.println(dim1.height+"      "+dim1.width);
		WebElement passwordbutton=driver.findElement(By.name("txtPword"));
		Dimension dim2=passwordbutton.getSize();
		System.out.println(dim2.height+"       "+dim2.width);
		driver.quit();
		

	}

}
