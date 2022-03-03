package PopupsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		
	// Identify Webelement
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		
		// To Print single reference Id [ only parent window]
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		
		// to print multiple reference id's parent as well as child [every time parent window reference id will print first]
		Set<String> parentWind = driver.getWindowHandles();
		System.out.println(parentWind);
		
		// to access child windows use iterator operator
		Iterator<String> it=parentWind.iterator();
		
	// Print reference id parent window [use next() operator]
		String p = it.next();
		System.out.println(p);
		
		// perform operations
		driver.switchTo().window(p);
		//Printing title
		String t = driver.getTitle();
		System.out.println(t);
		driver.close();
		
		//print reference id 1st child window [use next() operator]
		String p1 = it.next();
		System.out.println(p1);
		
		// perform operations
		driver.switchTo().window(p1);
		//Printing title
		String t1 = driver.getTitle();
		System.out.println(t1);
		
		//print reference id 2st child window [use next() operator]
		String p2 = it.next();
		System.out.println(p2);
		driver.close();
		
		// perform operations
		driver.switchTo().window(p2);
		//Printing title
		String t2 = driver.getTitle();
		System.out.println(t2);
		driver.close();
		
		// use hasnext() keyword to find out there any child window is present or not 
		boolean p3 = it.hasNext();
		System.out.println(p3);

	}

}
