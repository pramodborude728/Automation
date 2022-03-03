package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args)
	{
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	   
	   
	  boolean loc = driver.findElement(By.cssSelector("a[id*='u_0_2']")).isDisplayed();
	  System.out.println(loc);
	   
	  // use only to check it is displyed on the page or not.
	   
	}

}
