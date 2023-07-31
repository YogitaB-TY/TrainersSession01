package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearningScreenshot {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshots/FirstScreenshot.png");
		FileHandler.copy(temp, dest);
		
		
	}
	
	public static void screenshotMethod(String screenshotName, WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./Screenshots/"+screenshotName+".png");
		FileHandler.copy(temp, dest);
	}

}
