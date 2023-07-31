package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Select_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
		String value="Name: Z to A";
		
		//Identify the Select Tag Web Element 
		WebElement book_lst=driver.findElement(By.id("products-orderby"));
		
		//Create an object of Select Class
		Select sel=new Select(book_lst);
		List<WebElement> options = sel.getOptions();
		for(int i=0;i<=options.size()-1;i++) {
			WebElement values=driver.findElement(By.id("products-orderby"));
			Select book=new Select(values);
			if (options.get(i).getText().equalsIgnoreCase(value)) {
				book.selectByIndex(i);
				System.out.println("The Index is "+i);
				break;
			}
			
			Thread.sleep(1000);
			
		}
		
		
		driver.quit();
	}

}
