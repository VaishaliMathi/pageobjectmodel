package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLead  extends ProjectSpecificMethod{
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateLead enterCompanyname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public CreateLead enterFirstname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public CreateLead enterLastname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public ViewLead clickCreatLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLead(driver);
	}

}
