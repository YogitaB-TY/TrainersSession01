package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_CSSmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		/*String color_css=driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println(color_css);
		
		String font_size=driver.findElement(By.partialLinkText("Books")).getCssValue("font-size");
		System.out.println(font_size);*/
		
		System.out.println(driver.findElement(By.cssSelector("input[value='Search']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[value='Search']")).isEnabled());
		
		driver.findElement(By.id("pollanswers-3")).click();
		System.out.println(driver.findElement(By.id("pollanswers-3")).isSelected());
		
		driver.quit();
		
		

	}

}
