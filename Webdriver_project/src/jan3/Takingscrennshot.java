package jan3;


import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Takingscrennshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
         Date date = new Date(0);
		DateFormat df = new SimpleDateFormat("YYY_mm_dd_mm_ss");
		String datef=df.format(date);
		
		
		File shot=((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(shot,new File("d:/screenshot/"+datef+"----"+" facebooklogin.png"));
		driver.quit();

	}
}

