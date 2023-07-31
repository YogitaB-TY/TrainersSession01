package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_Vote extends Base_Test {
	
	@Test
	public void vote() {
		
		driver.findElement(By.id("pollanswers-1")).click();
		driver.findElement(By.id("vote-poll-1")).click();
		
	}

}
