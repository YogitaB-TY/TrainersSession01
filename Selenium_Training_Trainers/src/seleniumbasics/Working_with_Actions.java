package seleniumbasics;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.source.doctree.AttributeTree.ValueKind;

public class Working_with_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		/*WebElement computer=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		
		//Creating an object for Actions Class
		Actions action=new Actions(driver);
		action.moveToElement(computer).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Desktop')])[1]"))).click().perform();*/
		
		//WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		//Actions action=new Actions(driver);
		//action.doubleClick(button).perform();
		
		//WebElement right_click=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		Actions action=new Actions(driver);
		//action.contextClick(right_click).perform();
		
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Rome'])[2]"))
				,driver.findElement(By.xpath("//div[text()='Italy']"))).perform();
		
		
	    
	   }

}
