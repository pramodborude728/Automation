package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		// IsEnabled method to check buttons is enabled or not
		
		
		boolean loc = driver.findElement(By.name("url")).isEnabled();
		
		System.out.println(loc);

	}

}
