package jan1;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import dec31.Eachrowcell;

public class Printeeachrowcell {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(300);
	Actions ac = new Actions(driver);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.linkText("Admin")).click();
	ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"))).click().perform();
		WebElement table= driver.findElement(By.xpath("//table[@id='resultTable']"));
		List<WebElement>rows,cols;
		rows=table.findElements(By.tagName("tr"));
		int row=rows.size()-4;
		System.out.println("no of rows are::"+row);
		Thread.sleep(4000);
		for(WebElement eachrow :rows){
		cols=eachrow.findElements(By.tagName("td"));
		for(WebElement eachcol : cols) {
			System.out.println(eachcol.getText());
		}
				
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
