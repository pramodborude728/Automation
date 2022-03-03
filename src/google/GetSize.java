package google;

import org.openqa.selenium.chrome.ChromeDriver;
public class GetSize {

	public static void main(String[] args)
	{
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.google.com/");
	int A=driver.manage().window().getSize().getWidth();
    System.out.println(A);
    int B=driver.manage().window().getSize().getHeight();
    System.out.println(B);
     driver.close();

	}

}
