package jan3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createfile {

	public static void main(String[] args) throws Throwable {
		File f = new File("d:/normal.text");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("iam learning testig");
		bw.newLine();
		bw.write("iam learning job");
		bw.newLine();
		bw.write("iam learning spoken english");
		bw.flush();
		bw.close();

	}

}
