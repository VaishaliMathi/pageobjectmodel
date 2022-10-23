package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setFile() {
		filename="CreateLead";
	}
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String username,String password,String cname,String fname,String lname) {
		LoginPage lp=new LoginPage(driver);
        lp.enterUsername(username)
        .enterPassword(password)
        .clickLogin()
        .clickCRMSFA()
        .clickLeads()
        .clickCreateLead()
        .enterCompanyname(cname)
        .enterFirstname(fname)
        .enterLastname(lname)
        .clickCreatLeadButton()
        .verifyFirstname();
	}

}
