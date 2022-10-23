package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ReadExcel;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String filename;
	@DataProvider(name="fetchData")
	public String[][] testData() throws IOException {
		String[][] readData = ReadExcel.readData(filename);
		return readData;
	}
	@BeforeMethod
     public void launchBrowser() {
    	 WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("http://leaftaps.com/opentaps/control/main");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	 
     }
    @AfterMethod
public void tearDown() {
    	driver.close();
    }
}
