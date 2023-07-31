package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_with_BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		// Browser methods
		driver.manage().window().maximize();
		//driver.get("https://www.google.co.in");
		
		//Navigate Browser methods
		driver.get("https://demowebshop.tricentis.com/");
		
	/*	driver.findElement(By.partialLinkText("gist")).click();
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.partialLinkText("oppi")).click();
		driver.findElement(By.partialLinkText("list")).click();*/
		//a[@class='ico-register']
		
		//driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("praveen");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		//driver.quit();
		
		//       //tagname[@AN='AV']
				 //tagname[contains(@AN,AV)]
				 //tagname[contains(text(),AV)]
		
		
	}

}
