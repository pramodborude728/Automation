package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		
		//Identify element
		
		WebElement loc = driver.findElement(By.name("B"));
	
		
		// Action method
		
		Actions act=new Actions(driver);
		act.clickAndHold(loc).perform();
	

	}

}
