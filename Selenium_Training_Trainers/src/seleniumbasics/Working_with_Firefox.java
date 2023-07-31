package seleniumbasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_with_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.close();

	}

}
