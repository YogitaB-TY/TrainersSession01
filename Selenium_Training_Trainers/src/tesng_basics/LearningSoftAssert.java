package tesng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	
	@Test
	public void softAssertPractice() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(driver.getTitle(), "Facebook", "Title verification");
		driver.findElement(By.partialLinkText("Log")).click();
		ast.assertAll();
	}

}
