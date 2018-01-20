package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Lib_Page 
{
	public WebDriver driver;
	
	public Lib_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String aTitle)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(aTitle));
		}
		catch(Exception e)
		{
			Assert.fail();
			Reporter.log("title is not matching", true);
		}
	}
	
	public void verifyElementPresent(WebElement ele)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		catch(Exception e)
		{
			Assert.fail();
			Reporter.log("WebElement is not present", true);
		}
	}
	
}
