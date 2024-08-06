package jan3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primusfile {

	public static void main(String[] args) throws Throwable {
		File f = new File("D:/primus.text");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.primusbank.qedgetech.com/");
		Thread.sleep(2000);
		String para1 = driver.findElement(By.xpath("(//p[@class='style7'])[2]")).getText();
		String para2 = driver.findElement(By.xpath("(//p[@class='style7'])[3]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
	
		bw.flush();
		bw.close();
		driver.quit();

	}

}
