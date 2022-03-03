package navigate;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRefresh {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
		
		//backword
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		//forward
		
		driver.navigate().forward();
		Thread.sleep(4000);
		
		//refresh
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		driver.close();
		

	}

}
