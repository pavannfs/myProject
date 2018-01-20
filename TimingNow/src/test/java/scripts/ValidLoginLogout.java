package scripts;

import org.testng.annotations.Test;

import generic.Excel;
import generic.Init_Page;
import pom.ActiTime_HomePage;
import pom.ActiTime_LoginPage;

public class ValidLoginLogout extends Init_Page
{
	
	@Test
	public void testValidLoginLogout()
	{
		String user=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 0);
		String pass=Excel.getCellValue(PATH, "ValidLoginLogout", 1, 1);
		
		ActiTime_LoginPage l1=new ActiTime_LoginPage(driver);
		l1.enterUN(user);
		l1.enterPWD(pass);
		l1.clickLogin();
		
		ActiTime_HomePage h1= new ActiTime_HomePage(driver);
		h1.clickLogout();
	}
}
