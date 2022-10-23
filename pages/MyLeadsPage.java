package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyLeadsPage  extends ProjectSpecificMethod {
	public MyLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLead clickCreateLead() {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		return new CreateLead(driver);
	}

}
