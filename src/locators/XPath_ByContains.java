package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_ByContains {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//xpath by contains
		
		  // we just give attribute values contains
		
		driver.findElement(By.xpath("//input[contains(@id,'twotabsea')]")).sendKeys("game");
		driver.findElement(By.xpath("//input[contains(@id,'nav-search-su')]")).click();

	 Thread.sleep(2000);
	 driver.close();
		

	}

}
