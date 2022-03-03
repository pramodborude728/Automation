package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Cssselector {

	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	
	driver.findElement(By.cssSelector("._2IX_2-.VJZDxU")).sendKeys("test@gmail.com");
	driver.findElement(By.cssSelector("._2IX_2-._3mctLh.VJZDxU")).sendKeys("Test@123");
    driver.findElement(By.cssSelector("._2KpZ6l._2HKlqd._3AWRsL")).click();
	Thread.sleep(2000);
     driver.close();
     
     
	}

}
