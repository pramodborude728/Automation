package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDCssselector {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		
		//CSS Selector
		
		
		driver.findElement(By.cssSelector("#login-username")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("#login-signin")).click();

	 Thread.sleep(2000);
	 driver.close();
		

	}

}
