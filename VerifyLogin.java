package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass {
	@Test
	public void runverifyLogin()
	{
		LoginPage lp=new LoginPage();
		lp.enterUserName("DemoSalesManager")
		  .enterPassword("crmsfa")
		  .clickLogin()
		  .verifyHomePage();
		  
	}

}
