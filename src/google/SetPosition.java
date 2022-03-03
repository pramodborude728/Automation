package google;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Point P=new Point(555,11);
		driver.manage().window().setPosition(P);
driver.close();
	}

}
