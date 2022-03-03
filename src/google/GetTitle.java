package google;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	
	String actualtitle=driver.getTitle();
	String expectedtitle="Google";
	
	if(expectedtitle.equals(actualtitle))
	
	{
    System.out.println("Pass");
   }
	else
   {
     System.out.println("Failed");	
   }
	driver.close();
}
	
}