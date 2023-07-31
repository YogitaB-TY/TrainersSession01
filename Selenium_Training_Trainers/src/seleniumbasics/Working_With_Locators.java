package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		/*driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.partialLinkText("Reg")).click();
		driver.findElement(By.partialLinkText("oppi")).click();*/
		
		//using Class name Locator
		//driver.findElement(By.className("ico-register")).click();
		//driver.findElement(By.className("ico-login")).click();
		
		//using Tag name locator
		driver.findElement(By.tagName("input")).sendKeys("mobiles");
		

	}

}
