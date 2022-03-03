package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		//Identify element
		
		WebElement loc = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	
		
		// Action method
		
		Actions act=new Actions(driver);
		act.click(loc).perform();
	

	}

}
