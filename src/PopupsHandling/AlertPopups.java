package PopupsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		// Alert popups 
		/*[
		 1. we can't drag and drop
		 2. colourful texture
		 3.  we can inspect those type of popups.
		 4. we have only two options OK and cancel
		  ]*/
		driver.findElement(By.name("cusid")).sendKeys("3333");
		driver.findElement(By.name("submit")).click();
		
		//for ok button
		// first alert
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		driver.switchTo().alert().accept();
		
		//second alert
		String txt1 = driver.switchTo().alert().getText();
		System.out.println(txt1);
		driver.switchTo().alert().accept();
		
		//for cancel button
		//driver.switchTo().alert().dismiss();

	}

}
