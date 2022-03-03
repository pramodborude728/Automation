package google;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();

	}

}
