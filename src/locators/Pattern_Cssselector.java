package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pattern_Cssselector {

	public static void main(String[] args) throws InterruptedException 
	{
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  
	  //Pattern
	  
	  driver.findElement(By.cssSelector("input[name*='ema']")).sendKeys("test@gmail.com");
	  driver.findElement(By.cssSelector("input[placeholder*='Passw']")).sendKeys("test@123");
	  driver.findElement(By.cssSelector("button[type*='su']")).click();
	  Thread.sleep(2000);
	  driver.close();
	}

}
