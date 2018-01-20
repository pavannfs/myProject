package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Lib_Page;

public class ActiTime_HomePage extends Lib_Page
{
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;
	
	public ActiTime_HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout()
	{
		verifyElementPresent(logout);
		logout.sendKeys(Keys.ENTER);
	}
}
