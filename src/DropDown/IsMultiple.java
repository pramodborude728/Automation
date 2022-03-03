package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Swapnil/Desktop/demo2.html");
		
		
		WebElement loc = driver.findElement(By.id("cars"));
		
		Select drp=new Select(loc);
		boolean get = drp.isMultiple();
	
		System.out.println(get);

	}

}
