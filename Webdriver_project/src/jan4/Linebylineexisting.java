package jan4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Linebylineexisting {

	private static String String;

	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("d:/copy2.txt");
		BufferedReader br = new BufferedReader(fr);
		String str="";
		while((str = br.readLine())!=null)
		{
			Thread.sleep(1000);
		System.out.println(str);
		}
			
		}

	}


