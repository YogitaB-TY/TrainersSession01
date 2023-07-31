package seleniumbasics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		/*WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions action=new Actions(driver);
		action.doubleClick(button).perform();
		Thread.sleep(2000);
		//HAndle the ALert 
		Alert ale=driver.switchTo().alert();
		ale.accept();*/
		
		/*driver.findElement(By.name("cusid")).sendKeys("5555");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		String message=driver.switchTo().alert().getText();
		System.out.println(message);
		driver.switchTo().alert().dismiss();
		
		driver.quit();*/
		
		//li[contains(@class,'context-menu-item context-menu-icon')]
		
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right')]"))).build().perform();
		
		Thread.sleep(1000);
		List<WebElement>menu=driver.findElements(By.xpath("//li[contains(@class,'context-menu-item context-menu-icon')]"));
		for(int i=0;i<=menu.size()-1;i++) {
			action.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right')]"))).build().perform();
			menu.get(i).click();
			Thread.sleep(1000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}
		driver.quit();
	}

}

