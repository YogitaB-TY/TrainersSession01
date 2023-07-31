package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_Subscribe extends Base_Test {
	@Test
	public void subscribe() {
		
		driver.findElement(By.id("newsletter-email")).sendKeys("xxx@test.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		

	}
	
}
