package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryClass {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://twitter.com/");
		
		PageFactoryModel p=new PageFactoryModel(driver);
		p.headerVerify();
		p.footerVerify();
		p.signupWithGoogle();
		p.signupWithApple();
		p.signupWithEmail();
		
	}

}
