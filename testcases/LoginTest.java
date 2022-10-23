package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setFile() {
		filename="Login";
	}
	@Test(dataProvider = "fetchData")
	
	public void runLoginTest(String username,String password) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLogin();
	}

}
