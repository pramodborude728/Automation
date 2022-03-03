package PopupsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedPopup {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		
	// Identify Webelement
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		
		// to print multiple reference id's parent as well as child [every time parent window reference id will print first]
		Set<String> allWindow = driver.getWindowHandles();
		
		// to access child windows use iterator operator
		Iterator<String> it=allWindow.iterator();
		
	     // Print reference id parent window [use next() operator]
		String parent = it.next();
	
		for(String child:allWindow)
		{
			if(!parent.equalsIgnoreCase(child));
			{
				driver.switchTo().window(child);
				String title = driver.getTitle();
				System.out.println("Title:: "+title);
				String referenceId = driver.getWindowHandle();
				System.out.println("Reference Id:: "+referenceId);
		}
		
		}
		
		/*	do
			{
				String title = driver.getTitle();
				System.out.println("Title:: "+title);
				String referenceId = driver.getWindowHandle();
				System.out.println("Reference Id:: "+referenceId);
				String child = it.next();
				driver.switchTo().window(child);
				
			}while(it.hasNext());
		*/
		driver.quit();

	}

}
