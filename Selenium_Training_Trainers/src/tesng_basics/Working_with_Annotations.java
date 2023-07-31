package tesng_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Working_with_Annotations {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Executing before suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("Executing after suite");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Executing before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("Executing after method");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Executing Before Test");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("Executing After test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Executing before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("Executing after class");
	}
	
	@Test
	public void DemoTest() {
		System.out.println("Executing Demo Test");
	}
	
	@Test
	public void DemoTest1() {
		System.out.println("Executing Demo Test1");
	}

}
