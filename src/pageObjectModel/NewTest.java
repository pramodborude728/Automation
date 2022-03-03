package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	public static WebDriver driver;
	

  @Test(priority=1)
  public void nameVerify()
  {
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
  }
  @Test(priority=2)
  public void username()
  {
	  
	  driver.findElement(By.name("email")).sendKeys("test@gmail.com");
  }
  @Test(priority=3)
  public void password()
  {
	  
	  driver.findElement(By.name("pass")).sendKeys("Test@123");
  }
  @Test(priority=4)
  public void click()
  {
	  System.out.println(driver);
	 driver.findElement(By.cssSelector("button[id*='u_0_d']")).click();
  }
}
