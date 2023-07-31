package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/Pradyumna/Java%20Selenium/Demo%20HTML%20Pages/MultipleWindow.html");
		
		//Identify the Parent Window
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		//Click on Food sites button which will open the child windows 
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(2000);
		//get the child windows along with parent window
		Set<String>child_windows=driver.getWindowHandles();
		System.out.println(child_windows);
		
		// Switch to child windows
		for(String child_window:child_windows) {
			driver.switchTo().window(child_window);
			driver.close();
			Thread.sleep(1000);
		}
		
		
		

	}

}
