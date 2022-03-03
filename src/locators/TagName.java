package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Swapnil/Desktop/tagname.html");
		driver.manage().window().maximize();
		
		
		
		//TagName
		
		//2 line code
		
		/*WebElement loc = driver.findElement(By.tagName("input"));
		loc.sendKeys("Pramod");
		Thread.sleep(2000);
		driver.close();
		*/
		
		
		//1 line code
		/*
		driver.findElement(By.tagName("input")).sendKeys("Pramod");
		driver.close();*/
		
		// 3 line code
		
	      By loc = By.tagName("input");
	      WebElement fname = driver.findElement(loc);
	      fname.sendKeys("Pramod");
	      driver.close();
	      
	      
		
	}

}
