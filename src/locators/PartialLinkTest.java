package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTest {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		
		
		//Partial Link Test  = Only one character required to place
		
		driver.findElement(By.partialLinkText("F")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("phone-no")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("verifyYid")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
