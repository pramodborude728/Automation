package TestNG_PageFactory;


import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryModel {
	WebDriver driver;

	@FindBy(xpath=("//span[text()='Happening now']"))
	WebElement header;
	
	@FindBy(xpath="//span[text()='Join Twitter today.']")
	WebElement footer;
	
	@FindBy(xpath="//span[text()='Sign up with Google']")
	WebElement google;
	
	@FindBy(xpath="//span[text()='Sign up with Apple']")
	WebElement apple;
	
	@FindBy(xpath="//span[text()='Sign up with phone or email']")
	WebElement email;
	
	public PageFactoryModel(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	void headerVerify()
	{
	assertEquals("Happening now", header.getText());
	}
	void footerVerify()
	{
		assertEquals("Join Twitter today.", footer.getText());
	}
	void signupWithGoogle()
	{
		google.click();
		Set<String> allwindow = driver.getWindowHandles();
		Iterator<String> i=allwindow.iterator();
		String n = i.next();
		String m = i.next();
		driver.switchTo().window(m).close();
		driver.switchTo().window(n);
	}
	void signupWithApple()
	{
		apple.click();
		Set<String> allwindow = driver.getWindowHandles();
		Iterator<String> i=allwindow.iterator();
		String n = i.next();
		String m = i.next();
		driver.switchTo().window(m).close();
		driver.switchTo().window(n);
	}
	void signupWithEmail()
	{
		email.click();

	}
}
