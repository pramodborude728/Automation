package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		// get option
		
		WebElement loc = driver.findElement(By.name("url"));
		loc.click();
		
		Select sel=new Select(loc);
		List<WebElement> M = sel.getOptions();
		int N = M.size();
		
		System.out.println(N);
		
		for(int i=0; N>=i; i++);
		{
			System.out.println(M);
		}
			
		}
	}

