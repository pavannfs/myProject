package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Lib_Page;

public class ActiTime_LoginPage extends Lib_Page
{
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	public ActiTime_LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterUN(String un)
	{
		user.sendKeys(un);
	}
	
	public void enterPWD(String pwd)
	{
		pass.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		login.click();
	}
}
