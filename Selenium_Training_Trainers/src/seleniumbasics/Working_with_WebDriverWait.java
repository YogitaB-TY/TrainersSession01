package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_WebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(3000);
		
		//WebDriverWait
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		
		//FluentWait wait=new FluentWait(driver);
		//wait.pollingEvery(1000, TimeUnit.MILLISECONDS);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[@class='result']"))));
		String result=driver.findElement(By.xpath("//strong[@class='result']")).getText();
		System.out.println(result);
		driver.quit();

	}

}
