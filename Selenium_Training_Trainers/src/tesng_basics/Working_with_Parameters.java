package tesng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_with_Parameters {
	
	
	@Parameters({"URL","Username","Search"})
	@Test
	public void parameter_demo(String url,String username,String search) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		System.out.println(username);
		driver.findElement(By.id("small-searchterms")).sendKeys(search);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
	}

}
