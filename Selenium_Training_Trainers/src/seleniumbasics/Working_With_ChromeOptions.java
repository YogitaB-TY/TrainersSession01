package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Working_With_ChromeOptions {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
		options.addArguments("--disable-notifications");
		//options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");
		System.out.println(driver.getTitle());
		
	}

}
