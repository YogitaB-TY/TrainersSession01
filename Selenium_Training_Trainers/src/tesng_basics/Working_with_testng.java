package tesng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_testng {
	
	@Test()
	public void SearchTest() {
		System.out.println("Executing Search Test");
	}
	
	@Test(groups = "SmokeTest")
	public void LoginTest() {
		System.out.println("Executing Login Test");
	}
	
	@Test(groups = "SmokeTest")
	public void RegisterTest() {
		System.out.println("Executing Register Test");
	}
	
		
	
	

}
