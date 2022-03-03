package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/");
		  
		  //End-With
		  
	
		  driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		  driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		  driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Tester");
		  
		  driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("Test@gmail.com");
		  driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Test@123");
		  driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("Test@123");
		  
		  driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		  driver.close();
		  
	}

}
