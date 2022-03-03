package TestNG_PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	static WebDriver driver;
	
	@BeforeTest
	void setup() throws InterruptedException
	{	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	@Test(priority=1)
	void headerverify() 
	{
		PageFactoryModel p = new PageFactoryModel(driver);
		p.headerVerify();
	}
	@Test(priority=2)
	void footerVerify()
	{
		PageFactoryModel p = new PageFactoryModel(driver);
		p.footerVerify();
	}
	@Test(priority=3)
	void signupWtihGoogle()
	{
		PageFactoryModel p = new PageFactoryModel(driver);
		p.signupWithGoogle();
	}
	@Test(priority=4)
	void signupWithApple()
	{
		PageFactoryModel p = new PageFactoryModel(driver);
		p.signupWithApple();
	}
	@Test(priority=5)
	void signupWithEmail()
	{
		PageFactoryModel p = new PageFactoryModel(driver);
		p.signupWithEmail();
	}
	@AfterTest
	void close()
	{
		driver.quit();
	}
}

