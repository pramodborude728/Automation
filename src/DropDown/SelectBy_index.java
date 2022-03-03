package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBy_index {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/");
		  
		  
		  WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		  loc.click();
		  
		  
		  
		  Select sel = new Select(loc);
		  sel.selectByIndex(6);
		   
		  Thread.sleep(2000);
		  driver.close();
		  

	}

}
