package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		Instagram i=new Instagram(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		i.usernameVerify();
		i.passwordVerify();
		i.loginVerify();

	}

}
