package navigate;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateForward {

	public static void main(String[] args) throws InterruptedException
	
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//Back to previous page
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Forward to next page
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
