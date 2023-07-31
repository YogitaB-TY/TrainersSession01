package tesng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningHardAssert {
	
	@Test(threadPoolSize = 3, invocationCount = 4)
	public void hardAssertPractice() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		//Assert.assertEquals(driver.getTitle(), "Facebook");
		
		driver.findElement(By.partialLinkText("Log")).click();
		driver.close();
	}

}
