package frameworkutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Test {
	
	public WebDriver driver;
	
	@Parameters({"URL","browser"})
	@BeforeClass
	public void Browser_Setup(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
	
	@AfterClass
	public void Browser_TearDown() {
		driver.quit();
	}

}
