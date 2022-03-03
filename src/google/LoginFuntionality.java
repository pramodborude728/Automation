package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFuntionality
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		// by calling method
		
		
		HomePageMethod f=new HomePageMethod(driver);
		 
		 f.username();
		 f.password();
		 f.click();
		 
		 

	}

}
