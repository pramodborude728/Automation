package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelected {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		// IsSelected method is used to select radiobuttons, dropdown, checkboxs 
		 
		 WebElement s = driver.findElement(By.name("url"));
		 s.click();                                  // click the button
		Select sl=new Select(s);
		sl.selectByVisibleText("Baby");              //select text
		 WebElement loc = driver.findElement(By.xpath("//option[text()='Baby']"));
		
		//to check is selected or not
		
		//System.out.println(loc);
		
			
		if(loc.isSelected())
		{
			System.out.println("selectable");
			
		}
		else
		{
			System.out.println("Not selectable");
		}
		
		driver.close();
	}

}
