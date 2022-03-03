package google;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) 
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
int A=driver.manage().window().getPosition().getX();
System.out.println(A);
int B=driver.manage().window().getPosition().getY();
System.out.println(B);
driver.close();



	}

}
