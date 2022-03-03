package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCalling  {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Swapnil/Desktop/demo2.html");
		
		
		
		WebElement dr = driver.findElement(By.id("cars"));
		

		pom.Selectbyvalue(dr, "volvo");
		pom.Selectbyindex(dr, 1);
		pom.Selectbyvisibletext(dr, "Opel");
		pom.Selectbyvisibletext(dr, "Audi");
		pom.deSelectbyindex(dr, 1);
		pom.deSelectbyindex(dr, 2);

		


	}

}
