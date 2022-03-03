package Action;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyDownAndUp {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		// identify Element
		
		WebElement username = driver.findElement(By.id("email"));
		//WebElement password = driver.findElement(By.id("pass"));
		
		
		// General Keydown and KeyUp method
		
		/*Actions act=new Actions(driver);
		act.click(username).sendKeys("test@gmail.com").keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	    act.click(password).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	    */
		
	    // Another method
	    
		Actions act=new Actions(driver);
		act.sendKeys(username, "test@gmail.com").keyDown(Keys.CONTROL).sendKeys("a","c").keyUp(Keys.CONTROL).sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	   act.pause(3333).perform();
	   driver.close();
		
	}
}
