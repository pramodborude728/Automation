package google;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Dimension A=new Dimension(121,51);
		driver.manage().window().setSize(A);
driver.quit();
}

}
