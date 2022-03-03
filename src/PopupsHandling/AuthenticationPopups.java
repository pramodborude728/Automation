package PopupsHandling;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// we have to put password and username in the url
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		// Authentication popups 
		/*[
		 1. we can't drag and drop
		 2. colourful texture
		 3.  we can inspect those type of popups.
		 
		  ]*/

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.close();
		
	}

}
