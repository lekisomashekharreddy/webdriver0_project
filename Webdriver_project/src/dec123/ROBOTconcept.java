package dec123;

import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ROBOTconcept {

	public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.co.in/");
	Thread.sleep(3000);
	Actions ac= new Actions(driver);
	ac.moveToElement(driver.findElement(By.linkText("Gmail")));
	ac.contextClick().perform();
	Thread.sleep(3000);
	Robot r =new Robot();
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_ENTER);
	ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(brw.get(1));
	Thread.sleep(3000);
	ac.moveToElement(driver.findElement(By.xpath("/html/body/header/div/div/div/a[3]"))).click().perform();
	Thread.sleep(3000);
	driver.findElement(By.name("firstName")).sendKeys("somu");
	driver.findElement(By.name("lastName")).sendKeys("sekhar");
	driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div")).click();
	Thread.sleep(3000);
	Select element=new Select(driver.findElement(By.id("month")));
	List<WebElement> all_itmes= element.getOptions();
	System.out.println("no of itmes are::"+ all_itmes.size());
	for(WebElement each: all_itmes) {
		Thread.sleep(3000);
    System.out.println(each.getText());
    
	}
	
	Thread.sleep(3000);
	   driver.close(); 
	driver.switchTo().window(brw.get(0));
	Thread.sleep(3000);
	ac.moveToElement(driver.findElement(By.linkText("Images"))).click().perform();
	Thread.sleep(3000);
	driver.quit();
	
		
	}


	
	
	}


