package google;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetClose {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();

	}

}
