package dec14;



	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		Thread.sleep(5000);
		String gmailtext=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(gmailtext);
		String gmailurl=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(gmailurl);
		driver.quit();
		
		
		

		
		
		


	}

}
