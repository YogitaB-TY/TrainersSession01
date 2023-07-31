package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String register_text=driver.findElement(By.linkText("Register")).getText();
		System.out.println(register_text);
		
		String shopping_text=driver.findElement(By.partialLinkText("oppi")).getText();
		System.out.println(shopping_text);
		
		String edit_text=driver.findElement(By.id("small-searchterms")).getText();
		System.out.println(edit_text);
		
		String id_value=driver.findElement(By.id("small-searchterms")).getAttribute("id");
		System.out.println(id_value);
		
		//value atrribute
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		
		driver.quit();

	}

}
