package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_ByMultipleAttribute {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	
		
		driver.findElement(By.xpath("//input[@type='text'][@class='_2IX_2- VJZDxU']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@type='password'][@type='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL'][@type='submit']")).click();

	 Thread.sleep(2000);
	 driver.close();	

	}

}
