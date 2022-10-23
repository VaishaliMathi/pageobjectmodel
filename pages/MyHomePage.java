package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyHomePage  extends ProjectSpecificMethod {
	public  MyHomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public MyLeadsPage clickLeads() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return new MyLeadsPage(driver);
	}

}
