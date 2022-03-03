package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		
		//class name
		
		
		driver.findElement(By.className("phone-no")).sendKeys("test@gmail.com");
		driver.findElement(By.name("signin")).click();
	 Thread.sleep(2000);
	 driver.close();
		
		
		
		
		
	}	
}
