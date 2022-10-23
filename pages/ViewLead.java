package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLead  extends ProjectSpecificMethod{
	public  ViewLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewLead verifyFirstname() {
		String fstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(fstname);
		if(fstname.contains("Vaishali")) {
			System.out.println("The lead is verified");
		}
		else {
			System.out.println("The lead is not created");
		}
		return this;
	}

}
