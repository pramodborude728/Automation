package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Instagram {
	
	WebDriver driver;
	By username=By.name("username");
	By password=By.name("password");
	By login=By.xpath("//div[text()='Log In']");
	
	Instagram(WebDriver driver1)
	{
		this.driver=driver1;
	}
	void usernameVerify()
	{
		driver.findElement(username).sendKeys("test@gmail.com");
	}
	void passwordVerify()
	{
		driver.findElement(password).sendKeys("Test@123");
	}
	void loginVerify()
	{
		driver.findElement(login).click();
	}
}
