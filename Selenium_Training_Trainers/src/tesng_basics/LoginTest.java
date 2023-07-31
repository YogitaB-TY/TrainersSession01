package tesng_basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(tesng_basics.ListenerImplementation.class)

public class LoginTest {
	
	@Test(dataProvider = "LoginData")
	public void loginTest(String UserName, String Password) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys(UserName);
		driver.findElement(By.id("Password")).sendKeys(Password);
		Assert.fail(); 
		driver.close();
	}
	
	@DataProvider(name = "LoginData",parallel = true)
	public String[][] loginTestData() throws EncryptedDocumentException, IOException {
		return LearningReadExcel.multipleRead("LoginData");
	}

}
