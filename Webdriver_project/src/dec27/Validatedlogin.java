package dec27;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Validatedlogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin'");
		js.executeScript("document.querySelector(\"#txtPassword\").value='Qedge123!@#'");
		js.executeScript("document.querySelector(\"#btnLogin\").click()");
		String Exepected ="dashboard";
		String Actual=js.executeScript("return document.URL").toString();
		if (Actual.contains(Exepected)) 
			{
				System.out.println("login success::"+Exepected+"        "+Actual);
			
				
			}
			else
			{
				String Error_message = js.executeScript("return document.querySelector(\"#spanMessage\").innerHTML").toString();
				System.out.println(Error_message+"   "+Exepected+"    "+Actual);
				
			}
		}
		
		

	}


