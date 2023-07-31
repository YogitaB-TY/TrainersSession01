package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_AbsoluteXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/Pradyumna/Java%20Selenium/Demo%20HTML%20Pages/xpath1.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Pradyumna");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("R");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("Test Yantra");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Bangalore");
		

	}

}
