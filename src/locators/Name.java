package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	     driver.get("https://www.youtube.com/");
	     driver.manage().window().maximize();
	     
	     
	     driver.findElement(By.name("search_query")).sendKeys("mashup song");
	     
	     

	}

}
