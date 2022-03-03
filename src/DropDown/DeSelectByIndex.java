package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Swapnil/Desktop/demo2.html");

		
				  WebElement drp = driver.findElement(By.id("cars"));
			
				Select sel=new Select(drp);
				
				sel.selectByIndex(0);
				sel.selectByIndex(1);
				sel.selectByIndex(2);
				sel.selectByIndex(3);
				sel.deselectByIndex(1);
				sel.deselectByIndex(2);
				
				
				
	}

}
