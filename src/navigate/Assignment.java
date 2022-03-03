package navigate;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");	
		String A=driver.getTitle();
		String B=driver.getCurrentUrl();
		System.out.println(A);
		System.out.println(B);
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.myntra.com/");
		String A1=driver.getTitle();
		String B1=driver.getCurrentUrl();
		System.out.println(A1);
		System.out.println(B1);
		 Thread.sleep(4000);
		
	//Backward 
		
		driver.navigate().back();
		String A3=driver.getTitle();
		String B3=driver.getCurrentUrl();
		System.out.println(A3);
		System.out.println(B3);
		 Thread.sleep(4000);
		 
	//Forward
		 driver.navigate().forward();
			String A4=driver.getTitle();
			String B4=driver.getCurrentUrl();
			System.out.println(A4);
			System.out.println(B4);
			 Thread.sleep(4000);
		 
	//Refresh
			 driver.navigate().refresh();
				String A5=driver.getTitle();
				String B5=driver.getCurrentUrl();
				System.out.println(A5);
				System.out.println(B5);
				 Thread.sleep(4000);
		
	driver.close();

	}

}
