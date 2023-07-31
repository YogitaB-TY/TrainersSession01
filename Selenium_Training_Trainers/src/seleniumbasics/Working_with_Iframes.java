package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/Pradyumna/Java%20Selenium/Demo%20HTML%20Pages/iframe.html");
		
		//Switch to DEmo web Shop frame
		//driver.switchTo().frame(0);
		WebElement frame=driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame);
		
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		driver.close();
	}

}
