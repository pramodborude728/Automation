package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute_Cssselector {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Attribute 
		
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test@123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
	 Thread.sleep(2000);
	
		driver.close();
    
	}

}
