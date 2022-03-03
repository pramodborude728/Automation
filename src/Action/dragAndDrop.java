package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		//Identify element
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"fourth\"][@class='block13 ui-draggable']"));
		WebElement drop = driver.findElement(By.id("amt7"));
	
		
		// Action method
		
		/*Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform(); */
		
		//Another method
		
		/*Actions act=new Actions(driver);
		act.clickAndHold(drag).release(drop).perform(); */
		
		//	Another Approach
		
		Actions act=new Actions(driver);
		act.clickAndHold(drag).moveToElement(drop).release().perform();
		
		
		
	
	}

}
