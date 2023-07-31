package tesng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_DataProvider {
	
	
	@DataProvider(name = "TestData")
	public Object[][] testdata() {
		Object[][] data=new Object [2][5];
		data[0][0]="Pradyumna";
		data[0][1]="Ramachandra";
		data[0][2]="xxx@test.com";
		data[0][3]="aaaaa";
		data[0][4]="aaaaa";
		
		data[1][0]="Kavya";
		data[1][1]="J";
		data[1][2]="xxx@test.com";
		data[1][3]="aaaaa";
		data[1][4]="aaaaa";
		
		return data;
	}
	
	
	@Test(dataProvider = "TestData")
	public void dataDemo(String Firstname,String Lastname,String email,String pwd,String cpwd) {
		/*System.out.println(Firstname);
		System.out.println(Lastname);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(cpwd);*/
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
		driver.close();
		
	}

}
