package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ID2 {

	public static void main(String args[]) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		  
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tabs");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 Actions A=new Actions(driver);
		 A.sendKeys(Keys.END).build().perform();
		 
		 
	
		
	}
}