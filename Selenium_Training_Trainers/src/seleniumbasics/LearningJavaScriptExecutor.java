package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningJavaScriptExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.oracle.com/in/java/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,3000);");
	}

}
