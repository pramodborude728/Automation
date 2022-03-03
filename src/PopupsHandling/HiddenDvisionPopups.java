package PopupsHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDvisionPopups {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// Identify WebElement
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		// Hidden Division Handling popups
		/*[
		 1. we can't drag and drop
		 2. colourfull texture
		 3.  we can inspect those type of popups.
		 
		  ]*/
		driver.findElement(By.id("identify_email")).sendKeys("test@gamil.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.close();
		

	}

}
