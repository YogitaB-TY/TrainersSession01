package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement>book_list=driver.findElements(By.xpath("//a[contains(text(),'Books')]"));
		//System.out.println(book_list);
		for(int i=0;i<=book_list.size()-1;i++) {
			String value=book_list.get(i).getText();
			System.out.println(value);
		}
		
		driver.quit();

	}

}
