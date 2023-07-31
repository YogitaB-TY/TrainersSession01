package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import frameworkutility.Base_Test;

public class DWS_SearchTC extends Base_Test {
	
	@Test
	public void Search() {
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String result=driver.findElement(By.xpath("//strong[@class='result']")).getText();
		
	}

}
