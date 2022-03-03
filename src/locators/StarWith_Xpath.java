package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StarWith_Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  
		  //Start-With
		  
		  driver.findElement(By.xpath("//input[starts-with(@name,'em')]")).sendKeys("test@gmail.com");
		  driver.findElement(By.xpath("//input[starts-with(@placeholder,'Pa')]")).sendKeys("test@123");
		  driver.findElement(By.xpath("//button[starts-with(@type,'su')]")).click();
		  Thread.sleep(2000);
		  driver.close();
	}

}
