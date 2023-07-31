package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningEnterValueJS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demoapp.skillrary.com/index.php");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		/*
		 * WebElement
		 * disabledTF=driver.findElement(By.xpath("//input[@class='form-control']"));
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].value='Hello';", disabledTF);
		 */
		WebElement hiddenTF=driver.findElement(By.id("displayed-text"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Hello';", hiddenTF);
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
	}

}
