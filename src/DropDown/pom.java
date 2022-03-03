package DropDown;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pom {
	
	static void deSelectbyindex(WebElement index, int x)
	{
		 Select M=new Select(index);
		   M.deselectByIndex(x);
	}
	
	static void Selectbyvisibletext(WebElement index, String y)
	{
		 Select M=new Select(index);
		   M.selectByVisibleText(y);
	}

	static void Selectbyindex(WebElement index, int x)
	{
		 Select M=new Select(index);
		   M.selectByIndex(x);
	}

	static void Selectbyvalue(WebElement locator, String val)
	{
	  Select n=new Select(locator);
	   n.selectByValue(val);

	}

}
